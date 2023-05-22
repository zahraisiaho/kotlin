fun main(){
    var num=5

    var results=when (num){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        else->"Invalid number"
    }
    println("Number is $results")
}