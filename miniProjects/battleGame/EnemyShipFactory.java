public class EnemyShipFactory  { 
  // This class makes an object that will create a enemy ship when the makeEnemyShip method is called. 
  // This method will return an EnemyShip
  public EnemyShip makeEnemyShip(String newShipType) {
    
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