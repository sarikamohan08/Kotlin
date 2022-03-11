package forloop

fun main() {
    for (i in 1..10){
        println(i)
    }
    var myarraylist = arrayListOf("a","b","c","d","e")
    for(i in myarraylist){
        println(i)
    }
    for((i,j) in myarraylist.withIndex()){
        println("at position $i, comes $j")
    }
    var sum=0

    for(i in 1..20){
        sum+=i
    }
    println(sum)
}