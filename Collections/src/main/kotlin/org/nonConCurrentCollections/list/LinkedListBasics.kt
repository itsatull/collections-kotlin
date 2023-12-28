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
        val list: MutableList<Int> = LinkedList() // type defined can only store Integer values
        val timeTankentoInsert: MutableList<Long> = LinkedList()
        val timeTankentoInsert1: MutableList<Long> = LinkedList()
        var start: Long
        var finish: Long
        for (i in 0..999) {
            start = System.nanoTime()
            list.add(i)
            finish = System.nanoTime()
            val timeElapsed = finish - start
            timeTankentoInsert.add(timeElapsed)
        }
        println(list)
        println(timeTankentoInsert)
        for (i in 999 downTo -1 + 1) {
            start = System.nanoTime()
            list.removeAt(i)
            finish = System.nanoTime()
            val timeElapsed = finish - start
            timeTankentoInsert1.add(timeElapsed)
        }
        println(timeTankentoInsert1)
    }
}
