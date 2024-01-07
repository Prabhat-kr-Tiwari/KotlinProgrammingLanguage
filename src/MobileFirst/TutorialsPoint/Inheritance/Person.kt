package MobileFirst.TutorialsPoint.Inheritance

abstract class Person {

    abstract fun getager()
}

class abc: Person() {
    override fun getager() {
        println("abc ")
    }

}
fun  main(){
    val obj=abc()
    obj.getager()
}