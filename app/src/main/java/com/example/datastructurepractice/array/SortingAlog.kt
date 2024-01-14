package com.example.datastructurepractice.array



fun main(args: Array<String>) {

    var array = arrayOf(5, 1, 3, 4, 2 , 10, 9, 8, 12)

    var temp = 0
    for(i in 0 until array.size)
    {
        for(j in 1 until array.size-i)
        {
            if(array[j-1] > array[j])
            {
                temp = array[j]
                array[j] = array[j-1]
                array[j-1] = temp
            }
        }
    }

    array.forEach {
        print("$it  ,")
    }
}
