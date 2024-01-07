package MobileFirst.TutorialsPoint.AbstractClass

abstract class People(_name:String) {


    var name:String
    abstract var age:Int
    init {
        this.name=_name
    }
    abstract fun setPeopleAge(_age:Int)
    abstract fun getPeopleAge():Int

    fun getPersonName(){
        println("Name = $name")
    }
}
class Employee(_name: String):People(_name){

     override var age: Int=0
    override fun setPeopleAge(_age: Int) {

        age=_age
    }

    override fun getPeopleAge(): Int {
        return age
    }

}
fun main(){
    val emp=Employee("Prabhat")
    emp.setPeopleAge(30)
    val age=emp.getPeopleAge()
    println("age ${age}")
    emp.getPersonName()
}