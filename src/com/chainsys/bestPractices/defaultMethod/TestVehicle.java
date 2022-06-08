package com.chainsys.bestPractices.defaultMethod;

import com.chainsys.bestPractices.defaultMethod.Ivehicle.Bike;
import com.chainsys.bestPractices.defaultMethod.Ivehicle.Car;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car firstCar = new Car();
firstCar.start();
firstCar.move();
	
	
	Bike firstBike= new Bike();
	firstBike.start();
	firstBike.move();
	}

}
