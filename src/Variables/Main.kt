package Variables

fun main() {
    var name: String = "Prabhat"
    name="Alex"
    //Statically Typed
    //name=7 kotlin check the variable at compile time not at run time
    //name= 7.toString()

    val newname="Dubey"
    // val variable cannot be reassigned
    //newname="tiwari"

    var age:Int=10

    age=24

    //type inference
    var username="Prabhat"
    //username=9


    println("Hello $name your age is $age")


}