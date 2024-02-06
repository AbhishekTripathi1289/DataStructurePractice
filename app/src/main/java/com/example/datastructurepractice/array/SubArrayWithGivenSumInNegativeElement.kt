package com.example.datastructurepractice.array


fun main(args: Array<String>) {

    var array = arrayOf(10, 2, -2, -20, 10)





















    var hashmap = hashMapOf<Int, Int>()
    var cSum = 0
    var sum = -10
    var start = 0
    var end = 0

    for(i in 0 until array.size)
    {
        cSum+= array[i]

        if (cSum - sum == 0) {
            start = 0;
            end = i;
            break;
        }
        if(hashmap.containsKey(cSum - sum))
        {
            start = hashmap.get(cSum - sum)!! + 1
            end = i
            break
        }
        hashmap.put(cSum, i)

    }

    if (end == -1) {
        println("Sub array not found")
    }
    else {
        println("Sub array found between index $start to $end")
    }

    array.forEach {
        print("$it  ,")
    }
}