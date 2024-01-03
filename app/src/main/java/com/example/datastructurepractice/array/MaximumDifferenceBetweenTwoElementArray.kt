package com.example.datastructurepractice.array



fun main(args: Array<String>) {

    var array = arrayOf(4, 1, 3, 10, 6, 4, 88, 1)
    var i = 1
    var sm = array[0];
    var maxDiff = 0
    var currDiff = 0

    while(i < array.size)
    {
        currDiff = array[i] - sm
        if(currDiff > maxDiff)
        {
            maxDiff = currDiff
        }
        if(array[i] < sm)
        {
            sm = array[i]
        }
        i++
    }

    println("maximum diff = $maxDiff")
}