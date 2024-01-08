package dev.mapper

import com.google.gson.GsonBuilder

class System1 {
    val containers = listOf(Container())

    override fun toString(): String {
        return "str rep"
    }
}

class Container {
    val components = listOf(Component())
}

class Component {
    val per = Person("salesperson", "sells software")
}

class Relationship {}

data class Person(val name: String, val description: String)

fun main() {
    val system1 = System1()
    val gson = GsonBuilder().setPrettyPrinting().create()
    val strRep = gson.toJson(system1)
    println(strRep)
}