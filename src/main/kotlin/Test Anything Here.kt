class MyCars {
    var carName: String = ""
    var carYearMade: Int = 0
    var carInitials: Char = '\u0000'
}

fun main(){

    val subaru = MyCars()

    subaru.carName = "Subaru"
    subaru.carYearMade = 1994
    subaru.carInitials = 'S'

    println("The car is ${subaru.carName}, made in ${subaru.carYearMade} and is in the ${subaru.carInitials} series.")
}