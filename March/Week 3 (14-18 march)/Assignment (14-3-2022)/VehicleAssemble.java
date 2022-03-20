package march_14_Assignment;

class Vehicle {     //Parent class
	String engine;
	String speed;
	int wheels;
	String colour;
	
	public Vehicle(String engine, String speed, int wheels, String colour){  //Constructor
		this.engine=engine;
		this.speed=speed;
		this.wheels=wheels;
		this.colour=colour;
	}
	public void setEngine() {
		this.engine=engine;
	}
	public String getEngine() {
		return this.engine;
	}
	public void setSpeed() {
		this.speed=speed;
	}
	public String getSpeed() {
		return this.speed;
	}
	public void setWheels() {
		this.wheels=wheels;
	}
	public int getWheels() {
		return this.wheels;
	}
	public void setColour() {
		this.colour=colour;
	}
	public String getColour() {
		return this.colour;
	}

}

class Bike extends Vehicle {   //child class
	int gear;
	public Bike(String engine, String speed, int wheels, String colour, int gear) {
		super(engine, speed, wheels, colour);   //calling parent class by using super keyword
		this.gear=gear;
	}
	public int getGear() {
		return this.gear;
	}	
	public String toString() {
		return "Bike [Engine= " + this.getEngine() + ", Speed= " + this.getSpeed() + ", Wheels= " + this.getWheels()
				+ ", Colour= " + this.getColour() + ", Gear= " + this.gear + "]";
	}
}

class Truck extends Vehicle {  //child class
	int gear;
    String space;
	public Truck(String engine, String speed, int wheels, String colour, int gear, String space) {
		super(engine, speed, wheels, colour);
		this.gear=gear;
		this.space=space;
	}
	public int getGear() {
		return this.gear;
	}	
	public String getSpace() {
		return this.space;
	}	
	public String toString() {
		return "Truck [Engine= " + this.getEngine() + ", Speed= " + this.getSpeed() + ", Wheels= " + this.getWheels()
				+ ", Colour= " + this.getColour() + ", Gear= " + this.gear + ", Space= " + this.space + "]";
	}
}

//main body
public class VehicleAssemble {
	public static void main(String[] args) {

		Vehicle bike = new Bike("Available", "High", 2, "Black", 4);
		System.out.println(bike);

		Vehicle truck = new Truck("Available", "Medium", 4, "Red", 6, "Available");
		System.out.println(truck);
	}
}
