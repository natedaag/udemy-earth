package com.udemy.earth;

public class Fish extends Animal {
	
	public Fish(int age, String gender, int weightInPounds) {
		super(age, gender, weightInPounds);
	}
	
	public void swim(){
		System.out.println("I swim.");
	}
	
	public void eat() {
		System.out.println("I eat.");
	}

	@Override
	public void move() {
		System.out.println("Fish swims.");
	}


}
