package MobileFirst.TutorialsPoint.Interface

interface MyInterface {


    var age: Int
    fun abstractMethod()

    fun method() {
        println("Inside interface method")
    }
}

class myclass : MyInterface {

    override var age: Int = 10
    override fun abstractMethod() {
        println("Abstract method implementation inside myclass")
    }


}
interface  a{
    fun myfunction()

    fun hello(){
        println("hello of a ")
    }
}
interface b{
    fun myfunction()
    fun hello(){
        println("Hello ji  of b")
    }
}
class multipleInheritanceImpl:a,b{

    override fun myfunction() {
        println("This is function implementation")
    }

    override fun hello() {
        super<a>.hello()
        super<b>.hello()
        println("hello 4")
    }

}
//hell
fun main(){
    val obj=myclass()
    obj.method()
    obj.abstractMethod()
    println(obj.age)

    //
    val ob=multipleInheritanceImpl()
    ob.myfunction()
    ob.hello()
}