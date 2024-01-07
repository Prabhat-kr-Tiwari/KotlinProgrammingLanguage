package MobileFirst.TutorialsPoint.KotlinVisibilityControl

private class PrivateExample {


    private fun doSomething(){
        println("hello")
    }
}
/*'public' subclass exposes its 'private-in-file' supertype PrivateExample*/
/*
class abc:PrivateExample(){

}*/


