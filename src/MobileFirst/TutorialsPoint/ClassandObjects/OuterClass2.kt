package MobileFirst.TutorialsPoint.ClassandObjects
class OuterClass2 {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
        inner class InnerClass {
            fun innerfunction() {
                val newms="prabhat"
                println(welcomeMessage)
                println("inner function")
            }
        }

}
fun main(){
    val outerobj=OuterClass2()
    val innerobj=outerobj.InnerClass()
    innerobj.innerfunction()


}
