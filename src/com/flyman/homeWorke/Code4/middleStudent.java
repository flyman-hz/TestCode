package com.flyman.homeWorke.Code4;

public class middleStudent extends Student{
    String subject;
    public middleStudent(String name, String age, String sex, String classGroup, String nianJi, String subjects) {
        super(name, age, sex, classGroup, nianJi);
        subject = subjects;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("科类：" + subject);
    }
}
