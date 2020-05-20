class Main { 
  public static void main(String[] args) {
    // Tight Coupling 
    // directly instaniting from another class
    Toy ironMan = ToyFactory.createToy("Hero", "Iron Man", " I am Iron man!", 75, null);
    Toy thanos = ToyFactory.createToy("Villian", "Thanos", "I am inevitable!" , 85, "Infinity Gaunlet");
    Toy redHulk = ToyFactory.createToy("Villian", "Red Hulk", "It culmnber time", 50, "cars");
    Villian  joker = new Villian("Put a smile on that face!", "Joker", 75, "Knife");
    System.out.println(thanos.getWeapon());
    System.out.println(ironMan.getWeapon());

    // ironMan.sayCatchPhrase();
  }
}

// class Main { 
//   public static void main(String[] args) {
//     // Tight Coupling 
//     // directly instaniting from another class
//     Hero ironMan = new Hero("I am Iron Man!", "Iron Man", 75);

//     Villian Thanos = new Villian("I am inevitable!", "Thanos", 95, 2);

//     callHulk().sayCatchPhrase();
//   }

//   public static Hero callHulk() {

//     Hero hulk = new Hero(" Hulk Smash", "Hulk", 85);

//     return hulk;
//   }

// }