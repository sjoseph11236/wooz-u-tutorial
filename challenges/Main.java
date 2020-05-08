import java.util.stream.*;
import java.util.*;

class Main { 
  public static void main(String[] args) {
    // System.out.println(addLetters("a", "b"));
    // System.out.println(addLetters("a"));

    // int[] arr1 =  { 1,2,3 };
    // int[] arr2 = { 4,5,6 };
    // System.out.println(arrayPluseArray(arr1, arr2 ));

    // System.out.println(points(new String[]
    // {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));

    System.out.println(AbbreviateTwoWords("Sayeed Joseph"));
  }

  public static String addLetters(String... letters) {
    // Store the alphabet
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    // Check if the letters is 0. 
    if(letters.length == 0) { 
      return "z";
    }

    int digit = 0; 
    int sum = 0; 

    for( int i = 0; i < letters.length; i++) {
      System.out.println("This is letters[i]: " + letters[i]);
      // find the letter position in alphabet
      digit = alphabet.indexOf(letters[i]) + 1;
      sum  += digit;
    }

    // Check for overlap
    if(sum  > 26) {
      sum = sum - 26; 
    }

    // convert the target char
    return Character.toString(alphabet.charAt(sum - 1));
  }

  public static int arrayPluseArray(int[] arr1, int[]  arr2) {
    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();

  }

  public static int points(String[] games) {
    int points = 0; 

    for(String game : games) {
      // make arry of strings split 
      String[] scores = game.split(":");
      
      System.out.println("This is scores: " + Arrays.toString(scores));
      int x = Integer.parseInt(scores[0]);
      int y = Integer.parseInt(scores[1]);
      

      points += x > y ? 3 : x < y ? 1 : 0; 
    }

    return points; 
  }

  public static String AbbreviateTwoWords(String name) {
    String[] splitNames = name.split(" ");

    return(splitNames[0].charAt(0) + "." + splitNames[1].charAt(0)).toUpperCase();
  }
}