package com.flyman.homeWorke.Code2;

public class Main extends Constant implements People {

    //男人实现接口

    public void showHouJie() {
        System.out.println("男性特征有喉结");
    }

    @Override
    public void showName() {
        System.out.println("这个男人的名字是：" + getName());
    }

    @Override
    public void showNationality() {
        System.out.println("这个男人的国家是：" + getNationality());
    }
}
