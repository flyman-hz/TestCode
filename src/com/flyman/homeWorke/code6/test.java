package com.flyman.homeWorke.code6;

public class test {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        //联通卡使用
        ChinaUM chinaUM = new ChinaUM();
        chinaUM.setNumber(123456);
        mobilePhone.usesSIM(chinaUM);
        mobilePhone.printSome();
        //移动卡使用
        ChinaMB chinaMB = new ChinaMB();
        chinaMB.setNumber(7654321);
        mobilePhone.usesSIM(chinaMB);
        mobilePhone.printSome();
    }
}
