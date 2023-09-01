fun main(){

    fun iterateRangeWithSkip (){
        val myList = mutableListOf(16, 27, 81, 95, 57, 34, 77, 1, 55, 85, 23, 34, 35)

        for (i in 0..myList.size step 2){ // (..) includes the last value. (until) does not.
            print("${myList[i]} ")
        }
        println()
    }

    iterateRangeWithSkip()


}
