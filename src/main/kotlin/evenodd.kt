import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Input number:")
    var num=me.nextDouble()

    var y=num%2

    if (y>0){
        print("$num is an odd number")
    }
    else{
        println("$num is an even number")
    }
}