fun main(){
    employee("Zahra Isiaho", "Kenyan", 300000,"single", false,"Managing Director",567898)
    employee("Michelle Asmani", "Tanzanian", 100000,"married",false,"Accountant", 950373)
    employee("Vicky Cherono", "Kenyan", 500000, "single",false,"Data Analyst", 894645)
    employee("Andrew Stone", "Australian", 800000, "married",false,"Engineer", 928454)
    employee("Moses Wena", "South African", 300000, "single",false, "Ass. Managing Director", 657695)
}

fun employee(name:String,citizenship:String,Salary:Int,Status:String,Disability:Boolean,Position:String,ID:Int){
   println("The following are employee details:")
   println("$name $citizenship $Salary $Status $Disability $Position $ID ")

}