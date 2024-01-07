package MobileFirst.TutorialsPoint.ClassandObjects



class Person{


    var name:String
    var age:Int
    init{
        println("This  is intiliazer block")
    }
    constructor(_name:String,_age:Int){
        this.name=_name
        this.age=_age
        println("Name  ${name}")
        println("age  ${age}")
    }
}
fun main(){
    val p=Person("Tanaman",23)
}