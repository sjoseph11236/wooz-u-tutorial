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

    // System.out.println(AbbreviateTwoWords("Sayeed Joseph"));

    // System.out.println(wideningCasting(5));
    // System.out.println(narrowCasting(5));
    
    // Object[] a = { 66, 42 };
    // Object x = 66;b

    // System.out.println(check(a , x));

    // System.out.println(expressionMatters(2, 1, 2));

    // System.out.println(sum(new int[]{1,2,3,4,5}));

    // System.out.println(toAlternativeString("Sayed Joseph"));

    String str =  "Hello";
    char letter = 'o';
    System.out.println(strCount(str, letter));
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
    // String[] splitNames = name.split(" ");
    // return(splitNames[0].charAt(0) + "." + splitNames[1].charAt(0)).toUpperCase();

    return Arrays.stream(name.split(" ")).map(String::toUpperCase).map(word -> word.substring(0,1)).collect(Collectors.joining("."));
  }

  public static double wideningCasting(int start) {
    double result = start; 
    return result; 
  }

  public static int narrowCasting(double start) {
    // int result = (int) start;
    int result = (int) start;
    return result;
  }

  public static boolean check(Object[] a, Object x) {
  
    // boolean result = false; 

    // for(Object value : a ) {
    //   if(value.equals(x)) {
    //     result = true;
    //   }
    // }

    //---------

    // return Arrays.asList(a).contains(x);

    // -------
    return Arrays.stream(a).anyMatch(e -> e == x);

  }

  public static int expressionMatters(int a, int b, int c) {
    // return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
    
    // -----
    // Vector <Integer> sums = new Vector();

    // sums.add(a + b + c);
    // sums.add(a * b * c);
    // sums.add((a + b) * c);
    // sums.add(a * (b + c));

    // Collections.sort(sums);

    // return sums.lastElement();

    // ------

    return IntStream.of(a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, a * (b + c)).max().getAsInt();
  }

  public  static int sum(int[] arr) {
    return Arrays.stream(arr).filter( value -> value > 0).reduce(0, (a, b) -> a + b);
  }

  public static String toAlternativeString(String string) {
    return Arrays.stream(string.split(""))
      .map(letter -> letter.matches("[A-Z]") ? letter.toLowerCase() : letter.toUpperCase()).collect(Collectors.joining(""));
  } 

  public static int strCount(String str, char letter) {
    int counter = 0; 

    char[] charArr = str.toCharArray();

    for(char character : charArr) {
      if(character == letter) {
          counter++; 
      }
    }

    return counter; 
  }
}