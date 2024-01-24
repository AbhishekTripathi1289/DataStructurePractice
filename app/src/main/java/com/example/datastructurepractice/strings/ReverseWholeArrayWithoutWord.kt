package com.example.datastructurepractice.strings

fun main(args: Array<String>) {

    var str = "Hello Abhishek Tripathi"

    var chararray = str.toCharArray()
    var finalString = ""

    var start = 0
    var end = 0
    var temp = ' '
    for (i in 0 until chararray.size)
    {
        if(chararray[i] == ' ')
        {
            end = i-1
            while(start< end)
            {
                temp = chararray[start]
                chararray[start] = chararray[end]
                chararray[end] = temp
                start++
                end--
            }
            start = i+1
        }
    }
    end = chararray.size-1
    while(start< end)
    {
        temp = chararray[start]
        chararray[start] = chararray[end]
        chararray[end] = temp
        start++
        end--
    }

    start = 0
    end = chararray.size-1

    while(start< end)
    {
        temp = chararray[start]
        chararray[start] = chararray[end]
        chararray[end] = temp
        start++
        end--

    }

    finalString = String(chararray)

    println(finalString)
}
