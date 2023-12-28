package org.nonConCurrentCollections.list

import java.util.*
import java.util.Vector as Vector1

object StackBasics {
    // in java Stack is a child class of vector
    @JvmStatic
    fun main(args: Array<String>) {

        val stack = Stack<Any>() //non generic stack
        val stack1 = Stack<Int>() // generic stack
        stack.push(10)
        stack.push(20)
        stack.push(30)
        stack.push(40)
        println(stack)
        stack.add(25)

        //Note add,push work same in stack
        while (stack.size > 0) {
            println(stack.peek()); // peack is same as top() in cpp
            stack.pop();
            println(stack.pop())
        }
        val iterator = stack.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
}
