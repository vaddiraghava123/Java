package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonEnum singletonEnum = SingletonEnum.CONSTRUCT;
		
		//Serialize the Instance
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
			out.writeObject(singletonEnum);
		}
		
		
		//deSerialize the Instance
		SingletonEnum singletonEnum2;
		try(ObjectInputStream in =  new ObjectInputStream(new FileInputStream("singleton.ser"))) {
			singletonEnum2 = (SingletonEnum) in.readObject();
		}
		
		System.out.println("Hashcode of Instance1 :: "+ singletonEnum.hashCode());
		System.out.println("Hashcode of Instance2 :: "+ singletonEnum2.hashCode());
		System.out.println("Equal both  :: "+ (singletonEnum==singletonEnum2));
	}

}
