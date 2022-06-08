package com.flyman.test;

public class q4 {
    public static void main(String[] args) {
        kk k = new kk();
        k.conn(new Cat());
        k.conn(new Dog());
    }
}
class kk {
    public void conn(Animals a) {//调用方法
        a.eat();
        a.sleep();
    }
}

abstract class Animals {
    void sleep() {
        System.out.println("动物在睡觉");
    }
    void eat() {
        System.out.println("动物在吃饭");
    };
}
class Cat extends Animals {
    @Override
    void sleep() {//重写方法
        System.out.println("猫咪在睡觉");
    }

    @Override
    void eat() {
        System.out.println("猫咪在吃法");
    }
}

class Dog extends Animals {
    @Override
    void sleep() {
        System.out.println("狗子在睡觉");
    }

    @Override
    void eat() {
        System.out.println("狗子在吃饭");
    }
}
