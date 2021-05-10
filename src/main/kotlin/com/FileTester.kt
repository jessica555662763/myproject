package com

import java.io.BufferedWriter
import java.io.File

fun main() {
    File("data.txt").bufferedReader().readLine().lines().forEach {
        println(it)
    }
//        write()
}

private fun write(): (BufferedWriter) -> Unit = {
    it.write("123\n")
    it.write("4\n")
    it.write("1\n")

}

class FileTester {
}