package functions
import java.util.*
 
fun Hello(name:String){
    println("inside function")
    println("im $name")
}

fun crazyString(sample : String){
    for(s in sample){
        print(s+"-")
    }
}

fun main() {
    Hello("sarika")
    crazyString("sarika")
}