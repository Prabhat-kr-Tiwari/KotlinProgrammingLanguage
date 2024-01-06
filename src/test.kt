fun totalLembas(first: String, second: String) {
    print(first.toInt() + second.toInt())
}

/*fun main() {
    val breadFromFrodo = readln()
    val breadFromSam = readln()

    // write your code here
    totalLembas(breadFromFrodo,breadFromSam)

}*/
//
fun sum(a:Int ,b:Int):Int {
    return a+b
}

// Higher order function example: Calculator
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun add(x: Int, y: Int): Int {
    return x + y
}
fun subtract(x: Int, y: Int): Int {
    return x - y
}
fun multiply(x: Int, y: Int): Int {
    return x * y
}
fun main() {
    val result1 = calculate(10, 5, ::add)
    println("Addition: $result1") // Output: Addition: 15
    val result2 = calculate(10, 5, ::subtract)
    println("Subtraction: $result2") // Output: Subtraction: 5
    val result3 = calculate(10, 5, ::multiply)
    println("Multiplication: $result3") // Output: Multiplication: 50
}





