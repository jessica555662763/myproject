package com.student

import java.util.*

class GameFor {
}

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner=Scanner(System.`in`)
    for(i in 1..4){
        print("please enetr a number(${i}/4):")
        var number = scanner.nextInt()
        print("第${i}次$number")
        if(number>secret){
            println("lower")
        }else if (number<secret){
            println("higher")
        }else {
            println("Great,the number is" + secret)
            break;
        }
    }    }