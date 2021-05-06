package com.jessica.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass=60;
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        return (english>math)?english:math;
    }
    public void grading(){
        int average =getAverage();
        System.out.println(name+"\t"+english+"\t"+math+"\t"+(getAverage()>=60?"PASS":"FALIED"));
        char grading ='F';
        switch(average/10){
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';
        }

    }
    public int getAverage(){
        return (english+math)/2;
    }
}

