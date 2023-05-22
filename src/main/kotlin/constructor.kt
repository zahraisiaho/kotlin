class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){

    fun speak(talk:String){
        println("talk")
    }
}
fun main(){
    var dog1=Dog("Tito","Chihuahua","White",12,20)
    println(dog1.name)

    var dog2=Dog("Jade","German Shepherd","Brown",34,35)
    println(dog2.name)

    dog1.speak("Barking")
}