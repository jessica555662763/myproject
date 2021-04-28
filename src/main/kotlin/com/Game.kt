package com

import java.util.*
import kotlin.collections.RandomAccess

fun main() {
    val secret =Random().nextInt(10)+1
//    val scanner=Scanner(System.`in`)
    var number =0
    while (number!=secret){
        println("plese enter number:")
        number = readLine()!!.toInt()
    if (number> secret){
        println("lower")
    }else if(number<secret){
        println("higher")
    }else{
        println("the number is$number")
    }
    }
}