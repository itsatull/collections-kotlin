package org.nonConCurrentCollections.list

import java.util.*
import java.util.function.Consumer

object ArrayListBasics {
    /*
      1).null insertion is allowed you can insert null value in ArrayList.
      2).ArrayList is having default capacity --- 10. note :- if you have idea that you have to store specific amount of value try to set this for optimization.
      3).Enlarge the default capacity automatically by adding the value.
          (ArrayList create a new array with another value of the length)
      4).Not good for frequent changes like remove,add at specific index // cost of shifting is O(n)
      5).for searching is good -- you can get element at any index in O(n) time.
      6).ArrayList use behind array.
      7).it's not a synchronised(not thread safe)
      8).Random access is possible based on the index(it's implemnted RandomAccess interface).
      9).it can store Heterogeneous values in nin-generic Arraylist
      10).it's implementes Clonable & serializable interface
     */
    @JvmStatic
    fun main(args: Array<String>) {
        //Initialization

        val list: List<String> = mutableListOf("AAA", "BBB", "CCC", "D")

        val list3: Collection<*> = ArrayList<Any?>() // can store anything in it

        val list2: Collection<String> = mutableListOf("AAA", "BBB", "CCC", "D")


        //Empty array list -- Default capacity is 10
        val lis = ArrayList<Int>()
        val timeTankentoInsert: MutableList<Long> = LinkedList()
        var start: Long
        var finish: Long
        for (i in 0..999) {
            start = System.nanoTime()
            lis.add(i)
            finish = System.nanoTime()
            val timeElapsed = finish - start
            timeTankentoInsert.add(timeElapsed)
        }
        println(lis)
        println(timeTankentoInsert)
        println(lis.set(0, 99))

        // to iterate a list
        for (i in lis) {
            println(i)
        }

        val iterator: Iterator<Int> = lis.iterator()
        while (iterator.hasNext()) {
            println(iterator.next()) //fetch + move to next index
        }
        lis.forEach(Consumer { x: Int? -> println(x) })
        lis.forEach(Consumer { x: Int? -> println(x) })
    }
}
