package com.java.polymorphism;


public class Duck extends Animal {
	
	private int legs=2;
	
	@Override
	public int getLegs() {
		return legs;
	}

	@Override
public void animalSays(Animal a) {
	
	System.out.println("Quack");
}	
	@Override
  public void animalEats(Animal a) {
	
	System.out.println("Duck eats wheat ");
     }
	

  @Override
  public  void animalName(Animal a) {
		
		System.out.println("The animal is: "+ a+ " and it has "+a.getLegs()+ " legs");
	}

public static void myStaticMethod() {
	  
	  System.out.println("In Duck class");
  }
  public String toString () {
		return "Duck";
	}
}
