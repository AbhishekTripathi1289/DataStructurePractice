package com.example.datastructurepractice.array


fun main(args: Array<String>) {

    var array = arrayOf(1, 2, 3 ,4, 5, 6, 7)
    var i = 0

    while(i < array.size)
    {
        i++
    }

    array.forEach {
        print("$it  ,")
    }

}



