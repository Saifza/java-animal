package com.java.polymorphism;

public class Farm {

	  
	
	public static void main(String[] args) {
		
		Animal animalDuck= new Duck(); // an object of Duck with Animal Reference.
		Animal animalGoat= new Goat(); // an Object of Goat with Animal reference.
		Animal animalAnimal= new Animal();   // an object of Animal and the reference is Animal.
		Duck duckDuck= new Duck();
	
	//	animalDuck.animalEats(animalDuck);// an Object of Duck calling an instance method that is overridden in Duck class.
		
	//	animalAnimal.animalEats(animalAnimal);
		AnimalActions.animalFood(animalGoat);// an Object of Goat is passed as a parameter in the static method
		                                       // animalFood of AnimalActions class to get the food of Goat.
		AnimalActions.animalSound(animalGoat); // an Object of Goat is passed as a parameter in the static method
												// animalSound of AnimalActions class to get the sound of Goat.
		
		AnimalActions.animalFood(animalDuck);
		
		AnimalActions.animalSound(animalAnimal);
		
		animalDuck.animalName(animalDuck);      
		animalGoat.animalName(animalGoat);
		animalAnimal.animalName(animalAnimal);
		
		animalDuck.myStaticMethod();   // the warning is, static methods should be accessed in a static way.
	    animalGoat.myStaticMethod();   // the warning is, static methods should be accessed in a static way,
	                                   // not by an object of the class but by the class itself.
		animalAnimal.myStaticMethod();  //similar warning as above
		duckDuck.myStaticMethod();     //similar warning
		
		Animal.myStaticMethod(); //proper way to call the static method.
		Duck.myStaticMethod();  //proper way to call the static method.
	}

}
