class Main { 
  public static void main(String[] args) {
    // Tight Coupling 
    // directly instaniting from another class
    Hero ironMan = new Hero("I am Iron Man!", "Iron Man", 75);

    Villian Thanos = new Villian("I am inevitable!", "Thanos", 95, 2);

    callHulk().sayCatchPhrase();
  }

  public static Hero callHulk() {

    Hero hulk = new Hero(" Hulk Smash", "Hulk", 85);

    return hulk;
  }

}