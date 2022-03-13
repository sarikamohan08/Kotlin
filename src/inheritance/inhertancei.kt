package inheritance

open class  Account(open val name:String, open  val balance:Int) {
    fun printDetails() {
        println("Bank person deetails are :[name:$name , balance:$balance]")
    }

    fun welcome() {
        println("hello , $name,welcome to our bank")
    }

    open fun accountType1() {
        println("welcome $name to simple account")
    }
}

class savingAccount(override val name:String , override  val balance:Int):Account(name, balance){
    override fun accountType1(){
        println("welcome $name to saving account")
    }
}

fun main() {
    var sarika =Account(name="sarika", balance = 1000)
    sarika.accountType1()

    var kavya = savingAccount(name="kavya",balance=2000)
    kavya.accountType1()
}