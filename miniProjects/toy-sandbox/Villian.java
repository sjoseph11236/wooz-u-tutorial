public class Villian implements Toy{ 
  private String catchPhrase; 
  private String name;
  private int powerLevel;
  private String weapon;
  
  public Villian(String catchPhrase, String name, int powerLevel, String weapon) {
    this.name = name;
    this.catchPhrase = catchPhrase;
    this.powerLevel = powerLevel;
    this.weapon = weapon;
  }
  
  public void sayCatchPhrase() {
    System.out.println(this.catchPhrase);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name; 
  }

  public void setCatchPhrase(String catchPhrase) {
    this.catchPhrase = catchPhrase;
  }

  public int getPowerLevel() {
    return this.powerLevel;
  }

  public void setPowerLevel(int powerLevel) {
    this.powerLevel = powerLevel;
  }

  public String getWeapon() {
    return this.weapon;
  }

  public void another () {
    System.out.println("Another");
  }
}