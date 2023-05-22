import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Input temperature:")
    var temp=me.nextFloat()

    if (temp<37){
        println("It is too cold")
    }
    else if (temp>37){
        println("It is too hot")
    }
    else{
        println("Normal temperature")
    }
}