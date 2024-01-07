package MobileFirst.TutorialsPoint.Collection

//Kotlin set is an unordered collection of items.
fun main(){

    val myset= setOf<String>("a","b","c","d","e","f")

    println(myset)
    println(myset.toString())

    //for looop
    for (i in myset.indices){
        print(myset.elementAt(i))
//        println()
    }
    println()
    //using  the iterator
    val itr=myset.iterator()
    while (itr.hasNext()){
        print(itr.next())
    }
    println()
    println("---------foreach---------")
    myset.forEach { print(it.toString()+" ") }

    println("the size is ${myset.size}")

    if ("a" in myset){
        println("Yes")
    }else{
        println("No")
    }
    println("Contains")
    if (myset.contains("a")){
        println("Yes")
    }else{
        println("No")
    }

    if (myset.isEmpty()){
        println("yes")
    }else{
        println("No")
    }

    //indexof
    println(myset.indexOf("a"))
    //elementAt
    println(myset.elementAt(2))

    val first= setOf(1,2,3,4)
    val second= setOf<String>("a","b","c","d","e")
    val new =first+second
    println(new)

    val third= setOf("s","p","y",null,null)
    val fourth= setOf<String>("s","p","x")
    val fifth=third-fourth
    println(fifth)

    println("filterNotNull")
    val setnew=third.filterNotNull()
    println(setnew)

    //sorting
    val setofnumber=setOf(1,2,1,12,12,31,0,1)
    val sortedset=setofnumber.sorted()
    println(sortedset)
    val descendingsort=sortedset.sortedDescending()
    println(descendingsort)

    //drop
    println("Drop")
    val afterdrop=setofnumber.drop(3)
    println(afterdrop)

    //groupBy
    val result=setofnumber.groupBy { it%2 }
    println(result)

    //map
    val mapresult=setofnumber.map { it/2 }
    println(mapresult)

    //chunked
    val results=setofnumber.chunked(3)
    println(results)

    val newset=setnew.windowed(3,6)
    println(newset)
    val sets= mutableSetOf<String>("a","b","c","d")
    println(sets)


}