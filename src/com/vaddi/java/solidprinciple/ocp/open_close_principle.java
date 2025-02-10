package com.vaddi.java.solidprinciple.ocp;
//Definition: A class should be open for extension but closed for modification.


//Violating OCP: Modifying class for new shape
public class open_close_principle {
		
	public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.width;
        }
        return 0;
    }
	
	// Correct: Use polymorphism to extend behavior
	abstract class Shape {
	    abstract double calculateArea();
	}

	class Circle extends Shape {
	    double radius;
	    @Override
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	class Rectangle extends Shape {
	    double length, width;
	    @Override
	    double calculateArea() {
	        return length * width;
	    }
	}
}
