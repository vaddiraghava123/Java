package com.vaddi.java.designpatterns.creationalPattern.builderPattern;

public class BuilderClass {
	
	private String name;
	private String email;
	private String address;
	
	public BuilderClass(BuilderClassImplement builderClassImplement) {
		name = builderClassImplement.name;
		email = builderClassImplement.email;
		address = builderClassImplement.address;
	}

	public static class BuilderClassImplement {
		private String name;
		private String email;
		private String address;
		
		public BuilderClassImplement name(String name){
			this.name = name;
			return this;
		}
		
		public BuilderClassImplement email(String email){
			this.email = email;
			return this;
		}
		
		public BuilderClassImplement address(String address){
			this.address = address;
			return this;
		}
		
		public BuilderClass build(){
			return new BuilderClass(this);
		}
	}

	@Override
	public String toString() {
		return "BuilderClass [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
