fun sum(a: Int, b: Int): Int {
    return a + b
}

//A function body can be an expression. Its return type is inferred
fun add(a: Int, b: Int) = a + b

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    //inferred
    println("19 + 23 is ${sum(19, 23)}")
}