package ByteShortIntLong

fun main(){

    var name="Alex"
    var number:Int=22
    val maxIntegerValue:Int=Int.MAX_VALUE
    val minIntegerValue:Int=Int.MIN_VALUE
    println("Max is $maxIntegerValue")
    println("Min is $minIntegerValue ")

    number=2147483647
    val myMaxBytevalue:Byte= Byte.MAX_VALUE
    val myMinBytevalue:Byte= Byte.MIN_VALUE

    println("Byte Max is $myMaxBytevalue")
    println(" Byte Min is $myMinBytevalue ")

    val myMaxShortvalue:Short= Short.MAX_VALUE
    val myMinShortvalue:Short= Short.MIN_VALUE

    println("Short Max is $myMaxShortvalue")
    println(" Short Min is $myMinShortvalue ")

    val myMaxLongtvalue:Long= Long.MAX_VALUE
    val myMinLongvalue:Long= Long.MIN_VALUE

    println("Long Max is $myMaxLongtvalue")
    println(" Long Min is $myMinLongvalue ")

    val myNumber=239999999999

    /** Assign a binary number by prefixing the number with 0b.
     */
    var binaryNumber=0b10
    println(binaryNumber)
    /** Assign a hexadecimal number by prefixing the number with 0x.
     */
    var hexadecimalNumber=0xAB
    println(hexadecimalNumber)

    //Octal numbers aren’t supported





}