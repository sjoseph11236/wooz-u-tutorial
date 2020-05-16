import java.util.*;

// My Answer
// class LongestConsec {
    
//   public static String longestConsec(String[] strarr, int k) {  
// //       check for valid k or length
//   if(k <= 0 || strarr.length == 0 || k > strarr.length ) return "";

//   int interval = 0; 
//   int longest = 0; 
//   int current = 0; 
//   String result = ""; 
//   String temp = ""; 
//   int next = 0; 
  
//   for(int i = 0; i < strarr.length ; i++) {
//     while( interval < k && i + next < strarr.length ) {
//       String word = strarr[i + next];
//       current += word.length();
//       temp += word; 
//       interval++; 
//       next++; 
//     }
    
   
//     if(current > longest) {
//       result = temp; 
//       longest = current; 
//     }
    
//     temp = ""; 
//     interval = 0; 
//     current = 0; 
//     next = 0; 
//   }
     
//    return result;
//   }
// }

public class LongestConsec {
  public static String longestConsec(String[] strarr, int k) {
    
    String ans = "", test = "";

    if(k > 0) {
      for(int i = 0; i  <  strarr.length + 1 - k; i++) {
        test = String.join("", Arrays.copyOfRange(strarr, i, i + k));
        ans = ans.length() < test.length() ? test : ans; 
      }
    }

    return ans; 
  }
}