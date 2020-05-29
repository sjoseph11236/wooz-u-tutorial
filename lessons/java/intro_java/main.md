# Main Class: 

_In every Java application there is an entry point class usually called Main._ 

_The class must match the name of the file in the directory._ 

## Key Terms for Main Method :
  _These terms make-up the main method signature._

 - **Public** : This the access modifier to the main method. It has to be public so that Java runtime can execute this method.
 - **Static** : A modifier for how the method should be accessed. The main method has to static so that JVM can load the class into memory and call the main method.
 - **Void** : Java main method doesn't return anything. 
 - **String[] args** : The main method single argument of type String array. Also called the Command-Line arguments.



## Static method: 
  _A method on class that has static  keyword can only be accessed on the class._
  


  ```
    Class Main { 
      public static void main(String[] args) {
        add();
      }

      public static int staticAdd(int a, int b) {
        return a + b
      }
    }
  ```

  _A method without the static keyword can be access on the instance  of object of that class._

  ```
    Class Main { 
      public static void main(String[] args) {
        // Create an instance of
        Main main = new Main();
        // Invoke the main method on that instance
        main.add();
      }

      public int Add(int a, int b) {
        return a + b
      }
    }
  ```
