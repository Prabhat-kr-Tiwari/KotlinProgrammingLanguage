package HeadFirstKotlin.Chapter3FunctionGettingOutOfMain.Loops

class loops {
}
fun main(){
    //.. include the end range
    for (x in 1 .. 10){
        println(x)
    }
    // until does not include the end range
    for (x in 1 until  10)
    {
        println(x)


    }
    //downTO
    println("downto")
    for(x in 15 downTo 1)
    {

        println(x)
    }
    // skip
    print("skip")
    for (x in 1 .. 10 step 2){
        println(x)
    }
}