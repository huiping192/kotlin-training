package basic

/**  package import **/

import kotlin.text.*


/**  main **/

fun main() {
    println("hello world")
}

/** function **/
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumLess(a: Int, b: Int) = a + b

// return void
fun printSum(a: Int, b: Int): Unit {
    println("sum: ${a+b}")
}

// ignore return void
fun printSumLess(a: Int, b: Int) {
    println("sum: ${a+b}")
}

/** Variables **/
fun testVar() {

    // swift let
    val a = 1
    val b = 2
    val c: Int
    c = 3

    // var

    var d = 4
    d++
}

/** comments **/

// one line comment

/*
 * block comment
 */



/* string templates*/
fun testStringTemplates() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}


/* Conditional expressions */

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOfLess(a: Int, b: Int) = if (a>b) a else b



/* Nullable */

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}


/* Type checks and automatic casts */

fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        // smart cast
//        return obj.length
//    }
//
//    return null

    if(obj !is String) {
        return null
    }

    if (obj !is Int) {
        return null
    }

    return obj.length
}

/* for loop */

fun forTest() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forTest2() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun forTest3() {
    val items = listOf("apple", "banana", "kiwifruit")
    items.forEach {
        println(it)
    }
}

/* while loop */
fun whileTest() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

/* when expression */
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

/* Ranges */

fun rangeTest1() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}


fun rangeTest2() {
    val list = listOf("a", "b", "c")
    ​
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun rangeTest3() {
    for (x in 1..5) {
        print(x)
    }

    (1..5).forEach { print(it) }
}

fun rangeTest4() {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

/* Collections */

fun collectionTest() {

    val items = listOf("a", "b", "c")

    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

fun collectionTest2() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}

/* Creating basic classes and their instances */

val rectangle = Rectangle(5.0, 2.0)
val triangle = Triangle(3.0, 4.0, 5.0)