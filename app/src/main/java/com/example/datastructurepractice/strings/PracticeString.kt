package com.example.datastructurepractice.strings



fun main(args: Array<String>) {

    var str = "Hello Abhishek Tripathi"

    var chararray = str.toCharArray()
    var finalString = ""

    for (i in 0 until chararray.size)
    {
        println(chararray[i])
    }

    finalString = String(chararray)

    println(finalString)
}




/*var str = "Hello Abhishek Tripathi"

var chararray = str.toCharArray()
var finalString = ""

for (i in 0 until chararray.size)
{
    println(chararray[i])
}

finalString = String(chararray)

println(finalString)*/
