package org.nonConCurrentCollections.set

class Person(var name: String, var age: Int) : Comparable<Person> {
    override fun toString(): String {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }

    override fun compareTo(o: Person): Int {
        if (this.age > o.age) {
            return 1
        } else if (this.age < o.age) {
            return -1
        }
        return 0
        return Integer.compare(this.age, o.age) // ascending order
//        return this.age - o.age // ascending order
//        return Integer.compare(o.age, this.age) // descending order
//        return o.age - this.age // ascending order
    }
}
