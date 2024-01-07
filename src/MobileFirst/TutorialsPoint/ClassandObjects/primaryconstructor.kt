package MobileFirst.TutorialsPoint.ClassandObjects

class primaryconstructor constructor(val _firstname: String="Sonu ji", val _age: Int=22) {

    var firstname: String
    var age: Int
    init {
        this.firstname = _firstname
        this.age = _age
        println("name ${firstname}")
        println("age ${age}")

    }
}
fun main(){
    val primaryconstructor=primaryconstructor("prabhat",23)
    val primaryconstructor2=primaryconstructor()

}