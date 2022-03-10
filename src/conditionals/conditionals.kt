package conditionals

fun main() {
    val high: Int =100
    val current: Int = 100
    if (current < high){
        println("current is lesser than high")
    }else if(current==high){
        println("equal")
    } else{
        println("current is greater than high")
    }
}