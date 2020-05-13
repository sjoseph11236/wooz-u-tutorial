package advanced;
import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    
    text = text.toLowerCase();

    int result = 0; 
    
    HashMap <Character, Boolean> dictionary = new HashMap<>();
    
    for(int i  = 0; i < text.length(); i++) {
        Character character = text.charAt(i);
        
        if(dictionary.get(character) == null) { 
          dictionary.put(character, false); 
        }
        else if(dictionary.get(character) == false) {
          dictionary.put(character, true);
          result++; 
        }
        
    }
    
    return result; 
  }
}