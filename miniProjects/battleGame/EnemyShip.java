public abstract class EnemyShip { 
  private String name; 
  private double amtDamage; 

  public String getName() { return name; };

  public void setName(String newName) { name = newName; };

  public double getDamage() { return amtDamage; };

  public void setDamage(double newAmtDamage ) { amtDamage = newAmtDamage; };

  public void followHeroShip() {
    System.out.println( getName() + " is following the hero");
  }

  public void displayEnemyShip() {
    System.out.println( getName() + " is  on the screen");
  }
  
  public void enemyShipShoots() {
    System.out.println( getName() + " attacks and does " + getDamage());
  }

    // This class makes an object that will create a enemy ship when the makeEnemyShip method is called. 
  // This method will return an EnemyShip
  public static EnemyShip makeEnemyShip(String newShipType) {
    
    if(newShipType.equals("U")) {
      
      return new UFOEnemyShip();
    }
    else if(newShipType.equals("R")) {
      return new RocketEnemyShip();
      
    }
    else if(newShipType.equals("B")) {
      return new BigUFOEnemyShip();
    }
    else { 
      return null;
    }
  }
}