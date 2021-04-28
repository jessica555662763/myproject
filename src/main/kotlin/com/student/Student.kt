package com.kotlin

import java.util.*
import kotlin.math.max

class Student(var name :String?,var math: Int,var english:Int) {
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading()= when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun passOrFailed()=if(getAverage()>=60)"PASS" else "FAILED"
    fun getAverage()=(math+english)/2

    fun nameCheck(){
        print(name?.length)

    }
    fun highest()= if(english>math)english else math

}


fun main(args: Array<String>) {
    val stu= Student("Hank",90,80)
    println("High score:${stu.highest()}")
    stu.print()
}


