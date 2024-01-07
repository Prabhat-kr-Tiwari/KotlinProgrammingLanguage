package ProgrammingSimplified.SealedInterface2

import MobileFirst.TutorialsPoint.ClassandObjects.User



//kotlin does not mutliple inheritaance
/*
sealed class CommonErrors:UserErrors(),LoginErrors(){
    object Authorise : CommonErrors()
    object ServerError: CommonErrors()
}
sealed class UserErrors{
    object EmailAndPasswordError: UserErrors()
    //data class ErrorOne(val commonErrors: CommonErrors): UserErrors()
}
fun getUserErrors(userError: UserErrors):Any{
    return when(userError){
        UserErrors.EmailAndPasswordError ->{}
        CommonErrors.Authorise->{}
        CommonErrors.ServerError->{}

    }
}
sealed class LoginErrors{
    object LoginError: LoginErrors()
   // data class ErrorTwo(val commonErrors: CommonErrors): LoginErrors()
}*/
