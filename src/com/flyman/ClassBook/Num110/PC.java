package com.flyman.ClassBook.Num110;

/**
 * @author 45023
 */
public class PC {
    CPU cpu;
    HardDisk hD;

    public void show() {
        System.out.println("pc-调用了show方法！");
        System.out.println("当前cpu的速度为：" + cpu.getSpeed() +
                ",银盘的容量为：" + hD.getAmount() );
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void sethD(HardDisk hD) {
        this.hD = hD;
    }
}
