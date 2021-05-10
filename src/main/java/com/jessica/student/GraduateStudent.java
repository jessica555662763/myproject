package com.jessica.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass=70;

    @Override
    public void print() {

    }

    public GraduateStudent(String name, int english, int math, int thesis){
        super(name,english,math);
        this.thesis= thesis;
    }
}
