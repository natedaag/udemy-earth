package com.udemy.earth;

public class Zoo {

	public static void main(String[] args) {
		
		Animal rabbit = new Animal(1, "boy", 5);
		Animal snake = new Animal(2,  "maybe", 6);
		Animal panda = new Animal(5, "girl", 8);
		
		Bird penguin = new Bird(2, "boy", 3);
		Bird pigeon = new Bird(3, "girl", 22);
		
		Fish bass = new Fish(8, "girl", 12);
		Fish tuna = new Fish(3, "boy", 4);
		Chicken chicken = new Chicken(1,"girl", 7);
		
		rabbit.eat();
		rabbit.sleep();
		snake.eat();
		snake.sleep();
		panda.eat();
		panda.sleep();		
		
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
				
	}

}
