import java.util.stream.*;


class Main { 
  public static void main(String[] args) {
    // System.out.println(addLetters("a", "b"));
    // System.out.println(addLetters("a"));

    int[] arr1 =  { 1,2,3 };
    int[] arr2 = { 4,5,6 };
    System.out.println(arrayPluseArray(arr1, arr2 ));
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
}