package com.techment.day5.oops;

class Car
{
	String carName;
	String carModel;
	Engine engine;
	public Car(String carName, String carModel, Engine engine) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = engine;
	}
	
	void displayCarInfo()
	{
		System.out.println("Car name : " + carName);
		System.out.println("Car model : " + carModel);
		System.out.println("Engine No. : " + engine.engineNo);
		System.out.println("Engine Type : " + engine.engineType);
	}
}

class Engine
{
	int engineNo;
	String engineType;
	public Engine(int engineNo, String engineType) {
		super();
		this.engineNo = engineNo;
		this.engineType = engineType;
	}
	
	
}
public class Car_Engine {

	public static void main(String[] args) {
	
		Engine eng = new Engine(12345,"4 Stock");
		Car car = new Car("Maruti","Swift",eng);
		car.displayCarInfo();
	}

}
