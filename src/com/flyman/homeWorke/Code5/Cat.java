package com.flyman.homeWorke.Code5;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("嘤嘤嘤。。。");
    }

    @Override
    public void getAnimalName() {
        System.out.println("cat cat cat");
    }
}
