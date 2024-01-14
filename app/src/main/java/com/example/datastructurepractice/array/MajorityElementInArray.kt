package com.example.datastructurepractice.array




fun main(args: Array<String>) {

    var array = arrayOf(8,8,6,6,6,4,6)

    var count = 1
    var res = 0

    for(i in 1 until  array.size)
    {
        if(array[res] == array[i])
        {
            count++
        }
        else
        {
            count--
        }
        if(count ==0)
        {
            count = 1
            res = i
        }
    }

    var flag = checkIfElementIsMajorityOrNot(res, array)
    if(flag == -1)
    {
        println("No Majority Element")
    }
    else{
        println("Majority Element  is = ${array[res]}")
    }

}

fun checkIfElementIsMajorityOrNot(res: Int, array: Array<Int>): Int {
    var count = 0
    for (i in 0 until array.size){
        if(array[i] == array[res])
        {
            count++
        }
    }
    return if(count > array.size/2)
    {
        count
    }
    else
    {
        -1
    }
}



