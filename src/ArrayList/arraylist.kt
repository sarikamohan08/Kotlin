package ArrayList

fun main() {
    var myarraylist = arrayListOf("a","b","c","d","e")
    var myarraylist1= arrayListOf("f")

    println(myarraylist+myarraylist1)

    var myarraylist2 =myarraylist.subList(1,3)
    println(myarraylist2)
}