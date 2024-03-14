package com.example.datastructurepractice.array


/*Find sub array which have continues even and odd element in array*/
fun main(args: Array<String>) {

    var array = arrayOf(10, 12, 8, 4)














    var curLen = 1
    var maxLen = 1

    for(i in 0 until  array.size-1)
    {
        if((array[i]%2== 0 && array[i+1]%2 !=0)  ||  (array[i]%2 != 0 && array[i+1]%2 == 0))
        {
            curLen += 1
        }
        else{
            curLen = 1
        }
        if(curLen > maxLen)
        {
            maxLen = curLen
        }
    }

    println("Maximum length = $maxLen")
}
