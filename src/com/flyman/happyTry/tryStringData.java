package com.flyman.happyTry;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tryStringData {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        System.out.println(time);
    }
}
