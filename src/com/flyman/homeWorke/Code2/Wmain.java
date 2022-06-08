package com.flyman.homeWorke.Code2;

public class Wmain extends Constant implements People{

    public void haveXizhi() {
        System.out.println("女性更细心");
    }

    @Override
    public void showName() {
        System.out.println("这个女人的名字是：" + getName());
    }

    @Override
    public void showNationality() {
        System.out.println("这个女人的国家是：" + getNationality());
    }
}
