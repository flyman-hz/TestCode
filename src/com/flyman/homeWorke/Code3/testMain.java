package com.flyman.homeWorke.Code3;

public class testMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("大黄");
        dog.setAge(3);
        dog.getLeg();
        System.out.println(dog.getName() + "有" + dog.getAge() + "岁了！");

        Cat cat = new Cat();
        cat.setName("毛毛");
        cat.setAge(1);
        System.out.println(cat.getName() + "现在" + cat.getAge() + "岁了!");
        cat.findFood();
        cat.getLeg();
    }
}
