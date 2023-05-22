import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Input letter:")
    var let=me.next().single()

    when (let){
        'a','e','i','o','u'-> println("This letter is a vowel")
        else-> println("This letter is a consonant")
    }
}
