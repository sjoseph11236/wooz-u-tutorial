public class Villian implements Toy { 
  String catchPhrase; 
  String name;
  int powerLevel;
  int stoneCount;

  public Villian(String catchPhrase, String name, int powerLevel, int stoneCount) {
    this.catchPhrase = catchPhrase;
    this.name = name; 
    this.powerLevel = powerLevel;
    this.stoneCount = stoneCount;
  }

  public void sayCatchPhrase() {
    System.out.println(this.catchPhrase);
  }
}