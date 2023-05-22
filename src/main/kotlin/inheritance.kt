//Parent/Super/Base class
open class Animal{
    var age=10
    var gender="Female"

    fun isMammal(){
        println("Animal is a mammal")
    }
}
//Child/Sub/Derived classes
class Duck:Animal(){
    var color="White"

    fun swim(){
        println("swimming")
    }
}
class Fish:Animal(){
    var caneat=true

    fun swim(){
        println("swimming")
    }
}
class Horse:Animal(){
    var iswild=false

    fun run(){
        println("running")
    }
}

fun main(){
    var d=Duck()
    println(d.color)

    var f=Fish()
    f.swim()
    var h=Horse()
}