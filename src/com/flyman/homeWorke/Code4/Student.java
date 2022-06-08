package com.flyman.homeWorke.Code4;

public class Student {
    String name;
    String age;
    String sex;
    String classGroup;
    String nianJi;

    public Student(String name, String age, String sex, String classGroup, String nianJi) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classGroup = classGroup;
        this.nianJi = nianJi;
    }

    public void show() {
        System.out.println("姓名：" + name );
        System.out.println("年龄：" + age );
        System.out.println("性别：" + sex );
        System.out.println("班级：" + classGroup );
        System.out.println("年级：" + nianJi );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public String getNianJi() {
        return nianJi;
    }

    public void setNianJi(String nianJi) {
        this.nianJi = nianJi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", classGroup='" + classGroup + '\'' +
                ", nianJi='" + nianJi + '\'' +
                '}';
    }
}
