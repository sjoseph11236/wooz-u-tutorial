import inventory.Vehicle; 
import inventory.Truck;

class Main {
  public static void main(String[] args) {
    
    Vehicle myVehicle = new Vehicle();
    myVehicle.setMake("Honda");
    myVehicle.setModel("Civic");
    // println or print calls the toString method by default
    System.out.println(myVehicle);

    System.out.println("---------");

    short cap = 500;
    // Truck myTruck = new Truck("Ford", "F150", 500, true);
    // Truck myTruck = new Truck("Ford", "F150", cap, true);
    Truck myTruck = new Truck("Ford", "F150", cap);

    System.out.println(myTruck);
  }
}

