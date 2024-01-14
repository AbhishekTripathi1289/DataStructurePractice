package com.example.datastructurepractice.array


/*Array should be sorted*/

fun main(args: Array<String>) {

    var array = arrayOf(0, 2, 5, 8,9, 44)
    var sum = 19
    var remSum = 0
    var left = 0
    var right = 0

    for(i in 0 until array.size-2)
    {
        remSum = sum- array[i]

        left = i+1
        right = array.size-1

        while (left < right)
        {
            if(array[left]+ array[right]== remSum)
            {
                println("Triplet Found")
                break
            }
            else if((array[left]+ array[right]) < remSum)
            {
                left++
            }
            else
            {
                right--
            }
        }
    }
    /*array.forEach {
        print("$it  ,")
    }*/
}