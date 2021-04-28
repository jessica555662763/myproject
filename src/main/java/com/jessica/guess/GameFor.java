package com.jessica.guess;


import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
//        int sum =0;
//        for(int i=5;i>-1;i--){
//            System.out.println(i);
//        }
        int secret =new Random().nextInt(10)+1;
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=4;i++){
            int number=scanner.nextInt();
            System.out.println("time:"+ number);
            if(number>secret){
            System.out.println("lower");
        }else if(number<secret){
            System.out.println("higher");
        }else{
            System.out.println("guess the number"+number);
            break;
        }
    }
    }
}
