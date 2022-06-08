package com.flyman.homeWorke.Code3;

public class Cat extends Animas{
    @Override
    public int getLeg() {
        System.out.println("猫也有4条腿！");
        return super.getLeg();
    }

    public void findFood() {
        System.out.println("猫会抓老鼠！");
    }
}
