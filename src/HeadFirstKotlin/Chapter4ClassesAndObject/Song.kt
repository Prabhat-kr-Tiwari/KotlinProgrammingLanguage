package HeadFirstKotlin.Chapter4ClassesAndObject

class Song(val title:String,val artist:String) {
    fun play(){
        println("Song is playing $title  $artist")
    }
    fun stop(){
        println("Song is stopped")
    }

}
fun main(args: Array<String>){
    val songone=Song("Humsafar","Raju")
    val songtwo=Song("sath sath","anjana")
    val songthree=Song("chand ke par","Sonu nigam")
    songone.play()
    songone.stop()
    songthree.play()

}