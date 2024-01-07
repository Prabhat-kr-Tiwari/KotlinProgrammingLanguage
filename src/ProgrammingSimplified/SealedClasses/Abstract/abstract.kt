package ProgrammingSimplified.SealedClasses.Abstract

//abstract class can be access can be anywhere
//problem in abstract class is that even if there is any thing in the
// loadstate and we don't use that then we will still use that
//we need to add else block
abstract class LoadState{
    data class Success(val data:String):LoadState()
    data class Failure(val t:Throwable):LoadState()
    object Loading:LoadState()
    object Idle:LoadState()
}
fun getLoadState(loadState: LoadState):Any{
    return when(loadState){
        is LoadState.Success->{loadState.data}
        is LoadState.Failure->{loadState.t}
        LoadState.Loading->{}
        else -> {
            println("Else branch")
        }
    }
}
fun main(){
    val res= getLoadState(LoadState.Success("hey"))
    println(res)
}