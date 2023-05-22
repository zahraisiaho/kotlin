import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    print("Enter name:")
    var name= readln()
    println("My name is $name")

    print("Enter age:")
    var age=read.nextInt()
    println("I am $age years 0ld")

    print("Enter a FL0AT:")
    var num=read.nextFloat()
    println("The number entered is $num")
}