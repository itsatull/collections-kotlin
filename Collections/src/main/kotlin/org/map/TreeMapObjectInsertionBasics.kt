package org.map

import org.nonConCurrentCollections.comparablevscomparator.Student
import java.util.*

object TreeMapObjectInsertionBasics {
    @JvmStatic
    fun main(args: Array<String>) {
        val comparator = Comparator { obj1: Student, obj2: Student -> obj1.age - obj2.age } // ascending
        val comparator1 = Comparator { obj1: Student, obj2: Student -> obj2.age - obj1.age } // descending
        val comparator2 = Comparator { obj1: Student, obj2: Student -> obj1.name.compareTo(obj2.name) } //ascending order of name.
        val comparator3 = Comparator { obj1: Student, obj2: Student -> obj2.name.compareTo(obj1.name) } //descending order of name.
        val map: MutableMap<Student, String> = TreeMap(comparator1.reversed())
        map[Student("Jhon", 18)] = "Jhon" // will get class cast exception.
        map[Student("Ravi", 19)] = "Ravi"
        map[Student("Rahul", 20)] = "Rahul"
        map[Student("Ravindra", 21)] = "Ravindra"
        map[Student("Raghu", 22)] = "Raghu"
        println(map)
    }
}
