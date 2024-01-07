package ProgrammingSimplified.SealedClasses.Enum

enum class Network(val enabled:Boolean){
    //here we cannot pass another data type we have to pass the same data type as the data type in ,
    // so we have to pass boolean datatype only
    CONNECTED(true),
    DISCONNECTED(false)
    //DISCONNECTED("false")
}

/*

in the enum classes we can only pass the same data type only
enum class ApiState{

    SUCCESS(val data:String),
    FAILURE(val e:Throwable),
    LOADING()
}*/
fun getnetwork(network: Network):Boolean{
    return when (network){
        Network.CONNECTED->{
            network.enabled

        }
        Network.DISCONNECTED->{
            network.enabled
        }
    }
}
fun main(){
    val res= getnetwork(Network.CONNECTED)
    println(res)
}