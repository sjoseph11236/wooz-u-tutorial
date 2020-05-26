package inventory;

public class Truck extends Vehicle {
  
  private short cargoCapacity; 
  private boolean hasHitch = false; 

  public Truck(String make, String model, short cargoCapacity, boolean hasHitch) {
    // ingerting these properties
    super(make, model);
  
    this.hasHitch = hasHitch; 
    this.cargoCapacity = cargoCapacity;
  }
  public Truck(String make, String model, short cargoCapacity  ) {
    // ingerting these properties
    super(make, model);
    this.cargoCapacity = cargoCapacity;
  }

  public short getCargoCapacity() {
    return this.cargoCapacity;
  }

  public boolean getHasHitch() {
    return this.hasHitch;
  }

  public void setCargoCapacity(short cargoCapacity) {
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