#Java Project

This project is a simple Java application demonstrating object-oriented principles, including inheritance and polymorphism, through a series of classes representing animals and their actions.

## Project Structure

The project consists of the following classes:

1. **Animal**: The superclass with common properties and methods for all animals.
2. **Duck**: A subclass of `Animal` representing a duck.
3. **Goat**: A subclass of `Animal` representing a goat.
4. **Farm**: The main class with the entry point of the application.
5. **AnimalActions**: A utility class with static methods to perform actions on animals.

## Class Details

### Animal
```java
package com.java.polymorphism;

public class Animal {
    private int legs = 3; 
    
    public int getLegs() {
        return legs;
    }

    public void animalSays(Animal a) {
        System.out.println("Animal says words");
    }   
    
    public void animalEats(Animal a) {
        System.out.println("Animal eats food");
    }
    
    public void animalName(Animal a) {
        System.out.println("The animal is: " + a + ", this is from Animal class");
    }
    
    public static void myStaticMethod() {
        System.out.println("In superclass");
    }
    
    public String toString() {
        return "Animal";
    }
}

package com.java.polymorphim;

public class Duck extends Animal {
    private int legs = 2;
    
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
        System.out.println("Duck eats wheat");
    }

    @Override
    public void animalName(Animal a) {
        System.out.println("The animal is: " + a + " and it has " + a.getLegs() + " legs");
    }

    public static void myStaticMethod() {
        System.out.println("In Duck class");
    }

    public String toString() {
        return "Duck";
    }
}


package com.java.polymorphism;

public class Goat extends Animal {
    private int legs = 4;
    
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
        System.out.println("Goat eats Grass");
    }

    @Override
    public void animalName(Animal a) {
        System.out.println("The animal is: " + a + " and it has " + a.getLegs() + " legs");
    }
    
    public static void myStaticMethod() {
        System.out.println("In Goat class");
    }

    public String toString() {
        return "Goat";
    }
}


package com.java.polymorphism;

public class Farm {
    public static void main(String[] args) {
        Animal animalDuck = new Duck(); // an object of Duck with Animal Reference.
        Animal animalGoat = new Goat(); // an Object of Goat with Animal reference.
        Animal animalAnimal = new Animal();   // an object of Animal and the reference is Animal.
        
        animalDuck.animalEats(animalDuck); // an Object of Duck calling an instance method that is overridden in Duck class.
        animalAnimal.animalEats(animalAnimal);
        AnimalActions.animalFood(animalGoat); // an Object of Goat is passed as a parameter in the static method
                                              // animalFood of AnimalActions class to get the food of Goat.
        AnimalActions.animalSound(animalGoat); // an Object of Goat is passed as a parameter in the static method
                                               // animalSound of AnimalActions class to get the sound of Goat.
        
        animalDuck.animalName(animalDuck);      
        animalGoat.animalName(animalGoat);
        animalAnimal.animalName(animalAnimal);
        
        animalDuck.myStaticMethod();   // warning is static methods should be accessed in a static way.
        animalGoat.myStaticMethod();
        animalAnimal.myStaticMethod();
    }
}

package co.java.polymorphim;

public class AnimalActions {
    public static void animalFood(Animal a) {
        a.animalEats(a);
    }
  
    public static void animalSound(Animal a) {
        a.animalSays(a);
    }
}


How to Run
1. Clone the repository to your local machine.
2. Navigate to the directory where the project is located.
3. Compile the Java files using javac:

javac -d . Animal.java Duck.java Goat.java Farm.java AnimalActions.java

Run the Farm class:

java JavaPractice.Farm