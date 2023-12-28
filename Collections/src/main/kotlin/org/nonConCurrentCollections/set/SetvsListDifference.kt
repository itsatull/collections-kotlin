package org.nonConCurrentCollections.set

import java.util.*
import java.util.Set

class SetvsListDifference {
    val sortedSet1: SortedSet<Int>
        get() {
            val treeSet: SortedSet<Int> = TreeSet() // tree set also extends Sorted set Interface.
            treeSet.add(10)
            treeSet.add(20)
            treeSet.add(30)
            return treeSet
        }

    companion object {
        /*
    List        vs          Set
    -----------------------------------------------------
    indexed                  not Indexed
    ordered                  not ordered but in some case like LinkedHashSet ordered
    duplicate allowed        doesn't allow duplicate.
     */
        @JvmStatic
        fun main(args: Array<String>) {
            val set: MutableSet<String> = HashSet() //not oedered and not sorted
            set.add("a")
            set.add("ab")
            set.add("abc")
            set.add("abcd")
            set.add("abcde")
            set.add("abcdef")
            println(set)
            println(sortedSet)
            println(sortedSet.hashCode())
            println(sortedSet.hashCode())
            val obj = SetvsListDifference()
            println(obj.sortedSet1)


            val set1 = Set.of(1, 2, 3, 4, 5, 1) // this will throw an exception run time--class cast exception
        }

        val sortedSet: SortedSet<Int>
            get() {
                val treeSet: SortedSet<Int> = TreeSet() // tree set also extends Sorted set Interface.
                treeSet.add(10)
                treeSet.add(20)
                treeSet.add(30)
                return treeSet
            }
    }
}
