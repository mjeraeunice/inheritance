fun main() {
var vehicle= car("Jeep","Wrangler","Grey",5)
    vehicle.carry(4)
    println(vehicle.calculateParkingFees(3))
    vehicle.identity()
var bus= Bus("Isuzu","Scania","Beige",42)
    println(bus.maxTripFare(50.0))
    println(bus.calculateParkingFees(5))
}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
open  class car (var make:String, var model:String, var color: String, var capacity:Int){
    //- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
    fun carry(people:Int) {
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
    //- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
    fun identity(){
        println("I am a $color $make $model")
    }
    //- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
   open fun calculateParkingFees(hours:Int):Int{
        var parkingFee= hours*20
        return parkingFee
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
class  Bus( make:String,model:String, color: String, capacity:Int):car(make,model,color,capacity){
    //In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
  fun maxTripFare(fare: Double):Double{
      var maximumFare=fare*capacity
      return maximumFare
  }
    //The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var parkingFee= hours*20
        return parkingFee
    }
}
