package HeadFirstKotlin.Chapter5Inheritance

open class Animal {
    open var image: String = ""
    //open val food: String = ""

    open var food: String = ""
    open var habitat: String = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal makes noise")
    }

    open fun eat() {
        println("The animal eats food")
    }

    open fun roam() {
        println("The animal roams")
    }

    fun sleep() {
        println("The animal sleeps well")
    }
}
open class Canine:Animal(){
    override fun roam() {
        println("Canine is roaming")
    }
}
class wolf:Canine(){
    override var food="meat"
    override var image="This wolf image"
    override var habitat="forests"
    override fun makeNoise() {
        println("Hooooowl")
    }

    override fun eat() {

        println("THe wolf is eating $food")
    }
}

open class Lion : Animal() {
    override fun makeNoise() {
        super.makeNoise()
        println("Lion Roar")
    }

    open fun hello(): Boolean {
        return true
    }
}

class childLion : Lion() {
    // while overriding a function the return type must matched with
    // the return type of it superclass or it sub class
    override fun hello(): Boolean {
        return false


    }


}

class Hippo : Animal() {
    override var image = "This is an image"
    override var food="Grass"
//        get() = super.food
//        set(value) {
//            println("Setting food")
//            super.food = value
//        }
    override var habitat="water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("THe hippo is eatig $food")
    }

    //if food is declared using var keyword
    //override var food="This eats grass"
    init {
        food = "THis is a food"
    }

}
class Vet{



    fun giveShot(animal: Animal){
        animal.makeNoise()
    }


}


fun main() {
    val hippo = Hippo()
    println(hippo.food)
    val lion = Lion()
    lion.makeNoise()

    val animals= arrayOf(Hippo(),Lion())
    for (item in animals){
        item.roam()
        item.eat()
    }
    println("--------------Vet class--------")
    val vet=Vet()
    vet.giveShot(hippo)
}
