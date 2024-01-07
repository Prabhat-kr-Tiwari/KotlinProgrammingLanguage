package MobileFirst.TutorialsPoint.KotlinVisibilityControl.Internal

internal open class internalclass{

    val internalvalue=20
}


open class abc{
    internal val internalvalue=30
    internal  fun printsomething(){
        println("Printing something")
    }
}
open class newclass:abc() {


    fun print(){

        printsomething()
    }

}
fun main(){
    val obj=newclass()
    obj.print()
    println(obj.internalvalue)
}