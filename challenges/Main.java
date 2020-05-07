class Main { 
  public static void main(String[] args) {
    System.out.println(addLetters("a", "b"));
    System.out.println(addLetters("a"));
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
}