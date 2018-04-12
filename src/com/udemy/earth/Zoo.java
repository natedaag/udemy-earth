package com.udemy.earth;

public class Zoo {

	public static void main(String[] args) {
		
		Sparrow birdOne = new Sparrow(1, "boy", 5);
		Chicken birdTwo = new Chicken(2,  "maybe", 6);
		Animal birdThree = new  Bird(5, "girl", 8);
		
		Animal penguin = new Bird(2, "boy", 3);
		Bird pigeon = new Sparrow(3, "girl", 22);
		
		Fish bass = new Fish(8, "girl", 12);
		Fish tuna = new Fish(3, "boy", 4);
		Chicken chicken = new Chicken(1,"girl", 7);
		
		
		birdOne.eat();
		birdOne.sleep();
		birdTwo.eat();
		birdTwo.sleep();
		birdThree.eat();
		birdThree.sleep();		
		
		penguin.eat();
		penguin.sleep();
		pigeon.sleep();
		pigeon.eat();
		
		bass.eat();
		bass.sleep();
		bass.swim();
		tuna.eat();
		tuna.sleep();
		tuna.swim();
		
		chicken.eat();
		chicken.move();
		
		moveAnimal(pigeon);
				
		Flyable birdFlies = new Sparrow(1, "m", 4);
		birdFlies.fly();
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	

}
