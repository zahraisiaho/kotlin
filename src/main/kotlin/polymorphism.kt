//Parent class
open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

//Child class
class rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}
class square:Shape(){
    override fun draw(){
        println("Draw a square")
    }
}
fun main(){
    var rec=rectangle()
    rec.draw()
    var sq=square()
    sq.draw()
}
