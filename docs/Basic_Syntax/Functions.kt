fun sum(a: Int, b: Int): Int {
    return a + b
}

//A function body can be an expression. Its return type is inferred
fun add(a: Int, b: Int) = a + b

//A function that returns no meaningful value.
fun printSum(x: Int, y:Int): Unit {
    println("sum of $x and $y is:>_ ${x + y}")
}

//Unit return type can be omitted
fun printSJ(s: Int, j:Int) {
    println("sum of $s and $j is:>_ ${s + j}")
}

//main function
fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    //inferred
    println("19 + 23 is ${sum(19, 23)}")

    //returns no meaningfull value
    printSum(20,2)

    //omitted
    printSJ(1,1)
}