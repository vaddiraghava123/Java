package com.vaddi.java.allmainclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.vaddi.java.jdk8.ImplementFunctionInterface1;
import com.vaddi.java.jdk8.TestFunctionalInterface;
import com.vaddi.java.recordclass.StudentRecord;
import com.vaddi.javabasics.custommarkerandclone.Address;
import com.vaddi.javabasics.custommarkerandclone.EmployeeClone;
import com.vaddi.javabasics.custommarkerandclone.FuncInterface;
import com.vaddi.javabasics.custommarkerandclone.NonCustomMarkerImplementation;
import com.vaddi.javabasics.custommarkerandclone.TestJavaClass;
import com.vaddi.javabasics.custommarkerandclone.customMarkerImplementation;
import com.vaddi.javabasics.custommarkerandclone.customMarkerInterface;


public class BasicJavaProgram {
	static TestJavaClass t = new TestJavaClass() {
		@Override
		public String message() {
			// TODO Auto-generated method stub
			return super.message();
		}

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	public static void main(String...strings) {	
		HashMap<String, String> oddNumbers = new HashMap<>();
		oddNumbers = new HashMap<>();
		oddNumbers.put("Three", "3");
		oddNumbers.put("Five", "5");
		oddNumbers.put("Seven", "7");
		oddNumbers.putIfAbsent("Nine", "9");

		if (oddNumbers.containsKey("Seven")) {
			System.out.println("Key exist");
		}

		if (oddNumbers.containsValue("5")) {
			System.out.println("Value exist");
		}

		boolean oldValue = oddNumbers.replace("Seven", "7", "17");

		oddNumbers.replaceAll((k, v) -> v += " Test");

		System.out.println("HashMap::" + oddNumbers + " OLd Value::" + oldValue);
		System.out.println("Get value::" + oddNumbers.get("Three"));

		System.out.println(oddNumbers.getOrDefault("Three", "Default Value"));
		System.out.println(oddNumbers.getOrDefault("Eight", "Default Value"));

		oddNumbers.forEach((k, v) -> {
			v += " Updated";
			System.out.println("Key::" + k + " Value:: " + v);
		});

		for (Map.Entry<String, String> entry : oddNumbers.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();

			System.out.println("Key::" + k + " Value:: " + v);
			System.out.println("Entry::" + entry);

		}

		System.out.println("Keys::" + oddNumbers.keySet());
		System.out.println("Values::" + oddNumbers.values());

		oddNumbers.merge("Three", "3 Test", (old, newValue) -> old + newValue);

		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.merge("One", "3 Test", (old, newValue) -> old + newValue);

		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.compute("One", (k, v) -> "");
		
		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.computeIfAbsent("Two", (k) -> "100");
		
		System.out.println("Upadted Values::" + oddNumbers);
		
		oddNumbers.computeIfPresent("Two", (k, v) -> v + " - 100");
		System.out.println("Upadted Values::" + oddNumbers);
	
		
		int[] a = new int[3];		 
        a[1] = 50; 
        Object o = a; 
        int[] b = (int[])o;
         b[1] = 100;
         System.out.println(a[1]);
         ((int[])o)[1] = 500;
         System.out.println(a[1]);
		try {
			System.out.println("Message is ::"+t.message());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer strBuffer = new StringBuffer();
		String str ="This is Raghavendra Vaddi from Java";
		/*
		 * System.out.println("Reverse the string :: "+
		 * strBuffer.append(str).reverse()); strBuffer.delete(0, str.length()); String[]
		 * strVal = str.split(" ");
		 */
		
		Stack<String> st = new Stack();
		String[] strVal = str.split(" ");
		for(String s : strVal) {
			st.push(s);
		}
		String str1 ="This is Raghavendra Vaddi from Java";
		StringBuffer sb = new StringBuffer();
		while(!st.isEmpty()) {
			sb.append(st.pop()+" ");
		}
		
		StringBuffer sb1 = new StringBuffer(str1);
		
		System.out.println("Stack Reverse "+ sb + "::"+ sb1.reverse());
		/*
		 * for(int i = strVal.length-1; i >=0;i--) { strBuffer.append(strVal[i]+" "); }
		 */
		System.out.println("Reverse the string 2 :: "+ strBuffer);
		
		combineTwoArrays();
		implementFunctionaInterface();
		stringToCharacter();
		stringBasics();
		functionInterfaceJava8();
		recordClass();
		callAndImplementFunctionalInterface();
		testStringBuilder();
		stringReverseOrder();
		optionalClass();
		listToMap();
		armstrongNumber(153);

		MainClass.SubClass.m1();

		Address address = new Address("sss","ssss");
		EmployeeClone emp = new EmployeeClone("Raghava","n@test.com",address);
		try {
			EmployeeClone emp2 = (EmployeeClone) emp.clone();
			emp2.setEmail("changed@ch.com");
			emp2.getAddress().setApt("RGSFS");
			System.out.println("Cloning emp :: "+emp);
			System.out.println("Cloning emp2 :: "+emp2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static void armstrongNumber(int i) {
		
		int len = String.valueOf(i).length();
		
		int originalValue = i;
		int sum = 0;
		while(originalValue != 0) {
			int lastDigit = originalValue % 10;
			int temp = 1;
			
			for(int j =0; j < len; j++ ) {
				temp = temp * lastDigit;
			}
			sum = sum + temp;
			originalValue = originalValue / 10;
		}
		if( sum == i) {
			System.out.println("Armstrong :: " + i);
		} else {
			System.out.println(" Not Armstrong :: " + i);
		}
		
	}

	private static void listToMap() {

		List<ListClass> values = new ArrayList<>();
		values.add(new ListClass(23,"Gdfd"));
		values.add(new ListClass(234,"Test"));
		values.add(new ListClass(235,"Bara"));
		values.add(new ListClass(236,"Yer"));

		Map<Integer, String> mapValues = values.stream()
				.collect(Collectors.toMap(ListClass::getId, ListClass::getName, (oldValue, newValue) -> oldValue));

		mapValues.forEach((k,v) -> System.out.println("Values are "+ k + " : "+ v));
		
		Map<Integer, String> mapValues1 = values.stream()
				.collect(Collectors.toMap(ListClass::getId, ListClass::getName, (oldValue, newValue) -> newValue));

		mapValues1.forEach((k,v) -> System.out.println("Values1 are "+ k + " : "+ v));
	}

	private static void optionalClass() {
		List<String> val = Arrays.asList("Raghava","Vaddi","Oorvin","Thul");

		Optional<String> s = val.stream().filter(x -> x.length() > 1).findFirst();

		if(s.isPresent()) {
			System.out.println("Value -> Optional :: "+s.get().toString());
		}

		String s1 = val.stream().filter(x -> x.length() > 10).findAny()
				.map(Object::toString).orElse("Default");

		System.out.println("Value -> toString() :: "+ s1);
	}

	private static void stringReverseOrder() {
		String str ="Raghava Vaddi Java Programming";

		String[] s = str.split(" ");

		List<String> result = Arrays.stream(s)
				.map((a) -> new StringBuilder(a).reverse().toString())
				.collect(Collectors.toList());
		System.out.println("Reverse order1 :: "+ result);

		String listString = result.stream().map(Object -> Object.toString())
				.collect(Collectors.joining(" "));

		System.out.println("Reverse order :: "+ listString+ "-"+ str.length());
	}

	private static void combineTwoArrays() {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8,9,10);

		List<List<Integer>> combine = Arrays.asList(list1,list2);

		combine.forEach(System.out::println);
		
		List<Integer> l = combine.stream().
		flatMap(val -> val.stream()).collect(Collectors.toList());
		
		String s = l.stream().map(val -> val.toString()).collect(Collectors.joining(","));
		System.out.println("Values are ::"+ l);

	}

	private static void implementFunctionaInterface() {
		String v = "Testing Functional Interface";
		FuncInterface fun = new FuncInterface() {

			@Override
			public String message(String value) {
				return value;
			}
		};

		System.out.println(fun.message(v));

		FuncInterface fun1 = (String) -> {
			return String;
		};

		System.out.println(fun1.message(v));


	}

	private static void stringToCharacter() {
		String name ="Raghavendra Vaddi";
		char[] c = name.toCharArray();
		for(char temp : c) {
			//System.out.println("Char values are :: "+ temp);
			
		}
		 Object[] ints = name.chars().mapToObj(i -> (char)i).toArray();

	       String subString = Arrays.stream(ints,0,ints.length).
	                             map(i -> (char)i).
	                             map(String::valueOf).
	                             filter(i -> !i.equals("a")).
	                             collect(Collectors.joining());
	       System.out.println("Value is :: "+ subString);
	}	

	private static void testStringBuilder() {
		StringBuilder s = new StringBuilder();
		s.append("Raghava");
		s.append("Vaddi");

		System.out.println(s);

	}

	private static void callAndImplementFunctionalInterface() {
		TestFunctionalInterface testFun = new ImplementFunctionInterface1();
		testFun.testingFunctionInterface("Welcome");
		//anonymous class
		TestFunctionalInterface i = new TestFunctionalInterface() {

			@Override
			public void testingFunctionInterface(String str) {
				System.out.println("Implement with Anonymous class" + str);
			}
		};
		i.testingFunctionInterface("Raghava");
		//Lambda
		TestFunctionalInterface t = (String str) -> {
			System.out.println("Using Lambda Expression"+ str);
		};
		t.testingFunctionInterface("Raghavendra Vaddi");
		t.displayName("Testing");
		}

	private static void recordClass() {
		//Record class - to remove all boiler plate code of class
		StudentRecord studentRecord = new StudentRecord("Raghava", "te.t@gmail.com");
		studentRecord.name();

		Object studentRecord1 =null; 

		FileOutputStream out;
		try {
			out = new FileOutputStream("testout.txt");
			ObjectOutputStream o = new ObjectOutputStream(out);
			String s = studentRecord.name()+","+studentRecord.email();
			o.writeObject(s);

			o.close();
			out.close();

			FileInputStream in = new FileInputStream("testout.txt");
			ObjectInputStream inObj = new ObjectInputStream(in);
			studentRecord1 =  (Object) inObj.readObject();

			System.out.println("Deserailization " + studentRecord1);

			inObj.close();
			in.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(studentRecord.name());
	}

	private static void functionInterfaceJava8() {
		//Predicate - return boolean
		System.out.println("functionInterfaceJava8");
		Predicate<String> predicts = s->s.length()<51; 
		System.out.println(predicts.test("Raghava"));

		//Consumer - Modify data No output.only consumes
		Person p = new Person();
		Consumer<Person> c = setName->p.setName("Raghava");
		c.accept(p);
		System.out.println("Consumer ->"+ p.getName());

		//Function - Input and output as O/p
		Function<Integer, String> func= t -> t*10+"Multiply by 10";
		System.out.println(func.apply(20));

		//Supplier - Only output
		Supplier<Double> supp = ()->Math.random();
		System.out.println(supp.get());
		
		
		//Generics
		Integer[] integerValues = {2,3,4};
		parseIntegerUsingGenerics(integerValues);
		
		List<Integer> values = new ArrayList<>();
		values.add(23);
		values.add(213);
		values.add(213);
		int temp = values.get(0);
		
		int sumValue = values.stream().mapToInt(Integer::intValue).sum();
		System.out.println("***"+sumValue);
		//custom marker interface
		customMarkerImplementation c1 = new customMarkerImplementation();
		NonCustomMarkerImplementation n = new NonCustomMarkerImplementation();
		
		verifyCustomMarkerInterface(c1);
		verifyCustomMarkerInterface(n);
		
	}

	private static <T> void verifyCustomMarkerInterface(T obj) {
		
		if(obj instanceof customMarkerInterface){
			System.out.println("Calling marker Interface");
			((customMarkerInterface) obj).display();
		} else {
			System.out.println("Non Calling marker Interface");
		}
		
	}

	private static <T> void parseIntegerUsingGenerics(T[] integerValues) {
		for(T  i : integerValues) {
			System.out.println("Generic Values are :: "+ i);
		}
		
	}

	private static void stringBasics() {
		String name ="Raghava";
		System.out.println("Value is "+name.indexOf("a"));
		String s1 = new String("Raghava");
		String s2 = new String("Raghava");
		String s3 = "Raghava";
		String s4 = "Raghava";
		
		System.out.println("Values are  1:::  "+ s1 == s2);
		System.out.println("Values are c2:::  "+ s1==s3);
		System.out.println("Values are c12:::  "+ s3==s4);
		System.out.println("Values are  2:::  "+ s1.equals(s3));
		System.out.println("Values are 3 :::  "+ s3.equals(s4));
	}
}

class RecordClass {
	private String name,email;

	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecordClass other = (RecordClass) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "RecordClass [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RecordClass(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
}


class Person {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}

class ListClass {

	private String name;
	private int id;
	public ListClass(int i, String string) {
		this.id = i;
		this.name = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
class MainClass{
	int a =10;
	static int b =20;
	Integer i;
	Boolean b1;
	SubClass s = new SubClass();
	static class SubClass {
		static void m1() {
			System.out.println("--Dis m1() -- ");
			System.out.println("The value m1() :: " + b);
		}
		static void m2() {
			System.out.println("--Dis m2() -- ");
			System.out.println("The value m2() :: " + b);
		}
	}


}
