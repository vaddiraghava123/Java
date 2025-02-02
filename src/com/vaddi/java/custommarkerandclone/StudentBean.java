package com.vaddi.java.custommarkerandclone;

import java.util.Objects;

public class StudentBean {

	private final String name;
	private String email;
	public StudentBean(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", email=" + email + "]";
	}
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
		StudentBean other = (StudentBean) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	
	
}
