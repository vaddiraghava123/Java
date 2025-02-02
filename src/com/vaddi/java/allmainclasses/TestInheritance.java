package com.vaddi.java.allmainclasses;

public class TestInheritance {

	
		
public static void main(String[] args){
	A1 a = new A1();
	B b = new B();
	C c = new C();
//	b = a;
//	c = b;
	c =a;
	
		}
}
class C{}
class A1 extends B{
	String process(){
	return "I am A";
	}
	}
	class B extends C{
	B(){
	System.out.println("Hello " + process());
	}
	String process(){
	return "i am B";
	}
	}
