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
        map.put(5,"atul")
        map.put(18,"atul")
        map.put(5,"java")
        map.put(99,"ravi")
        map.put(10,"atul")
        println(map)

        //duplicate key not recomended.
        //value can be duplicate
        //cant maintain order,no sorting.
        map1.put(5,"atul")
        map1.put(10,"atul")
        map1.put(5,"rahul")// override the value at the 5 key
        map1.put(18,"rahul")
        map1.put(99,"RAJAT")
        println(map1)

        //duplicate key not recomended.
        //value can be duplicate.
        //sorting.
        map2.put(5,"atul")
        map2.put(10,"atul")
        map2.put(5,"rahul")// override the value at the 5 key
        map2.put(18,"rahul")
        map2.put(99,"RAJAT")

        println(map2)
        val i = map[5]  //--->

        println(map.get(5)) //o(1) operation
        println(map.get(5000000)) //o(1) operation -- return null if value not found.
        println(map.containsKey(5))// --> return bollean
        println(map1.get(5)) //o(1) operation
        println(map1.get(5)) //o(1) operation
        println(map2[5]) //o(log n) operation
        println(map2[50000]) //o(log n) operation
    }
}
