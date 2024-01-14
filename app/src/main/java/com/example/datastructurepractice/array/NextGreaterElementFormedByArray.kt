package com.example.datastructurepractice.array

fun main(args: Array<String>) {
    var array = arrayOf(2, 1, 8, 7, 6, 5)

    var smIndex = array.size-1
    var temp = 0
    for(i in array.size-2 downTo 0)
    {
        if(array[i] < array[smIndex])
        {
            temp = array[i]
            array[i] = array[smIndex]
            array[smIndex] = temp
            break
        }else if(array[i] < array[smIndex]) {
            smIndex = i
        }
    }

    array.forEach {
        print("$it  ,")
    }
}
