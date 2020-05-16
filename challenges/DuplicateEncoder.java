
import java.util.*;

public class DuplicateEncoder {
  static String encode(String word) {
    word = word.toLowerCase();
    String result = "";

    for(int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      result += word.lastIndexOf(letter) == word.indexOf(letter) ? "(" : ")";
    }

    return result;
  }
}

// // My answer
// public class DuplicateEncoder {
//   static String encode(String word){
// //     lowercase the word
//     word = word.toLowerCase();
    
//     String result = "";
    
//     HashMap <Character, Boolean> dictionary  = new HashMap<>();
    
//     for(int i = 0; i < word.length(); i++) { 
//        Character letter = word.charAt(i);
       
//        if(dictionary.get(letter) == null) {
//          dictionary.put(letter, false); 
//        }
//        else {
//          dictionary.put(letter, true);
//        }
//     } 
    
//     for(int j = 0; j < word.length(); j++) {
//       Character letter = word.charAt(j);
      
//       if(dictionary.get(letter) == false) {
//         result += "(";
//       }
//       else {
//         result += ")";
//       }
//     }
    

//     return result;
//   }
// }