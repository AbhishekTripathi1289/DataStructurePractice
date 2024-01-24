package com.example.datastructurepractice.strings



fun main(args: Array<String>) {

    var str = "abcd"
    var rString = "dabc"
    var newString = str.plus(str)

    if(newString.indexOf(rString) != -1)
    {
        println("Rotation String Found ${newString.indexOf(rString)}")
    }
    else
    {
        println("Rotation String not Found")
    }
}
