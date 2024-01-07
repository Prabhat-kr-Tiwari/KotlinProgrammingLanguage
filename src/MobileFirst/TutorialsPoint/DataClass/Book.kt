package MobileFirst.TutorialsPoint.DataClass

data class Book(val name:String,val price:Int,val Author:String)
fun main(){
    val mybook=Book("Aone",23,"xc")
    println("Book Name ${mybook.name}")
    println("Price ${mybook.price}")
    println("Author ${mybook.Author}")
    println(mybook.toString())

     //    Copy Function
    val copied=mybook.copy(price = 40)
    println("----------Copied-----")
    println("Book name  ${copied.name}")
    println("Book Price  ${copied.price}")
    println("Book Author  ${copied.Author}")

    //hashCode
    println("hashcode "+mybook.hashCode())
    println("new hashcode  "+copied.hashCode())
}
