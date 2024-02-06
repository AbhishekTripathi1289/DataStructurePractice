package com.example.datastructurepractice.array



fun main(args: Array<String>) {
    var array = arrayOf(2, 3, -7, 6, 8, 1, -10, 15)

    var i = 0
    var temp = 0
    while(i < array.size)
    {

        if(array[i] > 0 && array[i] < array.size)
        {
            if(array[i] != i+1)
            {
                temp = array[array[i]-1]
                array[array[i]-1] = array[i]
                array[i] = temp
            }
            else
            {
                i++
            }
        }
        else{
            i++
        }
    }

    var counter = 1
    array.forEach {
        if(counter == it)
        {
            counter++
        }
        else
        {
            println("$counter missing" )
        }
    }
}