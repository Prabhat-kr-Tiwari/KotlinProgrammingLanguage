package MobileFirst.TutorialsPoint.Generics




class GenericsExample<T>(input:T){


    init{

        println("value of input is ${input}")

    }

}
fun  main(){
    val obj=GenericsExample("Prabhat")

}