package com.flyman.homeWorke.Code4;

public class clooegeStudent extends Student{
    String type;

    public clooegeStudent(String name, String age, String sex, String classGroup, String nianJi , String types) {
        super(name, age, sex, classGroup, nianJi);
        type = types;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("专业属性：" + type);
    }
}
