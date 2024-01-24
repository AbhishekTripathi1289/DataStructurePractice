package com.example.datastructurepractice.stack

class StackImplementtationUsingArray
{
    class StackUsingArray<T>{
        private var arraylist = mutableListOf<T>()
        private var cIndex = -1

        fun push(element: T)
        {
            arraylist.add(element)
        }
        fun pop(): T
        {
            var result: T
            if(arraylist.size == 0)
            {
                println("Stack is underloaded")
                result = -1 as T
            }
            else{
                result = arraylist.get(arraylist.size-1)
                arraylist.removeAt(arraylist.size-1)
            }
            return result
        }
        fun peek(): T{
            var result: T
            if(arraylist.size == 0)
            {
                println("Stack is underloaded")
                result = -1 as T
            }
            else{
                result = arraylist.get(arraylist.size-1)
            }
            return result
        }
        fun isEmpty(): Boolean
        {
            return arraylist.size == 0
        }

        fun size(): Int
        {
            return arraylist.size
        }
    }

}

fun main(args: Array<String>) {

    var stackUsingArray = StackImplementtationUsingArray.StackUsingArray<String>()
    stackUsingArray.push("abhishke")
   /* stackUsingArray.push(2)
    stackUsingArray.push(3)
    stackUsingArray.push(4)
    stackUsingArray.push(5)
    stackUsingArray.push(6)*/
    println(stackUsingArray.peek())
    println(stackUsingArray.pop())
    println(stackUsingArray.pop())





}