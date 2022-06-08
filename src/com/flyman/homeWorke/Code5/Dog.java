package com.flyman.homeWorke.Code5;

public class Dog implements Animal{

    @Override
    public void cry() {
        System.out.println("汪汪汪。。。");
    }

    @Override
    public void getAnimalName() {
        System.out.println("dog dog dog");
    }
}
