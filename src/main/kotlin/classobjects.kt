class Person {
    //Properties/variables/data members/attributes
    var name: String = "Zahra"
    var age: Int = 18
    var location: String = "Nairobi"
    var height: Double = 5.4

    //Methods/functions
    fun eat() {
        println("eating")
    }

    fun walk() {
        println("walking")
    }
}

fun main(){
        var teacher=Person()
        teacher.eat()
        println(teacher.name+" "+teacher.age+" "+teacher.location+" "+teacher.height)
    }
