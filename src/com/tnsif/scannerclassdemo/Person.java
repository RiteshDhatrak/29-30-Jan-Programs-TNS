//to demonstrate scanner class
package com.tnsif.scannerclassdemo;

public class Person {
	
	//data member
	private String name;
	private int age;
	private String gender;
	private int income;
	private int tax;
	
	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	//object class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", income=" + income + ", tax=" + tax
				+ "]";
	}

	

}