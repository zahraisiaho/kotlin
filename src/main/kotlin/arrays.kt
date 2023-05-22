fun main(){
    var lang= arrayOf("Python","JavaScript","Kotlin")
    lang[2]="c++"
    println(lang[2])

    var language=lang.plus("Laravel")
    for (x in language){
        println(x)
    }
    var size=lang.size
    println(size)

    println(language.size)

}