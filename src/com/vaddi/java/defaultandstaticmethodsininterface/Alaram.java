package com.vaddi.java.defaultandstaticmethodsininterface;

public interface Alaram {

	default String turnAlarmOn() {
		  return "Turning the alarm on.";
		 }

		 default String turnAlarmOff() {
		  return "Turning the alarm off.";
		 }
}
