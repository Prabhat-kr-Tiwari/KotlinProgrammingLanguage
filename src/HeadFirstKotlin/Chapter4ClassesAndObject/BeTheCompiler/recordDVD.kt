package HeadFirstKotlin.Chapter4ClassesAndObject.BeTheCompiler

class recordDVD {}
    class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) {
            println("DVD recording")
        }
    }
}

fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    //d.playDVD()
    d.recordDVD()
}