package com.example.datastructurepractice.array

fun main(args: Array<String>) {

    var array = arrayOf(0, 0, 1, 3, 8, 5, 0, 10, 0, 20, 0, 0)

    var i = 0
    var index = 0
    var temp = 0

    while(i < array.size)
    {
      if(array[i] != 0)
      {
            temp = array[index]
            array[index] = array[i]
            array[i] = temp
            index += 1
        }
        i++
    }

    array.forEach {
        print("$it  ,")
    }
}