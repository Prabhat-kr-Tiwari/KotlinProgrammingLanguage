package MobileFirst.TutorialsPoint.Inheritance



open class Baseclass{
    init {
        println("base class")
    }
}
open class child:Baseclass(){
    init {
        println("child class")
    }
}
class grandchild:child(){
    init {
        println("grand child")
    }
}
fun main(){
    var grandchild=grandchild()

}