package `class`

class Course (val  courseName:String , val courseType : String,val coursePrice :Int){
    fun printCourse(){
        println("course details [name =$courseName ,type =$courseType , price =$coursePrice]")
    }
}

fun main() {
    val python=Course("Python","video",500)
    python.printCourse()
}