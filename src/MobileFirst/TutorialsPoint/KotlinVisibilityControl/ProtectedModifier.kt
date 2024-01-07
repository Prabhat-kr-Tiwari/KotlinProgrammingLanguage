package MobileFirst.TutorialsPoint.KotlinVisibilityControl
open class A
{
    protected val ad=30
}
open class B:A(){
    fun print(){
        println(ad)
    }
}
class c{
    fun getdata(){
        //it cannot access
       // println(ad)
    }
}
class d:B(){

    fun getdata(){
        println(ad)
    }

}