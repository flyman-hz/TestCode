package com.flyman.homeWorke.code6;

public class ChinaUM extends SIM{
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
        return "中国联通";
    }
}
