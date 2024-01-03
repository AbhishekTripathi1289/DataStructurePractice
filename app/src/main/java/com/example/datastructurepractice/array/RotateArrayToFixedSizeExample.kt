package com.example.datastructurepractice.array



fun main(args: Array<String>) {

    var array = arrayOf(1, 2, 3 ,4, 5, 6, 7)

    var indexToRotate = 3

    reverseArray(array, 0, indexToRotate -1)
    reverseArray(array, indexToRotate, array.size-1)
    reverseArray(array, 0, array.size-1)

    array.forEach {
        print("$it  ,")
    }

}


fun reverseArray(array: Array<Int>, start: Int, end: Int)
{
    var temp = 0
    var left = start
    var right = end
    while (left < right)
    {
        temp = array[left]
        array[left] = array[right]
        array[right] = temp
        left++
        right--
    }
}

