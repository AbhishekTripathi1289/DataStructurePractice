package com.example.datastructurepractice.array


/*Array should be sorted*/
fun main(args: Array<String>) {

    var array = arrayOf(1, 2, 3, 4, 13)




















    var currentValue = 1

    for (i in 0 until array.size) {

        if (array[i] <= currentValue) {
            currentValue += array[i]
        } else {
            break
        }
    }
    println("value = $currentValue")
}