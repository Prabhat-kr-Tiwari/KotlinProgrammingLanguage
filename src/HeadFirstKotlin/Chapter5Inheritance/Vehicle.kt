package HeadFirstKotlin.Chapter5Inheritance

//class Vehicle {
//}
open class Vehicle {
    open var speed: Int = 10
}

class Car : Vehicle() {
    override var speed: Int
        get() {
            println("Getting car's speed")
            return super.speed
        }
        set(value) {
            println("Setting car's speed")
            super.speed = value
        }
}

fun main() {
    val car = Car()
    car.speed = 60 // This will print "Setting car's speed"
    println("Car's speed: ${car.speed}") // This will print "Getting car's speed" and then the speed
}
