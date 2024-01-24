package com.example.datastructurepractice.strings

fun main(args: Array<String>) {

    var str = "geeksforgeeks"

    var chararray = str.toCharArray()

    var left = 0
    var right = 0
    var maxLen = 0
    var asciiArray = BooleanArray(256)

    while (right < chararray.size)
    {

        if(asciiArray[chararray[right].code] == true)
        {

            while (asciiArray[chararray[left].code])
            {
                asciiArray[chararray[left].code] = false
                left++
            }
        }

        asciiArray[chararray[right].code] = true
        maxLen= Math.max(maxLen, (right -left) +1)
        right++
    }

    println("Maximum length = $maxLen")
}