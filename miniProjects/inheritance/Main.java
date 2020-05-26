import inventory.Vehicle; 
import inventory.Truck;

class Main {
  public static void main(String[] args) {
    
    Vehicle myVehicle = new Vehicle();
    myVehicle.setMake("Honda");
    myVehicle.setModel("Civic");
    // println or print calls the toString method by default
    System.out.println(myVehicle);

    Truck myTruck = new Truck("Ford", "F150", 500, true);
    System.out.println(myTruck);
  }
}

