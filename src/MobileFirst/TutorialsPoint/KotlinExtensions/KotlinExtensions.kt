package MobileFirst.TutorialsPoint.KotlinExtensions

import com.sun.org.apache.xpath.internal.operations.And



class Android{
    var skills="Kotlin"
    fun printMySkills(){
        println("My skills are ${skills}")
    }
}
fun Android.addMySkills(a:Android): String {
    var obj=Android()
    obj.skills=a.skills+" "+this.skills
    return obj.skills
}

//Extended Library Classes
fun String.countVowels(a:String):Int{
    var count=0
    a.forEach {
        if (it=='a'||it=='e'||it=='i'||it=='o'||it=='u'){
            count++
        }
    }
    return count
}
class companionobjectexample{
    companion object{
        fun method() :String{
            return("Keep growing")
        }
    }
}
//Extension with Nullable Receiver

fun String?.count(a:String):Any{

    if (this==null) return "null"
    var count=0
    a.forEach {
        if (it=='a'||it=='e'||it=='i'||it=='o'||it=='u'){
            count++
        }
    }
    return count


}


//Extension Properties
class Temperature(var celsius:Float)

var Temperature.farenheit:Float
    get() = (celsius * 9 / 5) + 32
    set(value) {
        celsius = (value - 32) * 5 / 9
    }
fun main(){
    val android=Android()
    android.skills="Kotlin"
    val newandroid=Android()
    newandroid.skills="jetpack compose"

    val myskills=newandroid.addMySkills(android)
    println(myskills)
    //count vowels
    val str="This is string  aeiou"
    val result=str.countVowels(str)
    println(result)

    //companion objects
    println(companionobjectexample.method())

    //
//Extension with Nullable Receiver
    println("Extension with Nullable Receiver")
    val s:String?=null
    val result1=s?.count(s)
    println("count is  "+result1)


//Extension Properties
    val t=Temperature(45f)
    println("celsius  "+t.celsius)
    println("farenheit    "+t.farenheit)


}
