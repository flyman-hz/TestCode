package com.flyman.homeWorke.code6;

public class ChinaMB extends SIM{
    int number;
    @Override
    int getNumber() {
        return number;
    }

    @Override
    void setNumber(int number) {
        this.number = number;
    }

    @Override
    String giveCope() {
        return "中国移动";
    }
}
