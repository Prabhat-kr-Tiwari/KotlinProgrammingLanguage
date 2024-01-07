open class A {
     val a=20
    fun prints(){
        println("a value is ${a}")
    }
}
class B:A(){
    fun printdata(){
        println("Inside b")
       // println("a value is ${a}")
        prints()
    }
}
fun main(){
    val b=B()
    b.prints()
    b.printdata()
}