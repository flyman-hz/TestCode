package com.flyman.algorithm10;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        //使用随机生成数进行数据测试
        long beginTime = System.nanoTime();
        int[] numbs = bigNumbsMore(10000, 800);
        long overTime = System.nanoTime();
        System.out.println("数据生成耗时：" + (overTime - beginTime) / 1000 + "微秒");
        //System.out.println("生成的大数据为：" + Arrays.toString(ints));

        //设定需要的数据格式内容
        //int[] numbs = {33, 123, 1, 34, 65, 99, 1200, 123};
        System.out.println("初始数据为长度为：" + numbs.length);
        System.out.println("==========================分割线==============================");
        //冒泡排序法
        long beginTimeBS = System.nanoTime();
        int[] BubbleSortNumbs = BubbleSort(numbs);
        long overTimeBS = System.nanoTime();
        System.out.println("冒泡排序时间为：" + (overTimeBS - beginTimeBS) / 1000 + "微秒");
        //System.out.println(Arrays.toString(BubbleSortNumbs));
        System.out.println("==========================分割线==============================");
        //选择排序法
        long beginTimeSS = System.nanoTime();
        int[] SelectSortNumbs = SelectSort(numbs);
        long overTimeSS = System.nanoTime();
        System.out.println("选择排序时间为：" + (overTimeSS - beginTimeSS) / 1000 + "微秒");
        //System.out.println(Arrays.toString(SelectSortNumbs));
        System.out.println("==========================分割线==============================");
        //插入排序
        long beginTimeIs = System.nanoTime();
        int[] InsertSortNumbs = InsertSort(numbs);
        long overTimeIS = System.nanoTime();
        System.out.println("插入排序时间为：" + (overTimeIS - beginTimeIs) / 1000 + "微秒");
        //System.out.println(Arrays.toString(InsertSortNumbs));
        System.out.println("==========================分割线==============================");
        //希尔排序
        long beginTimeSLS = System.nanoTime();
        int[] ShellSortNumbs = ShellSort(numbs);
        long overTimeSLS = System.nanoTime();
        System.out.println("希尔排序时间为：" + (overTimeSLS - beginTimeSLS) / 1000 + "微秒");
        //System.out.println(Arrays.toString(ShellSortNumbs));
        System.out.println("==========================分割线==============================");
        //归并排序
        long beginTimeMS = System.nanoTime();
        int[] mergeSortNumbs = MergeSort(numbs);
        long overTimeMS = System.nanoTime();
        System.out.println("归并排序时间为：" + (overTimeMS - beginTimeMS) / 1000 + "微秒");
        //System.out.println(Arrays.toString(mergeSortNumbs));

        long over = System.currentTimeMillis();

        System.out.println("运行时间为：" + (over - begin) / 1000 + "秒！");
    }
    public static int[] bigNumbsMore(int max,int len) {
        //做一个足够大的数据
        int[] bigNumbs = new int[len];

        for (int i = 0;i < len;i++) {
            Random random = new Random();
            int value = random.nextInt(max);
            bigNumbs[i] = value;
        }

        return bigNumbs;
    }

    /**
     * 冒泡排序的函数传值
     * 1、 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2、 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3、 针对所有的元素重复以上的步骤，除了最后一个。
     * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public static int[] BubbleSort(int[] numbs) {
        /*
          为了防止传来的数组数据被地址传值改变顺序，进而复制一个新的数组进行接送值
         */
        int[] sortNumbs = Arrays.copyOf(numbs, numbs.length);
        //双重循环遍历数值中的数值，进而进行排序比较
        for (int i = 1; i < sortNumbs.length; i++) {
            //定义一个flag,进行此次是否交换了数据
            boolean flag = true;
            for (int j = 0; j < sortNumbs.length - i; j++) {
                //判断前后两个值是否符合要求，进而进行操作
                if (sortNumbs[j] > sortNumbs[j + 1]) {
                    //小位大于大位，进行数据交换
                    int tmp = sortNumbs[j];
                    sortNumbs[j] = sortNumbs[j + 1];
                    sortNumbs[j + 1] = tmp;
                    //此时诺发生交换，故而将判断交换的值进行修改
                    flag = false;
                }
            }
            //优化判断，后方数据以及交换，故而跳出判断循环
            if (flag) {
                break;
            }
        }
        return sortNumbs;
    }

    /**
     * 选择排序
     * 1、首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     * 2、再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 3、重复第二步，直到所有元素均排序完毕。
     */
    public static int[] SelectSort(int[] numbs) {
        //复制数据
        int[] sortNumbs = Arrays.copyOf(numbs, numbs.length);
        //需要进行数据长度-1次循环
        for (int i = 0; i < sortNumbs.length - 1; i++) {
            //设定好一个最小（或者最大）的数据位
            int min = i;
            //寻找到当前的最小数据值
            for (int j = i + 1; j < sortNumbs.length; j++) {
                if (sortNumbs[j] < sortNumbs[min]) {
                    //满足小于条件进行赋值
                    min = j;
                }
            }
            if (min != i) {//找到了比min还小的值，进行数据交换
                int tmp = sortNumbs[min];
                sortNumbs[min] = sortNumbs[i];
                sortNumbs[i] = tmp;
            }
        }
        return sortNumbs;
    }

    /**
     * 插入排序
     * 1、将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
     * 2、从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
     * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
     */
    public static int[] InsertSort(int[] numbs) {
        //复制传来的数据数据
        int[] sortNumbs = Arrays.copyOf(numbs, numbs.length);
        //从标记为1的数据开始往前判断是否可以插入数据，由于0号位默认其数据为有序
        for (int i = 1; i < sortNumbs.length; i++) {
            //提取需要进行插入的数据
            int tmp = sortNumbs[i];
            //将提取的数据与前面已尽排好的序列进行一个一个比较，找到比其小的数据插入其后
            int j = i;
            while (j > 0 && tmp < sortNumbs[j - 1]) {
                //往排好序列的数据中寻找比其大的值则进行交换
                sortNumbs[j] = sortNumbs[j - 1];
                j--;
            }
            //判断是否进行了交换数据，存在既而进行插入操作
            if (j != i) {
                sortNumbs[j] = tmp;
            }
        }
        //返回排好序列的数据
        return sortNumbs;
    }

    /**
     * 希尔排序
     * 1、择一个增量序列 t1，t2，……，tk，其中 ti > tj, tk = 1
     * 2、按增量序列个数 k，对序列进行 k 趟排序；
     * 3、每趟排序，根据对应的增量 ti，将待排序列分割成若干长度为 m 的子序列，
     * 分别对各子表进行直接插入排序。仅增量因子为 1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     */
    public static int[] ShellSort(int[] numbs) {
        //进行数组数据复制
        int[] sortNumbs = Arrays.copyOf(numbs, numbs.length);
        //设置中间存值对象
        int tmp;
        //进行分组，一般取当前一半的数据作为组容量，其次分组容量减至1的时候为最终顺序序列
        for (int step = sortNumbs.length / 2; step >= 1; step = step / 2) {
            //以组内数据进行数据交换，使用插入排序数据
            for (int i = step; i < sortNumbs.length; i++) {
                //需要插入的值存入到中间数值中
                tmp = sortNumbs[i];
                //使得值往前进行插入排序
                int j = i - step;
                //进行插入排序，寻找需要插入的地址
                while (j >= 0 && sortNumbs[j] > tmp) {//满足前面的值大于当前值就进行数据交换
                    sortNumbs[i] = sortNumbs[j];//j+step = i，把大的值传给后一位进行交换
                    j -= step;//下一个数据进行比较，直至当前数据大于比较数据
                }
                sortNumbs[j + step] = tmp;
            }
        }
        //返回处理完成的值
        return sortNumbs;
    }

    /**
     * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
     * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置；
     * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
     * 4、重复步骤 3 直到某一指针达到序列尾；
     * 5、将另一序列剩下的所有元素直接复制到合并序列尾。
     */
    public static int[] MergeSort(int[] numbs) {
        //复制传来的数据
        int[] sortNumbs = Arrays.copyOf(numbs, numbs.length);
        //判断是否满足分组（必须大于两个元素）
        if (sortNumbs.length < 2) {
            return numbs;
        }
        //进行分组处理
        int middle = (int) Math.floor(sortNumbs.length / 2);
        //进行数组拆分，各一半进行数据比较
        int[] leftNumbs = Arrays.copyOfRange(sortNumbs, 0, middle);
        int[] rightNumbs = Arrays.copyOfRange(sortNumbs, middle, sortNumbs.length);
        return merge(MergeSort(leftNumbs),MergeSort(rightNumbs));
    }
    /**
     * 归并排序的换值处理
     */
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
