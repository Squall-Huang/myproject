package com.hank.MC


import java.io.File


fun main() {
    val mcDonalds = McDonalds("mcdonalds.txt")
    mcDonalds.printMenu()
}

class McDonalds (file: String){
    val menu = HashMap<String, Item>()

    init {
        /*val br = File("mcdonalds.txt").bufferedReader()
        var line = br.readLine()
        while(line != null) {
            val tokens = line.split(Pattern.compile(","))
            val item1 = Item1(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]))
            menu.put(item1.id, item1)
            line = br.readLine()
        }*/
        File(file).bufferedReader().lines().forEach {
            val tokens = it.split(",")
            val item = Item(tokens[0], tokens[1], tokens[2].toInt(), tokens[3].toInt())
            menu.put(item.id, item)
        }
    }

    fun printMenu() {
        for (entry in menu.entries) {
            println(entry.value)
        }
    }
}



data class Item(val id: String, val name: String, val calorie: Int, val price: Int){

    override fun toString(): String {
        return "$id\t$name\t$calorie\t$price"
    }
}



