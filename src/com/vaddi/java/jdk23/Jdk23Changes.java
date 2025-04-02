package com.vaddi.java.jdk23;

import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassModel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

/**
 *   IMP  : Before compile and execute .. add VM variable to the class
 *       "--enable-preview "
 *       
 * 1, Primitive Types in instanceof:
		Before Java 23: instanceof only worked with reference types.
		Since Java 23: You can directly use instanceof with primitive types for simpler type checks.
		
	2. Primitive Types in switch expressions:
		Before Java 23: switch expressions (introduced in Java 14) only supported 
				byte, short, char and int types.
		Since Java 23: We can now use switch expressions with all primitive types 
				(long, float, double, and boolean) for broader applicability.
	
	3. Traditional (/** ) Vs Markdown (///) documentation 
	
	3. Import module
		Syntax  : import module package_name
		Using this import all public classes and interfaces from package
		
		 Ex:- import module java.util   
		   Instead of declaring all below 
		        import java.util.List;
		        import java.util.Set;
		        
		      For Date Class conflict, 
		      			import module java.base;
		      			import module java.sql;
		      			
		      			Date d = new Date();  -> Conflict here
		      			
		      			so declare, 
		      				import java.util.Date;
		      				
		 4. 	Implicitly Declared Classes and Instance Main Methods
		 			println("Welcome");
		 			
		 5. Statements Before super(…) or this(…)
		 
		 6. ClassFile API -> To read the methods from the given class
		 
		 7. Stream -> gather()
		 
		 8. Scoped Values  
		  		To share immutable data with their callees within the same thread, as well as across child threads. 
		  		The key purpose is to avoid passing data manually between methods, especially in complex call chains,
		  		thus simplifying the flow of data in concurrent applications. 
 */
public class Jdk23Changes {
	public void main() {
		System.out.println("JDK 23 changes");
		primitiveTypeInstanceOf();
		primitiveTypeSwitch();
		traditionalAndMarkdownDocumentation();
		statementsBeforeSuperMethod();
		classFileAPI();
		streamGather();
		
	}

	/// Gather method - Intermediate Operation
	private void streamGather() {
		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		Stream<List<Integer>> gathered = s.gather(Gatherers.windowFixed(4));
		gathered.forEach(System.out::println); 
	}

	private void classFileAPI() {
		try {
			//Here not a .java file ... .class file required
			byte[] contents = Files.readAllBytes(Paths.get("G:\\Code Practise\\Java\\src\\com\\vaddi\\java\\jdk23\\Jdk23Changes.class"));
			
			 ClassModel classFile = ClassFile.of().parse(contents);
	            var method = classFile.methods().get(0);
	            System.out.println("Value is"+method.methodName().stringValue());
		
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}

	private void statementsBeforeSuperMethod() {
		B a = new B(23, 23);
		System.out.println(a.x + " : "+ a.y);
	}

	private void traditionalAndMarkdownDocumentation() {
			
		//Before Jdk 23		
		//Traditional documentation
		traditionaDocumentation(10);
		
		//After Jdk23
		//MarkDownDocumentation
		markdownDocumentation();
		
	}
	
	/// This method is markdownDocumentation Documentation
	//// parameters
	/// * `n`: the number 
	/// Returns:
	/// n
	private void markdownDocumentation() {
		
	}

	/**
	* This method is Traditional Documentation
	* @param n the number 
	* @return 0
	*/
	public static int traditionaDocumentation(int n) {
		return 0;
	}

	private void primitiveTypeSwitch() {
		double value = 3.90;
		switchMethods(value);
		
		float value_float = 1.3f;
		switchMethods(value_float);
	}

	private void switchMethods(double value) {
		switch(value) {
			case int i -> System.out.println("Value is an Integer");
			case float f -> System.out.println("Value is float");
			case double d -> System.out.println("Value is a Double");
			
		}
		switch(value) {
			case 1.0 -> System.out.println("Retrieve the value is "+   value);
			case 2.3 -> System.out.println("Value is 2.3");
			case 3.90 -> System.out.println("Value is matched");
			default -> System.out.println("Unexpected value: " + value);
		}
	}

	private void primitiveTypeInstanceOf() {
		int i =10;
		//Before Jdk 23
		if(i instanceof Integer) {
			System.out.println("Instance value is Integer");
		}
		// After Jdk23
		if(i instanceof int x && x ==3) {
			System.out.println("Instance value is int");
		}
	}
	
	public class A {
		A(int x, int y) {
			if(x < 0 && y <0 ) {
				throw new IllegalArgumentException("Coordinates must be positive number");
			} else {
				System.out.println("Coordinates are positive numbers");
			}
		}
	}
	
	public class B extends A{
		int x,y;
		@SuppressWarnings("preview")
		B(int x, int y) {
			if(x>0) {
				x=27;
			}
			super(x, y);
			this.x =x;
			this.y =y;
		}
		
		
	}

}
