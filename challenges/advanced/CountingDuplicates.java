package advanced;
import java.util.*;


// // My Solution
// public class CountingDuplicates {
//   public static int duplicateCount(String text) {
    
//     text = text.toLowerCase();

//     int result = 0; 
    
//     HashMap <Character, Boolean> dictionary = new HashMap<>();
    
//     for(int i  = 0; i < text.length(); i++) {
//         Character character = text.charAt(i);
        
//         if(dictionary.get(character) == null) { 
//           dictionary.put(character, false); 
//         }
//         else if(dictionary.get(character) == false) {
//           dictionary.put(character, true);
//           result++; 
//         }
        
//     }
    
//     return result; 
//   }
// }

// 

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int result = 0; 

    text = text.toLowerCase(); 

    while(text.length()  > 0 ) {
      //Using substring avoids having to convert into a char. 
      String firstLetter = text.substring(
        0,1 
      );

      // remove the first letter every iteration
      text = text.substring(1);     
      
      if(text.contains(firstLetter)) result++;
      // remove all other instances of the letter. 
      text = text.replace(firstLetter, "");
    }

    return result;
  }
}