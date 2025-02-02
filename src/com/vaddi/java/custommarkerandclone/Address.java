package com.vaddi.java.custommarkerandclone;

public class Address implements Cloneable{
	private String zipcode;
	private String apt;
	public Address(String zipcode, String apt) {
		this.zipcode = zipcode;
		this.apt = apt;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getApt() {
		return apt;
	}
	public void setApt(String apt) {
		this.apt = apt;
	}
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", apt=" + apt + "]";
	}
	
}
