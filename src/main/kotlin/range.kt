fun main(){
    for (number in 10..20){
        println(number)
    }
    for (letter in 'a'..'f'){
        if (letter=='c'){
            continue
        }
        println(letter)
    }
    for (num in 10..15){
        println(num)
        if (num==12){
            break
        }
    }
    for (num in 10..15){
        if (num==12){
            continue
        }
        println(num)
}}