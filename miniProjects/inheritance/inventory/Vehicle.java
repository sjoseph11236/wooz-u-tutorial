package inventory;

public class Vehicle {

  // properties
  private String make;
  private String model; 

  // Constructors  & Constructor Overloading
  public Vehicle() {}

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model; 
  }

  // Getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  // Setters
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "make: " + this.make + "\nmodel: " + this.model;
  }
}