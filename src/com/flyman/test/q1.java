package com.flyman.test;

public class q1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1 ;i <= 10 ;i ++) {
            int smallSum = 1;
            for (int j = i; j >=1 ; j--) {
                smallSum = smallSum * j;
            }
            sum = smallSum + sum;
        }
        System.out.println("1-10的阶乘和为：" + sum);
    }
}
