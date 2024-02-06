package com.example.datastructurepractice.array

fun main(args: Array<String>) {
    var array = arrayOf(-1, -1, -1, -1, 1, -1, 1, 1, -1, -1, 1)

















    var hashmap = hashMapOf<Int, Int>()
    hashmap.put(0, -1)
    var start = 0
    var end = 0
    var max = 0
    var sum = 0

    for(i in 0 until array.size)
    {
        sum += array[i]
        if(hashmap.containsKey(sum))
        {
            if(i - hashmap.get(sum)!! +1 > max)
            {
                max = i - hashmap.get(sum)!! +1
                start = hashmap.get(sum)!! + 1
                end = i
            }
        }
        if(!hashmap.containsKey(sum))
        {
            hashmap.put(sum , i)
        }

    }

    println("Maximum subarray is from $start to $end")
    /*array.forEach {
        print("$it  ,")
    }*/
}