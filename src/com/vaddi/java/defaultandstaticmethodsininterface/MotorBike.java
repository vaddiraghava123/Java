package com.vaddi.java.defaultandstaticmethodsininterface;

public class MotorBike implements Vehicle{

	private final String brand;

    public MotorBike(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The MotorBike is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The MotorBike is slowing down.";
    }

}
