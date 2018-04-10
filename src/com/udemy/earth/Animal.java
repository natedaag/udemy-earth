package com.udemy.earth;

public class Animal {
	
	int age;
	String type;
	boolean furry;
	String gender;
	
	public Animal(int age, String type, boolean furry, String gender) {
		super();
		this.age = age;
		this.type = type;
		this.furry = furry;
		this.gender = gender;
	}
	
	public void about() {
		System.out.println("I'm a " + type);
	}
	
	public void eat() {
		System.out.println("I'm eating");
	}
	public void play() {
		System.out.println("I'm playing");
	}
	public void nap() {
		System.out.println("I'm napping");
	}
	
	
}
