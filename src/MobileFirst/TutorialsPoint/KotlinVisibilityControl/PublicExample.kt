package MobileFirst.TutorialsPoint.KotlinVisibilityControl



open class PublicExample {


    val a=10

}
class b:PublicExample(){
    fun getdata(){
        println(a)
    }
}
fun main(){
    val b=b()
    b.getdata()
}