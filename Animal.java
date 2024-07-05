package com.java.polymorphism;
public class Animal {
	private int legs=3 ; 
	
	public int getLegs() {
		return legs;
	}

	public void animalSays(Animal a) {
		
		System.out.println("Animal says words");
	}	
	
	public void animalEats(Animal a) {
		
		System.out.println("Animal eats food");
		
	}
	
	public  void animalName(Animal a) {
		
		System.out.println("The animal is: "+ a+ ", this is from Animal class");
	}
	
  public static void myStaticMethod() {
	  
	  System.out.println("In superclass");
  }
	
	public String toString () {
		return "Animal";
	}
}
