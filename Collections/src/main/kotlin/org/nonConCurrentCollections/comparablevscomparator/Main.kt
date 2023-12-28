package org.nonConCurrentCollections.comparablevscomparator

import java.util.*

object Main {
    /*
    Comparable ==> compareTo(T ob); -- Comparable is a function interface
    Comparator ==> compare(T ob1, T obj2); Comparator is a functional interface
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val comparator = Comparator { obj1: Student, obj2: Student -> obj1.age - obj2.age } // ascending
        val comparator1 = Comparator { obj1: Student, obj2: Student -> obj2.age - obj1.age } // descending
        val comparator2 = Comparator { obj1: Student, obj2: Student -> obj1.name.compareTo(obj2.name) } //ascending order of name.
        val comparator3 = Comparator { obj1: Student, obj2: Student -> obj2.name.compareTo(obj1.name) } //descending order of name.
        val students: MutableSet<Student> = TreeSet(comparator2)
        students.add(Student("atul", 25))
        students.add(Student("rohan", 26))
        students.add(Student("rahul", 27))
        students.add(Student("ravi", 28))
        students.add(Student("sumit", 29))


        println(students)
    }
}
