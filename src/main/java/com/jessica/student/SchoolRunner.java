package com.jessica.student;


import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("Please enter student name:");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's math:");
        int math=scanner.nextInt();
        System.out.println("Please enter student's english:");
        int english=scanner.nextInt();
        Student stu = new Student(name,english,math);
        System.out.println("High score:"+stu.highest());
    }
}
