# Design Pattern - Factory

_A centralized way for instantiating an object from group of related concrete classes via method that takes in input to specify the concrete class. Classes a grouped by implementing a common interface or extending an abstract class._


_The factory design pattern is creational design pattern that centralizes the creation of object to a factory method. It indirectly creates a an object based on an input. This design pattern abstracts an encapsulates the how an object created away from the logic of the client._ 

  - It used when you don't know ahead of time what class object you need.
  - When all of the potential classes are in the same subclass hierarchy. 
  - To centralize class selection code. 
  - When you don't want the user to know every subclass.
  - To encapsulate the object creation. 

## Problem: 
  _We are creating a toy factory that produces a variety of toys.
  _The factory design pattern solves the problem of directly creating an object by having to specify the class. 

  ```
    class Main { 
      public static void main(String[] args) {
        // Tight Coupling 
        // directly instantiating from another class
        Hero ironMan = new Hero("I am Iron Man!", "Iron Man", 75);

        Villian thanos = new Villian("I am inevitable!", "Thanos", 95, 2);

        callHulk().sayCatchPhrase();
      }

      public static Hero callHulk() {
        Hero hulk = new Hero(" Hulk Smash", "Hulk", 85);
        return hulk;
      }
    }
  ```



Define an interface for creating families of related or dependent objects without specifying their concrete classes

  The factory class prevents “coupling” of the client code that uses a class, to the class itself. For example, if my class “ScottClass” has a line “var x = new OtherClass()” , that couples ScottClass to Otherclass. Not necessarily a problem if your program doesn’t have many places where it creates “Otherclass’s” but if you have an object new’d in many places, that’s a lot of coupling.
 

create objects via a method from a selected concrete class. It class that instantiates an object that has method to create a selected object from a concrete class._

The creational design pattern is concerned with the method of creating objects. 

The structure of the application as the entry point or the client code, the  An interface or abstract class is responsible for how objects should be created within the concrete subclass. Concrete means the the class instantiates an object. An abstract class is only inherited from and not instantiated. 





  