package org.nonConCurrentCollections.list

import java.util.*

object LinkedListBasics {
    /*
      1).null insertion is allowed you can insert null value in LinkedList.
      2).it is good for frequent changes like remove,add at specific index.
      3).for searching it is not good.
      4).Random access is not possible (it has not implemented Random access interFace).
      5).it can store heterogeneous values in non-Generic LinkedList
      6).it's implemented Cloneable & Serializable,Deque interface.
      7).Each object inside the LinkedList is node.
      8).Internally Represented by Doubly Linked list.

     */
    @JvmStatic
    fun main(args: Array<String>) {
        val list = LinkedList<Any>() // type defined can only store Integer values
        val timeTankentoInsert: MutableList<Long> = LinkedList()
        val timeTankentoInsert1: MutableList<Long> = LinkedList()
        var start: Long
        var finish: Long
        // add at the Head (Begning)
        list.add(5)
        list.addFirst(10) //recomended way
        list.addFirst(15)
        list.addFirst(20)
        list.addFirst(21)
        list.addFirst(22)
        list.addFirst(25) //recomended way

        list.remove(22) // O(N) -- operation

        //remove element from begning
        list.removeFirst() //recomended way

        //add elemnt att tail
        list.addLast(200000) //recomended

        //remove elemnt form tail
        list.removeLast() // recomended way


        //get first element
        println(list.first())

        //get last element
        println(list.last())
    }
}
