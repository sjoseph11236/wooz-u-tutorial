import java.util.*;

public class Client { 
    public static void main(String[] args) {
      
      // // Create a new UFO Ship using inhertiance
      // // This is not dynamic to for user input
      // EnemyShip ufoEnemyShip = new UFOEnemyShip();

      // doStuffEnemy(ufoEnemyShip);
      
      //---
      // // While this is dynamic it doesnt encapsulate the code to provide security.

      // // Initialize theEnemy to null.
      // EnemyShip theEnemy = null; 

      // // Scanner allowds for dynamic way for user input.
      // Scanner userInput = new Scanner(System.in);
      
      // // Store the user input
      // String enemyShipOption = "";

      // System.out.print("What type of Ship? (U / R)");

      // // Check if the user wrote and submitted something. 
      // if(userInput.hasNextLine()){ 
      //   // Re-assign the userInput to inputted text.
      //   enemyShipOption = userInput.nextLine();
      // }

      // if(enemyShipOption.equals("U")) {
      //   theEnemy = new UFOEnemyShip();
      // }
      // else if(enemyShipOption.equals("R")) {
      //   theEnemy = new RocketEnemyShip();
      // }

      // doStuffEnemy(theEnemy);

      // --- 
      // create factory object to access method
      // try changing to method class
      // EnemyShipFactory shipFactory = new EnemyShipFactory();

      EnemyShip theEnemy = null; 

      Scanner userInput = new Scanner(System.in);

      System.out.println("What type of Ship (U / R / B)");

      if(userInput.hasNextLine()) {
        // Store the user input.
        String typeOfShip = userInput.nextLine();
        
        // // Create and assign the inputed ship to theEnemy
        // theEnemy = shipFactory.makeEnemyShip(typeOfShip);

        theEnemy = EnemyShip.makeEnemyShip(typeOfShip);
        
        // // if you make makeEnemyShip a static method 
        // theEnemy = EnemyShipFactory.makeEnemyShip(typeOfShip);
      }

      // check if there is an theEnemy
      if(theEnemy != null) {
        doStuffEnemy(theEnemy);
      }
      else { 
        System.out.println("Enter a U, R, or B next time");
      }
      userInput.close();
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {

      // Envoke the instance method to display the enemy ship
      anEnemyShip.displayEnemyShip();
      anEnemyShip.followHeroShip();
      anEnemyShip.enemyShipShoots();
    }
}