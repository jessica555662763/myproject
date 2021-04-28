package com

fun main() {
    var s:String? = "abcde"
    s=null
    print(s?.get(2))
    print(s?.substring(2))
}
