 class car {
     var make = "Toyota"
     var model = "Premio"
     var color = "Silver"
     var drivingSpeed = "120km/hr"

     fun drive() {
         println("Driving")
     }

     fun turn() {
         println("Turn here")
     }

     fun stop() {
         println("Stop here")
     }
 }

 fun main(){
         var car1=car()
         println(car1.model)

         var car2=car()
         car2.drive()
     }
