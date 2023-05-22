class dog(var breed:String, var size:String, var age:Int, var color:String){
    fun eat(eating:String){
        println("Eating")
    }
    fun sleep(sleeping:String){
        println("sleeping")
    }
    fun sit(sitting:String){
        println("sitting")
    }
    fun run(running:String){
        println("running")
    }
}
fun main(){
    var dog1=dog("Neapolitan Mastiff","Large",5,"Black")
    println(dog1.breed)
    dog1.sit("Sitting")

    var dog2=dog("Maltese","Small",2,"White")
    println(dog2.breed)

    var dog3=dog("Chow Chow","Medium",3,"Brown")
    println(dog3.breed)
}