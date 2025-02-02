package com.vaddi.java.defaultandstaticmethodsininterface;

public class MultiAlaram implements Vehicle, Alaram{

	private final String brand;

    public MultiAlaram(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The MultiAlaram is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The MultiAlaram is slowing down.";
    }
	
	@Override
	public String turnAlarmOff() {
		return Vehicle.super.turnAlarmOff();
	}

	@Override
	public String turnAlarmOn() {
		return Vehicle.super.turnAlarmOn();
	}

}
