package com.vaddi.java.solidprinciple.liskov;
// Liskov - : Subclasses should be replaceable by their base class without altering program correctness.

public class liskovPrincple {
	// Violating LSP: Square changes behavior of Rectangle
	class Rectangle {
	    int width, height;

	    void setWidth(int width) { this.width = width; }
	    void setHeight(int height) { this.height = height; }
	    int getArea() { return width * height; }
	}

	class Square extends Rectangle {
	    @Override
	    void setWidth(int width) {
	        super.setWidth(width);
	        super.setHeight(width); // Changes behavior unexpectedly
	    }

	    @Override
	    void setHeight(int height) {
	        super.setWidth(height);
	        super.setHeight(height);
	    }
	}

	// Correct: Avoid inheritance misuse
	abstract class Shape {
	    abstract int getArea();
	}

	class CorrectRectangle extends Shape {
	    int width, height;
	    @Override
	    int getArea() { return width * height; }
	}

	class CorrectSquare extends Shape {
	    int side;
	    @Override
	    int getArea() { return side * side; }
	}

}
