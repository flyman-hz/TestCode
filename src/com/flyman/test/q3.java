package com.flyman.test;

public class q3 {
    public static void main(String[] args) {
        Music music = new Music();//演奏家对象
        System.out.println("------------------");
        //弹钢琴
        Piano piano = new Piano();
        music.play(piano);
        System.out.println("------------------");
        //打鼓
        Gu gu = new Gu();
        music.play(gu);
        System.out.println("------------------");
        //吹箫
        Xiao xiao = new Xiao();
        music.play(xiao);
    }
}
/*
创建一个接口乐器，拥有一个sound方进行发出声音
 */
abstract class Instrument {
    public abstract void sound();
}
/*
实现乐曲类
 */
class Piano extends Instrument {
    //钢琴类
    @Override
    public void sound() {
        System.out.println("弹奏钢琴曲目-《病毒》");
    }
}
class Gu extends Instrument {
    //鼓类
    @Override
    public void sound() {
        System.out.println("鼓打的咚咚咚！！！！！！！");
    }
}
class Xiao extends Instrument {
    //萧
    @Override
    public void sound() {
        System.out.println("萧吹的呼呼呼！！！！");
    }
}
/*
演奏家类
 */
class Music {
    public void play(Instrument i) {
        i.sound();
    }
}
