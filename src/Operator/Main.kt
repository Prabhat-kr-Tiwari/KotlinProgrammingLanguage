package Operator

fun main() {
    var x = 5
    var y = 3.0
    val res = x + y
    println(res)
    //${} is a place holder
    println("x + y=${x + y}")
    println("x - y=${x - y}")
    println("x * y=${x * y}")
    println("x / y=${x / y}")
    println("x % y=${x % y}")

    var result = x + y
    result += 2
    println(result)

    result -= 2
    println(result)
    result *= 2
    println(result)
    result /= 2
    println(result)
    result %= 2
    println(result)

    println("3+3*4=${(3 + 3) * 4}")
    x = 0
    //return and then increment
    println("x= ${x++}")

    //x=1 here
    //increment and then return
    println("x= ${++x}")


    println("x= ${x--}")

    //here x=1
    println("x= ${--x}")

    val isActive = true
    if (!isActive) {
        println("The user is active")
    } else {
        println("The user is not active")

    }

    val myNumber = 150
    if (myNumber >= 150) {
        println("Number is greater than 150")
    } else if (myNumber > 90) {
        println("Number is greater than 90")
    } else {
        println("All condition is fails")
    }
    val no = 190
    if (no <= 90) {

        println("Number is less than 90")
    } else if (no == 90) {
        println("Number is equal t0 90")
    } else {
        println("All condition is fails")
    }

    //logical not
    if (no != 90) {
        println("Number is not equal t0 90")
    } else {
        println("Number is equal t0 90")
    }
    //logical and
    val isPlaying = true
    val score = 100
    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {

        println("Still at same level")
    }
    //logical or
    val num1 = -5
    val num2 = -2
    if (num1 > 0 || num2 > 0) {
        //println("The condition is true")
        "This text1"
    } else {
        //println("The condition is false")
        "This is text2"
    }


    //IF AND ELSE AS A EXPRESSION
    val num3 = -5
    val num4 = -2
    //error
    //val text:String = if (num3 > 0 || num4 > 0) "This text 1" else 5

    val text = if (num3 > 0 || num4 > 0)


        "This text 1"
    else

        "This is text 2"

    println(text)
    val string = "Hello, World!"
    //string = "Hello, Kotlin!"
    println(string)

    if(num3>0||num4>0)
        println("This condition is true")
        println("This condition is true and some text")


}