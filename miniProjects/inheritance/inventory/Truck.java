package inventory;

public class Truck extends Vehicle {
  
  private int cargoCapacity; 
  private boolean hasHitch = false; 

  public Truck(String make, String model, int cargoCapacity, boolean hasHitch) {
    // ingerting these properties
    super(make, model);
  
    this.hasHitch = hasHitch; 
    this.cargoCapacity = cargoCapacity;
  }

  public int getCargoCapacity() {
    return this.cargoCapacity;
  }

  public boolean getHasHitch() {
    return this.hasHitch;
  }

  public void setCargoCapacity(int cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  public void setHasHitch(boolean hasHitch) {
    this.hasHitch = hasHitch;
  }

  @Override
  public String toString() {
    return super.toString() + "\nhasHitch: " + this.hasHitch + "\nCargo Capacity: " + this.cargoCapacity;
  }
}