package MobileFirst.TutorialsPoint.ClassandObjects

interface Human {

    fun think()
}

fun main(){

    var programmer:Human=object :Human{
        override fun think() {
            println("thinking...........")
        }

    }
    programmer.think()

}

