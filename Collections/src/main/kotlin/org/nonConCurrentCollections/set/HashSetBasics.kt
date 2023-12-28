package org.nonConCurrentCollections.set

import java.util.function.Consumer

object HashSetBasics {
    /*
    1. Duplicates are not allowed.
    2. Implementd using HashTable
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val set: Set<*> = HashSet<Any>()
        val set1 = HashSet<Int>() //preferred--not ordered and not shorted
        set1.add(10) // O(1) -- operations
        set1.add(20)
        set1.add(5)
        set1.add(1)
        set1.add(1)
        println(set1)

        println(set1.contains(10))
        println(set1.contains(10000)) // O(1) -- operation

        set1.forEach(Consumer { x: Int? -> println(x) })
        set1.remove(1) // O(1) -- operation
        println(set1)

        val iterator: Iterator<*> = set1.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }

        val linkedHashSet = LinkedHashSet<Any>() // implemented using LinkedList and HashTable -- Slower thank hashSet
        linkedHashSet.add(12)
        linkedHashSet.add("Awdawd")
        linkedHashSet.add(13.00)
        println(linkedHashSet)
    }
}
