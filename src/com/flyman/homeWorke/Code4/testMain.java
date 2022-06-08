package com.flyman.homeWorke.Code4;

public class testMain {
    public static void main(String[] args) {
        youngerStudent youngerStudent =
                new youngerStudent("小黄卓", "18", "男",
                        "8班", "一年级","吹牛皮");
        youngerStudent.show();
        System.out.println("-------------------------------------------------");

        middleStudent middleStudent =
                new middleStudent("中黄卓", "20", "男",
                        "九班", "高三", "理科");
        middleStudent.show();
        System.out.println("--------------------------------------------------");

        clooegeStudent clooegeStudent = new clooegeStudent("大黄卓", "22", "男",
                "一班", "大二", "工科-计算机类");
        clooegeStudent.show();
    }
}
