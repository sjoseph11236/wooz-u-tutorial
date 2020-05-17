import java.util.*;
import static java.lang.Integer.bitCount;

public class NextHigher {
  
  // My Answer
//   public static int nextHigher(int n) {
//     int result;
// //     change n to binary
//     String convertedBinary = toBinary(n);
// //  count and store the number of ones. 
//     int target = countBitOnes(convertedBinary);
// // loop from the number 
//     n = n + 1; 
  
//     while(true) {
//       String convertCurrToBinary = toBinary(n);
//       int currCount = countBitOnes(convertCurrToBinary);
      
//       if(currCount == target) {
//         result = n;
//         break; 
//       }
  
//       n++;
//     }

//     return result;
//   }
  
//   public static String toBinary(int n) {
//     return Integer.toBinaryString(n);
//   }
  
//   public static int countBitOnes(String binaryNum) {
//     int count = 0; 
    
//     for(int i = 0; i < binaryNum.length(); i++) {
//       char bit = binaryNum.charAt(i);
      
//       if(bit == '1') {
//         count++;
//       }
//     }
    
//     return count;
//   }
  
  // public static int nextHigher(int n) {

  //   long inputNumberOf1 = numberOf1(n);
  //   int result = n + 1; 
  //   while(numberOf1(result) != inputNumberOf1) {
  //     result++;
  //   }

  //   return result;
  // }
  // private static long numberOf1(int number){
  //   return Stream.of(Integer.toBinaryString(number).split(""))
  //     .filter(bit -> bit.equals("1"))
  //     .count();
  // }

  // public static int nextHigher(int n) {
  //   for(int currBitCount = bitCount(n), i = n + 1; ; i++) if (bitCount(i) == currBitCount) return i;
  // }
}