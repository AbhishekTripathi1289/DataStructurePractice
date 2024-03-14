package com.example.datastructurepractice.array

fun main(args: Array<String>) {
    var array = arrayOf(2, 2, 2, 0 , 0, 0, 1, 1, 1)





























    var low = 0
    var high = array.size-1
    var mid = 0
    var temp = 0
    while(mid < high)
    {
        if(array[mid] == 0)
        {
            temp = array[mid]
            array[mid] = array[low]
            array[low] = temp
            low++
            mid++

        }
        else if(array[mid] == 1)
        {
            mid++
        }
        else
        {
            temp = array[mid]
            array[mid] = array[high]
            array[high] = temp
            high--
        }

    }

    array.forEach {
        print("$it  ,")
    }
}


