package com.flyman.homeWorke.Code2;

public class CenterTest {
    public static void main(String[] args) {
        Wmain wmain = new Wmain();
        //使用继承方法进行操作数据
        wmain.setName("jack");
        wmain.setNationality("美国");
        System.out.println(wmain);
        //调用接口方法展示公共类
        wmain.showName();
        wmain.showNationality();
        //调用特有方法
        wmain.haveXizhi();

        Main main = new Main();
        main.setName("黄老板");
        main.setNationality("中国");
        System.out.println(main);
        main.showName();
        main.getNationality();
        main.showHouJie();


    }
}
