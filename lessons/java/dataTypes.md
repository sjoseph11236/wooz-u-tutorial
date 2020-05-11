# Data Types: 
_Java has 8 primitive and Wrapper data types Java has server data types to represent numbers to accommodate for optimization in memory allocation._

  - **primitive / Wrapper**
  - byte   / Byte  (8-bit)
  - short / Short   (16-bit)
  - int / Integer (32-bit)
  - long / Long    (64-bit)
  - float / Float
  - double / Double
  
_A double is used for precision of an accurate decimal value_

  - boolean / Boolean (1-bit)
  - char / Character (single quotes only)
  - String (double quotes only)
 
 ### Implicit conversion(widening): 
  ```
     byte first = 3;
     short second = first; 
     int third = second;
     long fourth = third; 
     float fifth = fourth;
     double sixth = fifth;
     
     System.out.println(sixth);
  ```


### Implicit conversion (narrowing):
  _Adding the target data type to convert to inside the parentheses is casting._
    
  ```
    double d = 100.04;  
        
    // explicit type casting 
    long l = (long)d; 
        
    // explicit type casting  
    int i = (int)l; 
    System.out.println("Double value "+d); //100.04
        
    // fractional part lost 
    System.out.println("Long value "+l);  //100
        
    // fractional part lost 
    System.out.println("Int value "+i); //100
  ``` 
type promotion in java is when one operand is a long, float or double the whole expression is promoted to long, float or double respectively.

# Operators: 

  ### postfix:  
  ```
    int a = 10; 
    System.out.println(a++); 
    System.out.println(a);
  ```
  ### unary:   

  ```
    int b = 10; 
    System.out.println(++b);
    System.out.println(b);
  ```

# String Manipulation: 

  - **charAt()** :An accessor method to a get the character at particular index.
  ```
    String word = "Hello";
    char firstLetter = word.charAt(0);
    System.out.println(firstLetter); // "H" 
  ```
  - **substring()**   
  ```
      String word = "Hello";
      String newWord = word.substring(0,4);
      System.out.println(newWord);
  ```
  - **endsWith(),startsWith(), compareTo()**
  ```      
    String word = "a";
    String word = "Hello";
    System.out.println(word.endsWith("o")); //true
    System.out.println(word.startsWith("H")); //true
    
    // result is either greater than by, less than, equal to 0.
    System.out.println(word.compareTo("hello")); //-32
    System.out.println(word.compareTo("b")); //-1
  ```
  
  - **replace()**
  ```
    String word = "Hello";
    System.out.println(word.replace("H", "B")); //Bello
  ```
  ## [String concatenation](https://www.baeldung.com/java-strings-concatenation)
    - Use +
    - concat()
    - **String Builder** : declare to have initial size of 100 to make it efficent to concatenate Strings. 
  ```
    StringBuilder stringBuilder = new StringBuilder(100);
 
    stringBuilder.append("Baeldung");
    stringBuilder.append(" is");
    stringBuilder.append(" awesome");

    System.out.println(stringBuilder); // "Baeldung is awesome"
  ```
  - **join()** : Join an array of Strings with a common delimiter ensuring no spaces are missed. 

  ```
    String[] strings = {"Hello", "World"};
    String myString = String.join(" ", strings);
    System.out.println(myString); // "Hello World"
  ```
  
  ```
    //  Creating an arr of characters. 
    char[] characters = {'H', 'A', 'P', 'P', 'Y', 'L', 'E', 'A', 'R','N', 'I', 'N', 'G'};

    char[] newCharacters = new char[7];

    // Copying elements from one array to another.
    System.out.println(newCharacters.length); // 7
    System.arraycopy(characters, 0, newCharacters, 1, 5);
    System.out.println(new String(newCharacters)); // HAPPY
  ```
  