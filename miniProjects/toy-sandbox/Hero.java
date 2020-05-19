public class Hero implements Toy{ 
  String catchPhrase; 
  String name;
  int powerLevel; 

  public Hero(String catchPhrase, String name, int powerLevel) {
    this.catchPhrase = catchPhrase;
    this.name = name; 
    this.powerLevel = powerLevel;
  }

  public void sayCatchPhrase() {
    System.out.println(this.catchPhrase);
  }
}