package `when conditionals`

fun main() {
    var score : Int=15
    when(score){
        !in 5..10 -> println("not in range of  5 to 10")
        2, 3 -> println("score is 2 or may be 3")
        4 -> {
            println("you ve got high")
            println("score is 4")
        }
    }
}