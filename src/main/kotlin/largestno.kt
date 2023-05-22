import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter first number:")
    var first=me.nextFloat()

    print("Enter second number:")
    var sec=me.nextFloat()

    print("Enter third number:")
    var third=me.nextFloat()

    if (first>sec && first>third){
        println("$first is the largest number")
    }
    else if (sec>first && sec>third){
        println("$sec is the largest number")
    }
    else{
        println("$third is the largest number")
    }
}