public class ToyFactory {
  public static Toy createToy(String instanceType, String name, String catchPhrase, int powerLevel, String weapon) {
    if(instanceType == "Hero") {
      return new Hero(catchPhrase, name, powerLevel);
    }
    else if(instanceType == "Villian") {
      return new Villian(catchPhrase, name, powerLevel, weapon);
    } 
    else {
      return null;
    }
  } 
}
