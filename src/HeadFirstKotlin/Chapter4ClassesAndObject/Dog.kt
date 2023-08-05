package HeadFirstKotlin.Chapter4ClassesAndObject

import java.util.*

class A(name_param:String){
    val name= name_param.uppercase(Locale.getDefault())
}

class Dog(var name:String , weight_param :Int, breed_param:String) {
    //setter
    var weight=weight_param
        set(value){
            if (value>0){
                field=value
            }
        }

    // this give the error
     //var temparement:String
    //this will say the compiler i will initialize it latter
    var x=""
     lateinit var temparement:String


    init {
        println("$name is created")
    }
    //getter method
    val weightInKGS:Double
        get()=weight/2.2
    var activities= arrayOf("Walks")
    val breed= breed_param.uppercase(Locale.getDefault())
    init {
        println("The dog is of $breed")
    }


    fun bark(){
        if (weight< 20){
            print("yep")

        }else{
            println("woof")
        }
    }
    fun hello(name:String,id :Int){
        println(name)

    }

}
fun main(){
    var mydog=Dog("German Shepferd",30,"Hybrid")
    println("getter  "+mydog.weightInKGS)
    //acessing the properties
    print(mydog.name)
    mydog.bark()
    //update the prooperties
    mydog.weight=40
    println(mydog.weight)
    println("activities")
    println(mydog.activities[0])



    //
    var dogs= arrayOf(Dog("labrador",50,"indian"),
                      Dog("Bulldog",60,"american")   )
    println(dogs[0].name)
    val obj=A("prabhat")
    print(obj.name)
    println(mydog.hello("hello",1))

}