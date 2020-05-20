public class Hero implements Toy{ 
  private String catchPhrase; 
  private String name;
  private int powerLevel; 

  public Hero(String catchPhrase, String name, int powerLevel) {
    this.catchPhrase = catchPhrase;
    this.name = name; 
    this.powerLevel = powerLevel;
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

  public void setCatchPhrase(String catchPhrahse) {
    this.catchPhrase = catchPhrahse;
  }

  public int getPowerLevel() {
    return this.powerLevel;
  }

  public void setPowerLevel(int powerLevel) {
    this.powerLevel = powerLevel;
  }

  public String getWeapon() {
    return null;
  }
}
