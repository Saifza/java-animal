package com.java.polymorphism;

public class AnimalActions {
	
	public static void animalFood(Animal a) {
		a.animalEats(a);
	}
  
	public static void animalSound(Animal a) {
		a.animalSays(a);
	}

	
	
}
