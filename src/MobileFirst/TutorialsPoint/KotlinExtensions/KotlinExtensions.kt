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
fun main(){
    val android=Android()
    android.skills="Kotlin"
    val newandroid=Android()
    newandroid.skills="jetpack compose"

    val myskills=newandroid.addMySkills(android)
    println(myskills)
}
