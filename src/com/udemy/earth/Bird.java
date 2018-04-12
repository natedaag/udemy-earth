package com.udemy.earth;

public class Bird extends Animal {
	
	public Bird(int age, String gender, int weightInPounds) {
		super(age, gender, weightInPounds);
	}

	@Override
	public void move() {
		System.out.println("flapping wings.");
	}
	
//	public void fly() {
//		System.out.println("I fly.");
//	}

}
