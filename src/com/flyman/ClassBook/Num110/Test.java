package com.flyman.ClassBook.Num110;

/**
 * @author 45023
 */
public class Test {

    public static void main(String[] args) {
        //1、创建cpu，并且写入数据
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        //2、创建disk，并且写入到数据
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        //3、创建一个pc对象
        PC pc = new PC();
        //4、调用方法
        pc.setCpu(cpu);
        pc.sethD(disk);
        pc.show();
    }
}
