package `class`
//
//class Man{
//    var name: String="sarika"
//    var Age : Int=20
//
//    fun walking(){
//        println("i can walk")
//    }
//
//    fun greet(name : String){
//        println("hello there ,$name")
//    }
//}

class Man(name:String , Age:Int){
    var name: String
    var Age : Int

    init{
        this.name=name
        this.Age=Age
    }

    fun walking(){
        println("i can walk")
    }

    fun greet(name : String){
        println("hello there ,$name")
    }
}

fun main() {
    var  man=Man("sarika",20)
    println(man.name)
    println(man.Age)
    man.walking()
    man.greet("sarika")
}