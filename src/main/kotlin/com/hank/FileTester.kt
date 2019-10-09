package com.hank

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
//    writeTest()
}

private fun writeTest() {
    //    File("output.txt").writeText("abc123")
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}