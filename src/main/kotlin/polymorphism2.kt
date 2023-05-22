open class shape{
    open fun area(){
        println("Area")
    }
}
class circle:shape(){
    override fun area(){
        println("radius*radius*pi")
    }
}
class triangle:shape(){
    override fun area(){
        println("base*height*0.5")
    }
}
class rec:shape(){
    override fun area(){
        println("Length*width")
    }
}
fun main(){
    var cir=circle()
    cir.area()
    var tri=triangle()
    tri.area()
    var rec=rec()
    rec.area()
}