package com.example.datastructurepractice.array

fun main(args: Array<String>) {
    var array = arrayOf(1, -2, -3, -4, -5, -6, 7, 8, 9, 10)

    var j = array.size-1
    var temp = 0
    var i = 0

    while(i< j)
    {

        if(array[i] > 0)
        {
            i++
        }
        if(array[j] < 0)
        {
            j--
        }
        if(array[i] < 0 && array[j] > 0)
        {
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }


    var k = 0
    while(k< array.size && i < array.size)
    {

        temp = array[k]
        array[k] = array[i]
        array[i] = temp
        i++
        k+=2

    }
    array.forEach {
        print("$it  ,")
    }
}