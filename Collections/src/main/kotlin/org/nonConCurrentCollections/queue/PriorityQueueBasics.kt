package org.nonConCurrentCollections.queue

import java.util.*
import java.util.function.Consumer

object PriorityQueueBasics {
    @JvmStatic
    fun main(args: Array<String>) {
        val priorityQueue = PriorityQueue<Int>()
        priorityQueue.add(10)
        priorityQueue.add(20)
        priorityQueue.add(30)
        priorityQueue.add(2)
        priorityQueue.forEach(Consumer { x: Int -> println(x) })
    }
}
