fun main(){
    //Predefined functions
    println("Hello")

    var sqr=Math.sqrt(256.0)
    println(sqr)

    var round=Math.round(45.787)
    println(round)

    var num=Math.ceil(45.38)
    println(num)

    myFun()
    mysum()
    details("Zahra",18)
    details("Dennis",18)
    details("Sheila",17)
}

//User defined functions
fun myFun(){
    println("Today is Friday")
}

fun mysum(){
    var num1=34
    var num2=54

    val sum=num1+num2
    println(sum)
}
fun details(name:String, age:Int){
    println("$name is $age years old")
}