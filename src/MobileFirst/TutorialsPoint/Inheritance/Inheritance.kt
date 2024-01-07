package MobileFirst.TutorialsPoint.Inheritance



open class Parent{


    open val newcount=30
    open val count=10
    fun parentfunction(){
        println("Parent function")
    }

    open fun think(){
        println("Parent thinking.........")
    }

    //method cannot be overriden if it is declare final
    final  fun gun(){
        println("dhinchiwo  dhichjkiwao")
    }
}
open class base(override val newcount: Int=40): Parent() {
    fun displayCount(){
        println("Count value is $newcount")
    }
    override val count: Int

    init {
        count=20
    }


    override fun think() {
        super.think()
        println("Base also thinking.........")
    }
    fun basefunction(){
        println("Base function")
    }

}
fun main(){

    val mybase=base()
    mybase.parentfunction()
    mybase.basefunction()
    mybase.think()
    mybase.displayCount()
    println("count= "+mybase.count)
    val parent=Parent()
    parent.think()
    parent.gun()
}
