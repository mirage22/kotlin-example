package com.kotlin.example

/**
 * @author Miro Wengner (@miragemiko)
 * @since 29.01.2017
 */

fun main(args: Array<String>){
    println("magic")
}



class KotlinMain {
    fun getGreeting(): String {
        val words = mutableListOf<String>()
        words.add("Hello,")
        words.add("world!")

        return words.joinToString(separator = " ")
    }

}
