import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter first number:")
    var first=me.nextFloat()

    print("Enter second number:")
    var sec=me.nextFloat()

    print("Enter operation:")
    var op=me.next()

    var result=when (op){
        "+"-> first+sec
        "-"-> first-sec
        "/"-> first/sec
        "*"-> first*sec
        else->"Invalid operation"
    }
    println("Answer is $result")
}
