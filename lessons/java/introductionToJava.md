# Introduction to Java

  _Java is computer programming language that enforces OOP model that was released by Sun Microsystems in 1995._

  JAVA 8 is a major feature release of JAVA programming language development. Features includes Streams API, Generics, etc. 
  
## Key Terms:
  - JVM: Java Virtual Machine
  - JRE: Java Runtime Environment
  - JDK: Java Development Kit


# Set-up :
  - Install visual Studio code. 
  - Java Extension Pack.
  - Java Development Kit in local environment
  - echo command in  linux is used to display line of text/string that are passed as an argument. 
  - [search Java jdk](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)

  - Environment variables are global system variables accessible by all the processes/users running under the Operating System (OS), such as Windows, macOS and Linux. Environment variables are useful to store system-wide values, for examples,
    - PATH: the most frequently-used environment variable, which stores a list of directories to search for executable programs.
  - macOS installer: 
    jdk-14..1_osx-x64_bin.dmg
  - check for java hom environment variable
  - [The JAVA_HOME environment variable contains the home location of an installed JDK.](https://medium.com/notes-for-geeks/java-home-and-java-home-on-macos-f246cab643bd)
    - /usr/libexec/java_home is the simplest maintainable way of setting
  export JAVA_HOME=$(/usr/libexec/java_home) 
  ```
    echo $JAVA_HOME
  ```
  - to check if JDK is set up: 

  ```
    java -version
    javac -version
  ```

## Main Class: 

_In every Java application there is an entry point class usually called Main._ 

_The class must match the name of the file in the directory._ 

## Key Terms for Main Method :
  _These terms make-up the main method signature._

 - **Public** : This the access modifier to the main method. It has to be public so that Java runtime can execute this method.
 - **Static** : A modifier for how the method should be accessed. The main method has to static so that JVM can load the class into memory and call the main method.
 - **Void** : Java main method doesn't return anything. 
 - **String[] args** : The main method single argument of type String array. Also called the Command-Line arguments.

## Key Terms: 
  - **int** : integer
  - **javac** : VS code CLI command for Java Complier
  - **Package java.lang** : Provides classes and interfaces that are fundamental to the design of the Java programming language.



## Data Types: 

```
  byte myByte = 128;   // Give an error to emphasis the capacity of byte. 
  byte myByte = 127; 	//1 byte	Stores whole numbers from -128 to 127
  System.out.println(myByte);

  short myShort = 128; //2 bytes	Stores whole numbers from -32,768 to 32,767
  int myInt = 10; 	// 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
  
  long myLong = 1282;  
  long myLong = 1282L;  //8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

      
  float  myFloat = 13.23 
  float  myFloat = 13.23f  //4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
  double myDouble = 112.3234343  //	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
   
  boolean myBoolean = true;  // 1 bit
  char myChar = 'S';  // 2 bytes	Stores a single character/letter or ASCII values
``` 

## Control Flow
  - if, else if and else
  - Switch
  - For Loop 
  - While Loop
  - Do While Loop

  - An Increment/decrement operator that is after a variable will increment/decrement after that line of code.
  - An Increment/decrement operator that is before a variable will increment/decrement on when the line of code is run. 

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

# Sources:

- [What is the Command-Line arguments?](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) 
- [Package java.lang](https://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html)
