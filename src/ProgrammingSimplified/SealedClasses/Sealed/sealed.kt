package ProgrammingSimplified.SealedClasses.Sealed


//advanatage over enum and abstract
//sealed class can be used in the same class
//sealed can be used in same class and same file
sealed class LoadState1{
    data class Success(val data :String):LoadState1()
    data class Failure(val t:Throwable):LoadState1()
    object Loading:LoadState1()
    sealed class Demo{
        data class DemoOne(val data:Int):Demo()
    }

}
object idel:LoadState1()
fun getLoad(loadState1: LoadState1):Any{
    return when(loadState1){
       is LoadState1.Success->{}
        is LoadState1.Failure->{}
        LoadState1.Loading->{}
        idel->{}
    }

}
fun main(){

}