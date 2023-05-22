import java.util.Scanner
fun main(){
    var me= Scanner(System.`in`)

    print("Enter length:")
    var len= me.nextInt()

    print("Enter width:")
    var wid= me.nextInt()

    var per=((len+wid)*2)
    println("The perimeter is $per")
}