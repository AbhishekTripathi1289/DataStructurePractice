package com.example.datastructurepractice.linkedList


class MyLinkedList {

    var head: Node? = null
    var tail : Node? = null
    class Node {
        var next: Node? = null
        var data: Int? = 0

        constructor(data: Int) {
            this.data = data
        }
    }

    fun insertElementInLinkedList(data: Int)
    {
        var tempHead = head

        var newNode = Node(data)
        if(head == null)
        {
            head = newNode
            tail = newNode
        }
        else{
            while (tempHead?.next != null)
            {
                tempHead = tempHead.next
            }
            tempHead?.next = newNode
            tail = newNode
        }
    }

    fun printlnElementOfLinkedList()
    {
        var tempHead = head

        while (tempHead != null)
        {

            println("Node data = ${tempHead.data}")
            tempHead = tempHead.next
        }
    }
    fun printlnElementOfLinkedListRecusive(tempNode: Node?)
    {

        if(tempNode == null)
        {
            return
        }else
        {
            println("Node data = ${tempNode.data}")
            printlnElementOfLinkedListRecusive(tempNode.next)
        }
    }

    fun insertAtbeginOfLinkedList(data: Int) {
        var tempHead = head
        var node= Node(data)
        node.next = tempHead
        tempHead = node
        head = tempHead
    }

    fun insertAtEndOfLinkedList(data: Int)
    {
        var node= Node(data)
        tail?.next = node
        tail = node
    }
    fun deleteElementInLinkedList(data: Int)
    {
        var tempHead = head

        if(tempHead?.data == data)
        {
            head = tempHead.next
            tempHead.next = null
        }
        else
        {
            while (tempHead?.next?.data != data)
            {
                tempHead = tempHead?.next
            }

            if(tempHead?.next?.data == data)
            {
                tempHead?.next = tempHead?.next?.next
            }
        }
    }
    fun searchElementInLinekdList(data:Int){

    }

    fun deleteDuplicateElementInSortedLinkedList(){
        var tempHead = head

        while (tempHead?.next != null)
        {
            if(tempHead.data == tempHead.next?.data)
            {
                tempHead.next = tempHead?.next?.next
            }
            else{
                tempHead = tempHead.next
            }
        }
    }

    fun reverseLinkedList() {
     var current = head
     var previous: Node? = null
     var next: Node? = null

        while (current != null)
        {
            next = current.next
            current.next = previous
            previous = current
            current = next
        }
        head = previous
    }

}


fun main(args: Array<String>) {

    var myLinkedList = MyLinkedList()
    myLinkedList.insertElementInLinkedList(5)
    myLinkedList.insertElementInLinkedList(6)
    myLinkedList.insertElementInLinkedList(6)
    myLinkedList.insertElementInLinkedList(7)
    myLinkedList.insertElementInLinkedList(8)
    myLinkedList.insertElementInLinkedList(8)
    myLinkedList.insertElementInLinkedList(9)
    myLinkedList.insertAtbeginOfLinkedList(2)
    myLinkedList.insertAtEndOfLinkedList(222)

   myLinkedList.deleteElementInLinkedList(222)
//    myLinkedList.printlnElementOfLinkedList()
    //myLinkedList.deleteDuplicateElementInSortedLinkedList()
  /*  myLinkedList.reverseLinkedList()
    myLinkedList.printlnElementOfLinkedListRecusive(myLinkedList.head)*/




}





