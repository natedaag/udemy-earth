package com.udemy.earth;

public class Bird {
	
	String name;
	String color;
	boolean flies;
	boolean swims;
	
	public Bird(String name, String color, boolean flies, boolean swims) {
		super();
		this.name = name;
		this.color = color;
		this.flies = flies;
		this.swims = swims;
	}
	
	public void about(){
		System.out.println("I'm a " + name);
	}
	public void activity() {
		System.out.println("I do stuff.");
	}

}
