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
}