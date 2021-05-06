package com

import java.time.LocalDate
import java.time.LocalDateTime

fun main() {
    val parkingLot = HashMap<String,Car?>()
    var enter =LocalDateTime.of(2018,12,25,8,0,0)
    var car :Car =Car ("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car=Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    var leave = LocalDateTime.of(2018,12,25,9,0,0)
//    car =parkingLot.get("AAA-0001")
    car?.leave =leave
    println("$car.id duration:${car?.duration()}")



//    val list = listOf(8,5,5,6,2)
//    val scores = listOf(68,88,75,50)
//    for (score in scores){
//        println(score)
//    }
//    println(list.get(3))
//    var mutableList = mutableListOf(5,1,2,7)
//    mutableList.add(6)
//    println(mutableList)

}

class Many {
}