package org.nonConCurrentCollections.set

import java.util.*

object TreeSetBasics {
    /*
        *TreeSet is represented by Red-Black tree.
        *TreeSet id not a thread-safe
        *Treeset use default natual odering. // for literal values
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val treeSet: MutableSet<Int> = TreeSet() // uses red black tree logic for implementaation
        val treeset1 = TreeSet<Any>()
        treeSet.add(10) // int float string are literal values though taken as objects so natural odering is threre
        treeSet.add(6)
        treeSet.add(999)
        treeSet.add(22)
        println(treeSet)

        treeset1.add(Person("Atul", 22)) // you will get class cast exception.
        treeset1.add(Person("Vijay", 23))
        treeset1.add(Person("Rahul", 24))
        treeset1.add(Person("Ravi", 25))
        treeset1.add(Person("Ravindra", 26))
        println(treeSet)
    }
}
