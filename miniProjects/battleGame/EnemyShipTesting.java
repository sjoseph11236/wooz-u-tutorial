import java.util.*;

public class EnemyShipTesting { 
    public static void main(String[] args) {
      
      // // Create a new UFO Ship using inhertiance
      // // This is not dynamic to for user input
      // EnemyShip ufoEnemyShip = new UFOEnemyShip();

      // doStuffEnemy(ufoEnemyShip);
      
      //---
      // While this is dynamic it doesnt encapsulate the code to provide security.

      // Initialize theEnemy to null.
      EnemyShip theEnemy = null; 

      // Scanner allowds for dynamic way for user input.
      Scanner userInput = new Scanner(System.in);
      
      // Store the user input
      String enemyShipOption = "";

      System.out.print("What type of Ship? (U / R)");

      // Check if the user wrote and submitted something. 
      if(userInput.hasNextLine()){ 
        // Re-assign the userInput to inputted text.
        enemyShipOption = userInput.nextLine();
      }

      if(enemyShipOption.equals("U")) {
        theEnemy = new UFOEnemyShip();
      }
      else if(enemyShipOption.equals("R")) {
        theEnemy = new RocketEnemyShip();
      }

      doStuffEnemy(theEnemy);

      userInput.close();
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {

      // Envoke the instance method to display the enemy ship
      anEnemyShip.displayEnemyShip();
      anEnemyShip.followHeroShip();
      anEnemyShip.enemyShipShoots();
    }
}