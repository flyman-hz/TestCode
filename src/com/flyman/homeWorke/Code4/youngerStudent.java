package com.flyman.homeWorke.Code4;

public class youngerStudent extends Student {
    String happy;
    public youngerStudent(String name, String age, String sex, String classGroup, String nianJi,String happys) {
        super(name, age, sex, classGroup, nianJi);
        happy = happys;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("爱好：" + happy);
    }
}
