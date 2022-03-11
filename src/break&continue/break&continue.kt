package `break&continue`

fun main() {
    for(i in "sarikaa"){
        if(i =='i'){
            break
        }
        println(i)
    }
    println("outside the loop")
    for(i in "sarikaa"){
        if(i =='i'){
            continue
        }
        println(i)
    }
    println("outside the loop")
}