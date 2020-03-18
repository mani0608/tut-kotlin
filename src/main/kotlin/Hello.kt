fun main() {
    println("Hello from kotlin")
}

fun sum (a: Int, b: Int): Int? = (a + b)

fun max (a: Int, b: Int): Int? = if (a > b) a else b

/**
 * Iterating over list of fruits
 */
fun printFruits() {
    val fruits = listOf<String>("apples", "oranges", "bananas")
    for (fruit in fruits) {
        println("Fruit is $fruit")
    }
}

/**
 * plyWithValues - Start
 * converts passed int to its string equivalent
 */
fun convertToText(num: Int): String? {
    return when(num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> null
    }
}


fun playWithValues() {
    for (index in 1..5) {
        println("Converted value $index to ${convertToText(index)}")
    }
}

/* playWithValues - End */

/**
 * Works with progression in loop
 */
fun playWithProgression() {
    for (x in 9 downTo 0 step 3) {
        println("Progression result $x")
    }
}

/**
 * Playing with collection
 */
fun playWithCollection() {
    val fruits = mutableListOf<String>("Apple", "Orange", "Pineapple")

    when {
        "Orange" in fruits -> println("Found Orange")
        "Apple" in fruits -> println("Found Apple")
        "Banana" !in fruits -> println("Banana not in fruits")
    }

    fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println("Filtered Using lamba $it") }
}

/**
 * Playing with class instances using when
 */
fun playWithClassInstances(inst: Any) {
    when (inst) {
        is Employee -> println("It's employee instance")
        is Company -> println("It's company instance")
    }
}

/**
 * playing with map
 */
fun playingWithMap() {
    val map = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)

    for ((k, v) in map) {
        println("Playing with map key: $k, value: $v")
    }
}

