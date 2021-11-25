fun main() {
    val ss = stu("yasmin", 23, 12.9)

    ss.info()
    ss.speak("hello")
    println(ss.add(11,14))

}

class stu( var name: String, var age: Int, var GPA: Double) {
    fun info() {
        println("my name is $name\n and my age is $age\n and my is GPA $GPA \n")
    }

    fun speak(speak:String){
        println(speak)
    }
    fun add(n1: Int, n2: Int): Int {
        return n1 + n2

    }
}