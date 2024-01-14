package com.example.datastructurepractice.array


fun main(args: Array<String>) {

    var array = arrayOf(10, 2, -2, -20, 10)

    var hashmap = hashMapOf<Int, Int>()
    var cSum = 0
    var sum = -10
    var flag = 0

    for(i in 0 until array.size)
    {
        cSum+= array[i]

        if(array[i] == 0 || sum == 0 || hashmap.containsKey(cSum))
        {
            flag = 1
            break
        }

        hashmap.put(cSum, i)

    }

    if (flag == 0) {
        println("Sub array not found")
    }
    else {
        println("Sub array found")
    }

    array.forEach {
        print("$it  ,")
    }
}