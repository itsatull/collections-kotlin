package org.map

import java.util.*

object test {
    @JvmStatic
    fun main(args: Array<String>) {
        val set: Set<Int> = HashSet()
        val ans = IntArray(2)
        println(ans)

        //map doesnt maintains order of elements in which you have added elements.
        val map: MutableMap<Int, String> = HashMap()

        //it maintains order(key ke according) of elements in which you have added elements.
        val map1: MutableMap<Int, String> = LinkedHashMap()

        //sort the element based upon key
        val map2: MutableMap<Int, String> = TreeMap()

        //key can not be duplicate
        //value can be duplicate
        map[5] = "atul"
        map[10] = "atul"
        map[5] = "java" // override the value at the 5
        map[18] = "rahul"
        map[99] = "ravi"
        map[9] = "ravi"
        map[10] = "RAJAT"

        println(map)

        //duplicate key not recomended.
        //value can be duplicate
        //cant maintain order,no sorting.
        map1[5] = "atul"
        map1[10] = "atul"
        map1[5] = "java" // override the value at the 5 key
        map1[18] = "rahul"
        map1[99] = "ravi"
        map1[9] = "ravi"
        map1[10] = "RAJAT"

        println(map1)

        //duplicate key not recomended.
        //value can be duplicate.
        //sorting.
        map2[5] = "atul"
        map2[10] = "atul"
        map2[5] = "java" // override the value at the 5 key
        map2[18] = "rahul"
        map2[99] = "ravi"
        map2[9] = "ravi"
        map2[10] = "RAJAT"

        println(map2)
        val i = map[5]

        println(map[5]) //o(1) operation
        println(map1[5]) //o(1) operation
        println(map2[5]) //o(log n) operation
    }
}
