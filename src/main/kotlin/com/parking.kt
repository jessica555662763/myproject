package com

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2018,12,25,8,0,)
    val leave =LocalDateTime.of(2018,12,25,10,8)
    val car= Car("AAA-123",enter)
    car.leave=leave
    println(car.duration())
    val hours =Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class parking {
}
class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null
    set(value){
        if(enter.isBefore(value))
            field= value
    }
    fun duration() =Duration.between(enter,leave).toMinutes()

}