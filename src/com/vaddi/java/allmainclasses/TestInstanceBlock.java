package com.vaddi.java.allmainclasses;

public class TestInstanceBlock {

	public static void main(String[] args) {
		A.val1 = 30;
		int i =0;
		A a2 = new A();
		A a = new A(30,i);
		i =40;
		i++;
		A.val1 = 60;
		A a1 = new A(A.val1,i);
	}
}

class A {
	static int val1 =100;
	int val2;
	static {
		System.out.println("Static block ..."+ val1 + "::");
	}

	{
		System.out.println("Instance block 1 ..."+ val1 + "::"+ val2);
	}

	{
		System.out.println("Instance block 2 ..."+ val1 + "::"+ val2);
	}

	A(){
		System.out.println("Constructor block 1 ..."+ val1 + "::"+ val2);
	}

	A(int val1, int val2){
		System.out.println("Constructor block 12 ..."+ val1 + "::"+ val2);
	}
}
