package com.hank.MC


import java.io.File
import java.util.regex.Pattern


fun main() {
    val mcDonalds = McDonalds()
    mcDonalds.printMenu()
}

class McDonalds {
    val menu = HashMap<String, Item1>()

    init {
        val br = File("mcdonalds.txt").bufferedReader()
        var line = br.readLine()
        while(line != null) {
            val tokens = line.split(Pattern.compile(","))
            val item1 = Item1(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]))
            menu.put(item1.id, item1)
            line = br.readLine()
        }
    }

    fun printMenu() {
        for (entry in menu.entries) {
            println(entry.value)
        }
    }
}



data class Item1(val id: String, val name: String, val calorie: Int, val price: Int){

    override fun toString(): String {
        return "$id\t$name\t$calorie\t$price"
    }
}



