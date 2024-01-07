package MobileFirst.TutorialsPoint.Collection

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Step

fun main(){


    val mymap= mapOf<String,String>("one" to "one","two" to "two","three" to "three")
    println(mymap)

    val newmap= mutableMapOf<String,Int>()

    newmap["one"]=1
    newmap["two"]=2
    newmap["three"]=3
    newmap["four"]=4
    println(newmap)

    val maps= mapOf(Pair("1",2),Pair("2",2),Pair("3",3),Pair("4",4))
    println(maps)

    println("map")
    val map= mapOf<String,String>(Pair("1","1"), Pair("2","2"),Pair("3","3"),Pair("4","4"),Pair("5","5"))
    println(map)

    val itr=map.keys.iterator()
    while (itr.hasNext()){
        val key=itr.next()
        val value=map[key]
        println("${key}   ${value}")
    }
    println("k,v")
    for ((k,v) in mymap){
        println("${k}=${v}")
    }

    println("foreach")
    mymap.forEach { t, u -> println("key  ${t}   value  ${u}")  }
    println("Size of the Map " + mymap.size)
    println("Size of the Map " + mymap.count())


    if (mymap.containsKey("one")){
        println("yes")
    }else{
        println("new")
    }

}