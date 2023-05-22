import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter first number:")
    var first=me.nextFloat()

    print("Enter second number:")
    var sec=me.nextInt()

    var rem=first%sec
    println("The remainder is $rem")

    var div=first/sec
    println("The quotient is $div")
}