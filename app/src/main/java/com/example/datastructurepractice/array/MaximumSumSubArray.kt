package com.example.datastructurepractice.array


fun main(args: Array<String>) {

    var array = arrayOf(2, 3, -8, 7, -1, 2, 3)


























    var i = 0
    var currSum = 0
    var maxSum = 0

    for (i in 0 until  array.size) {
        currSum += array.get(i)
        if (currSum > maxSum) {
            maxSum = currSum
        }
        if (currSum < 0) {
            currSum = 0
        }
    }
    println(maxSum)
}
