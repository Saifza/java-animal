package com.java.polymorphism;



public class Goat extends Animal {
	
	private int legs=4;
	
	@Override
	public int getLegs() {
		return legs;
	}
	
	@Override
	public void animalSays(Animal a) {
		
		System.out.println("Baa");
	}	
	
	@Override
public void animalEats(Animal a) {
		
		System.out.println("Goat eats Grass ");
	}


 @Override
  public  void animalName(Animal a) {
		
		System.out.println("The animal is: "+ a+ " and it has "+a.getLegs()+ " legs");
	}
	
 public static void myStaticMethod() {
	  
	  System.out.println("In Goat class");
 }
 
 
public String toString () {
	return "Goat";
}

}
