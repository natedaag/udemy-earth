package com.udemy.earth;

public class Zoo {

	public static void main(String[] args) {
		
		Animal rabbit = new Animal(1, "rabbit", true, "boy");
		Animal snake = new Animal(2, "snake", false, "Who knows");
		Animal panda = new Animal(5, "panda", true, "girl");
		
		Bird penguin = new Bird("Penguin", "Tuxedo", false, true);
		Bird pigeon = new Bird("Pigeon", "mottled", true, false);
		
		rabbit.about();
		rabbit.eat();
		snake.about();
		snake.nap();
		panda.about();
		panda.play();		
		
		penguin.about();
		penguin.activity();
		pigeon.about();
		pigeon.activity();
		
	}

}
