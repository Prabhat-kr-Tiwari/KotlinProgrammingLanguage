package MobileFirst.TutorialsPoint.Collection

fun main(){
    val numbers = mutableSetOf(1,2,1,3,4,6)
    numbers.add(9)
    numbers.add(19)
    numbers.add(0)
   // println(numbers)

    //list
    println("-------------List----------------")
    println("-------------immutableList----------------")

    val myimmutablkelist= listOf("sonu","prabhar","mukhiya ji")
    println(myimmutablkelist)
    //properties
    println(myimmutablkelist.get(0))
    //looping
    println(myimmutablkelist.toString())
    //using iterator
    println("--------------Iterator---------------")
    val itr=myimmutablkelist.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }

    println("-------------Using Loop---------------")
    for (i in myimmutablkelist.indices){
        println(myimmutablkelist[i])

    }

    println("---------------using for Each------------")
    myimmutablkelist.forEach {
        println(it)
    }
    println("----------size of list-----------")
    println("size of list is ${myimmutablkelist.size}")

    /*The in operator can be used to check the existence of an element in a list.*/

    if ("prabhar" in myimmutablkelist){
        println("present hai")

    }else{
        println("Not present")
    }
    //The contains() method can also be used to check the existence of an element in a list.
    if (myimmutablkelist.contains("sonu")){
        println("present hai")
    }else{
        println("not present")
    }

    /*The isEmpty() method returns true if the collection is empty (contains no elements),
     false otherwise.*/
    if (myimmutablkelist.isEmpty()){
        println("yes")
    }else{
        println("No")
    }
   // The indexOf() method returns the index of the first occurrence of the specified
  // element in the list, or -1 if the specified element is not contained in the list.

    println(myimmutablkelist.indexOf("sonu"))
    println(myimmutablkelist.indexOf("prabhar"))

    /*The get() method can be used to get the element at the specified index in
    the list. First element index will be zero.*/
    println(myimmutablkelist.get(0))

    /*We can use + operator to add two or more lists into a single list.
     This will add second list into first list, even duplicate elements will also be added.*/
    val list= listOf<Int>(1,2,3,4)
    val list2= listOf<String>("Sonu","2","3","4")
    val newlist=list+list2
    println(newlist)

    /*We can use - operator to subtract a list from another list.
     This operation will remove the common elements from the first list
      and will return the result.*/
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("one", "five", "six")
    val resultList = firstList - secondList

    println(resultList)

    println("----------Slicing---------")
    println(firstList.slice(0..2))
    /*We can use filterNotNull() method to remove null elements from a Kotlin list.*/
    val l= listOf("1",2,"null",null,null)
    val newl=l.filterNotNull()
    println(newl)

    /*We can use filter() method to filter out the elements matching with the given predicate.*/
    val numberlist= listOf<Int>(1,2,3,4)
    val newnumberlist=numberlist.filter { it>2 }
    println(newnumberlist)
    val theList = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val newtheList=theList.drop(3)
    println(newtheList)

    /*We can use groupBy() method to group the elements matching with the given predicate.*/
    val xgroupBy=theList.groupBy { it%2 }
    println(xgroupBy)

    /*We can use map() method to map all elements using the provided function:*/
    val maplist=theList.map { it/2 }
    println(maplist)

    /*We can use chunked() method to create chunks of the given size from a list.
     Last chunk may not have the elements equal to the number of chunk size based on the
      total number of elements in the list.*/
    val newchunkedlist=theList.chunked(4)
    println(newchunkedlist)

    val windowedList = theList.windowed(3)
    println(windowedList)

    println("-----mutablelist--------")
    val theLis = mutableSetOf(10, 20, 30)

    theLis.add(40)
    theLis.add(50)
    println(theLis)

    theLis.remove(10)
    theLis.remove(30)
    println(theList)


    //how to make  a mutable Kotlin list as immutable?
    // Mutable list
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

// Creating an immutable copy of the mutable list
    val immutableList = mutableList.toList()


}