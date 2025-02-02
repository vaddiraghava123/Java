package com.vaddi.javabasics.custommarkerandclone;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		EqualsDataModel equalsDataModel1 = new EqualsDataModel();
		equalsDataModel1.setId(1);
		equalsDataModel1.setName("Raghava");
		
		EqualsDataModel equalsDataModel2 = new EqualsDataModel();
		equalsDataModel2.setId(2);
		equalsDataModel2.setName("Raghava");
		//Shallow compare 
		System.out.println("Shallow compare :: "+ (equalsDataModel1 == equalsDataModel2));
		
		//DeepCompare
		System.out.println("Deep compare :: "+ (equalsDataModel1.equals(equalsDataModel2)));
	
	}

}
