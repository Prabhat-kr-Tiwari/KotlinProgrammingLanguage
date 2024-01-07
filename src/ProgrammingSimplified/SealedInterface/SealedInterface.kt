package ProgrammingSimplified.SealedInterface



sealed class CommonErrors{
    object Authorise : CommonErrors()
    object ServerError: CommonErrors()
}
sealed class UserErrors{
    object EmailAndPasswordError: UserErrors()
    data class ErrorOne(val commonErrors: CommonErrors): UserErrors()
}
fun getUserErrors(userError: UserErrors):Any{
    return when(userError){
        UserErrors.EmailAndPasswordError->{}
        is UserErrors.ErrorOne->when(userError.commonErrors){
            CommonErrors.Authorise->{}
            CommonErrors.ServerError->{}
        }
    }
}
sealed class LoginErrors{
    object LoginError: LoginErrors()
    data class ErrorTwo(val commonErrors: CommonErrors): LoginErrors()
}