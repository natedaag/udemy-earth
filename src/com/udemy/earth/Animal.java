package com.udemy.earth;

public class Animal {
	
	int age;
	String gender;
	int weightInPounds;
	
	public Animal(int age, String gender, int weightInPounds) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	
	public void eat() {
		System.out.println("I'm eating");
	}

	public void sleep() {
		System.out.println("I'm napping");
	}
	
}
