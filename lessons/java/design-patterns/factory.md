# Design Pattern - Factory

_The factory design pattern is creational design pattern that uses the OOP principal of encapsulation to indirectly instantiate an object with a special factory method. The method serves to interface to the client how an object will be created. 

create objects via a method from a selected concrete class. It class that instantiates an object that has method to create a selected object from a concrete class._


  - It used when you don't know ahead of time what class object you need.
  - When all of the potential classes are in the same subclass hierarchy. 
  - To centralize class selection code. 
  - When you don't want the user to know every subclass.
  - To encapsulate the object creation. 