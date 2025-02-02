package com.vaddi.java.designpatterns.creationalPattern.builderPattern;

public class ImplementBuilderPattern {
	
	public static void main(String...args) {

			BuilderClass builder = new BuilderClass.BuilderClassImplement()
					.name("TestName")
					.build();

			System.out.println("Builder class ::"+ builder.toString());
	}

}
