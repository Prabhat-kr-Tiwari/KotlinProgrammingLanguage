package ProgrammingSimplified.SealedClasses

import ProgrammingSimplified.SealedClasses.Abstract.LoadState
import ProgrammingSimplified.SealedClasses.Sealed.LoadState1

object Anything:LoadState()

//sealed class cannot be accessed outside the package or file
//object demo:LoadState1()