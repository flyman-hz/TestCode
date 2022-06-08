package com.flyman.homeWorke.code6;

public class MobilePhone {
    public SIM sim;
    public void usesSIM(SIM sim) {
        this.sim = sim;
    }
    public void printSome() {
        System.out.println("号码：" + sim.getNumber());
        System.out.println("运营商：" + sim.giveCope());
    }
}
