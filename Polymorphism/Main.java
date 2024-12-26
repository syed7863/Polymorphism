package syed;
//Base class
class Vehicle 
{
	void start()
	{
		System.out.println("Vehicle started");
	}
}
//subclass car
class Car extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Car Started");
	}
	
}

//subclass Motorcycle
class Motorcycle extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Motorcycle started");
	}
}
// Garage class
class Garage
{
	void serviceVehicle(Vehicle vehicle)
	{
		vehicle.start();
		System.out.println("Vehicle serviced");
	}
}
//main class
public class Main {

	public static void main(String[] args) {
		//create instances of car and motorcycle
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		
		//create an instance of garage
		Garage garage = new Garage();
		
		//service the vehicles
		garage.serviceVehicle(car);
		garage.serviceVehicle(motorcycle);
		

	}

}
