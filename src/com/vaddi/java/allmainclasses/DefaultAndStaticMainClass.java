package com.vaddi.java.allmainclasses;

import com.vaddi.javabasics.defaultandstaticmethodsininterface.Car;
import com.vaddi.javabasics.defaultandstaticmethodsininterface.Vehicle;

public class DefaultAndStaticMainClass {

	public static void main(String[] args) {
		Vehicle vehicle = new Car("Car");

		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.turnAlarmOn());
		System.out.println(vehicle.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));

		Vehicle vehicle1 = new Car("MotorBike");

		System.out.println(vehicle1.getBrand());
		System.out.println(vehicle1.speedUp());
		System.out.println(vehicle1.slowDown());
		System.out.println(vehicle1.turnAlarmOn());
		System.out.println(vehicle1.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(200, 40));
	}
}
