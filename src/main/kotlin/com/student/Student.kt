package com.kotlin

open class Student(var name :String?,var math: Int,var english:Int) {
    companion object{
        val pass=60
        fun test(){
            println("testing")
        }
    }
class GraduateStudent(name: String?,english: Int,math: Int,thesis:Int):Student(name,english,math){
    companion object{
        var pass=70
    }
}

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
   protected fun grading()= when (getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun passOrFailed()=if(getAverage()>= pass)"PASS" else "FAILED"
    fun getAverage()=(math+english)/2

    fun nameCheck(){
        print(name?.length)
    }
    fun highest()= if(english>math)english else math

}


fun main(args: Array<String>) {
    val stu1= Student("Hank",90,80)
    val stu2= Student("A",60,50)
    val stu3= Student("B",10,10)
    stu1.print()
    stu2.print()
    stu3.print()
//    println("High score:${stu.highest()}")\
}


