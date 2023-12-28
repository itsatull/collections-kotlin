package org.nonConCurrentCollections.list

import java.util.*
import java.util.function.Consumer

object VectorsBasics {
    @JvmStatic
    fun main(args: Array<String>) {
        val vector = Vector<Any>()
        val vector1 = Vector<Int>()
        val vector2 = Vector<Int>(50)

        val linkedList = LinkedList<Int>()
        val linkedList1 = LinkedList<Int>()
        vector.add(10)
        vector.add(null)
        vector.add("2e12e")
        vector.add('e')
        var i = 0
        while (i < 50) {
            vector1.add(i)
            vector2.add(i)
            linkedList.addLast(vector1.capacity())
            linkedList1.addLast(vector2.capacity())
            i++
        }
        vector1.forEach(Consumer { x: Int? -> println(x) })
        linkedList.forEach(Consumer { x: Int? -> println(x) })
        println(vector1)
        println(linkedList)
        println(linkedList1)
        println(linkedList.pollLast()) // poll work same as remove
        println(linkedList)
    }
}
