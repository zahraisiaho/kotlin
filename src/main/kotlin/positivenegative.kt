import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter number:")
    var num=me.nextDouble()

    if (num>0){
        println("$num is a positive number")
    }
    else if (num<0){
        println("$num is a negative number")
    }
    else{
        println("error")
    }
}