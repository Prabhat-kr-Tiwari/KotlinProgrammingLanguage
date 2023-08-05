package HeadFirstKotlin.Chapter4ClassesAndObject.BeTheCompiler

class TapeDeck {
    var hasRecorder=false
    fun playTape(){
        println("Tape is playing")
    }
    fun recordTape(){
        if (hasRecorder){
            println("Tape is recording")
        }
    }
}
fun main(){
    var myTape=TapeDeck()
    myTape.hasRecorder=true
    myTape.playTape()
    myTape.recordTape()
}
