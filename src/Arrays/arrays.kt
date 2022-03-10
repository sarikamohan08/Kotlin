package Arrays

fun main() {
    var array1 =arrayOf("sarika","kavya")
    var array2= arrayOf("sarika",1,2)
    println(array1[0])

    array1[1]="mohan"

    println(array1[1])

    var numArray= intArrayOf(1,2,3,4)
    println(numArray[0])
    var stringArray = arrayOf("sarika","abhi","harish","pavi","sneha","janani")
    println(stringArray.size)

    println(stringArray.isEmpty())
    if(stringArray.contains("sarika")){
        println("friends forever!!")
    }else{
        println("nahh!")
    }
}