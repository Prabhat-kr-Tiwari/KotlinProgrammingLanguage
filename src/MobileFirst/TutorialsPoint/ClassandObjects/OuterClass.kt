package MobileFirst.TutorialsPoint.ClassandObjects
class OuterClass {

    val mes="outer variable"
    class InnerClass {
        fun innerfuntion() {
            println("Inner function")
        }
    }
}
fun main(){
    val obj=OuterClass.InnerClass()
    obj.innerfuntion()




}
