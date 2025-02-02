package com.vaddi.java.allmainclasses;

public class StaticClassMethod  {
    // Static field
    public static int staticCounter = 0;

    // Instance field
    public int instanceCounter = 0;

    // Static method
    public static void incrementStaticCounter() {
        staticCounter++;
    }

    // Instance method
    public void incrementInstanceCounter() {
        instanceCounter++;
    }

    public static void main(String[] args) {
        // Accessing static field and method without creating an instance
        System.out.println("Initial staticCounter: " + StaticClassMethod.staticCounter);
        StaticClassMethod.incrementStaticCounter();
        System.out.println("StaticCounter after increment: " + StaticClassMethod.staticCounter);

        // Creating instances of StaticExample
        StaticClassMethod example1 = new StaticClassMethod();
        StaticClassMethod example2 = new StaticClassMethod();

        // Accessing instance fields and methods
        System.out.println("Initial example1 instanceCounter: " + example1.instanceCounter);
        example1.incrementInstanceCounter();
        System.out.println("example1 instanceCounter after increment: " + example1.instanceCounter);

        System.out.println("Initial example2 instanceCounter: " + example2.instanceCounter);
        example2.incrementInstanceCounter();
        example2.incrementInstanceCounter();
        System.out.println("example2 instanceCounter after two increments: " + example1.instanceCounter +example2.instanceCounter);
        StaticClassMethod.incrementStaticCounter();
        // Static fields are shared across all instances
        System.out.println("StaticCounter after creating instances and increments: " + StaticClassMethod.staticCounter);
    }
}