open class Figure{
    var start="start"

    fun area(){
        println("Area")
    }
    fun perimeter(){
        println("Perimeter")
    }
    fun draw(){
        println("Draw")
    }
}
class Circle:Figure(){
    var radius="Radius"

    fun area2(){
        println("Radius*Radius*pi")
    }
    fun perimeter2(){
        println("radius*2*pi")
    }
    fun draw2(){
        println("round")
    }
}
open class Rectangle:Figure(){
    var width="Width"
    var height="Height"

    fun area3(){
        println("width*height")
    }
    fun perimeter3(){
        println("(width+height)*2")
    }
    fun draw3(){
        println("rectangular")
    }
}
class Square:Rectangle(){

}
fun main(){
    var cir=Circle()
    cir.area()
    cir.area2()
    var rec=Rectangle()
    rec.area3()
    var sq=Square()
}