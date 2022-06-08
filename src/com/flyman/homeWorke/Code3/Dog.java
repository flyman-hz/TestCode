package com.flyman.homeWorke.Code3;

public class Dog extends Animas {
    @Override
    public int getLeg() {
        System.out.println("狗子有4条腿");
        return super.getLeg();
    }
    public void shout() {
        System.out.println("狗子汪汪汪！！！！！！！");
    }
}
