package ProgrammingSimplified.SealedInterface3

sealed class CommonErrors:UserErrors,LoginErrors{
    object Authorise : CommonErrors()
    object ServerError: CommonErrors()
}
sealed interface UserErrors{
    object EmailAndPasswordError: UserErrors
    //data class ErrorOne(val commonErrors: CommonErrors): UserErrors()
}
fun getUserErrors(userError: UserErrors):Any{
    return when(userError){
        UserErrors.EmailAndPasswordError ->{}
        CommonErrors.Authorise->{}
        CommonErrors.ServerError->{}

    }
}
sealed interface LoginErrors{
    object LoginError: LoginErrors
    // data class ErrorTwo(val commonErrors: CommonErrors): LoginErrors()
}