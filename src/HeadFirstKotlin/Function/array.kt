package HeadFirstKotlin.Function

class array {


}
fun main(args:Array<String>){

    val option= arrayOf("Prabhat","Asif","Sahabaj","Ayushi")
    for (x in option){
        println("$x")
    }
    updateArray(option)
    println("-----------------New array-----------------")
    for (x in option){
        println("$x")
    }




}
fun updateArray(p:Array<String>){
    p[3]="sakshi"
}