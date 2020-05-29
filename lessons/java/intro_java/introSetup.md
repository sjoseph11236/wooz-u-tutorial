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



## Key Terms: 
  - **int** : integer
  - **javac** : VS code CLI command for Java Complier
  - **Package java.lang** : Provides classes and interfaces that are fundamental to the design of the Java programming language.






# Sources:

- [What is the Command-Line arguments?](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) 
- [Package java.lang](https://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html)
