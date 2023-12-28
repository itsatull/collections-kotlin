package org.nonConCurrentCollections.queue

import java.util.*

object DequeBasics {
    /*
        *.FIFO principle -- first in first out
        *.Deque : implmented using Stack + Queue

     */
    @JvmStatic
    fun main(args: Array<String>) {
        val queue = ArrayDeque<Any>()
        // add at the Head (Begning)
        queue.push(5)
        queue.push(10)
        queue.push(15)
        queue.push(20)
        queue.push(21)
        queue.push(22)
        queue.addFirst(25) //recomended way

        //remove element from begning
        queue.remove()
        queue.removeFirst() //recomended way
        queue.pop()

        //add elemnt att tail
        queue.add(2000)
        queue.addLast(200000) //recomended
        queue.offer(20000000)

        //remove elemnt form tail
        queue.removeLast() // recomended way


        //get first element
        println(queue.first)

        //get last element
        println(queue.last)


        println(queue)
    }
}
