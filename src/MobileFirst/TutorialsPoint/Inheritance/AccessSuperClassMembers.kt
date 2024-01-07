package MobileFirst.TutorialsPoint.Inheritance

class AccessSuperClassMembers {
}

open class  first{
    val name:String
    init {
        name="base"
    }

    open fun displayNames(){
        println("Name ${name}")
        println("I am in "+this.name)
    }
}
class second:first(){

    override fun displayNames() {
        super.displayNames()
        println("I am in "+super.name)
    }


}
fun main(){
    val obj=second()
    obj.displayNames()
}
