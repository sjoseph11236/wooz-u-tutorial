import java.util.*;

// // My Answer
// public class FindOutlier{
//   static int find(int[] integers){
  
//   ArrayList<Integer> even = new ArrayList<>();
//   ArrayList<Integer> odd = new ArrayList<>();
  
//   for( int elem : integers) {
//       if(elem % 2 == 0){ 
//         even.add(elem);
//       }
//       else {
//         odd.add(elem);
//       }
//   }
  
//   if(even.size() == 1) { 
//     return even.get(0);
//   }
//   else {
//     return odd.get(0);
//   }
// }}

public class FindOutlier { 
  public static int find(int[] integers) {
    int sum = Arrays.stream(integers).limit(3).map(elem -> Math.abs(elem) % 2).sum();
    // if sum is even we are looking for odd(1) and the opposite is true if sum is odd. 
    int mod = (sum == 0 || sum == 1) ? 1 : 0; 

    return Arrays.stream(integers).parallel()
      .filter(elem -> Math.abs(elem) % 2 == mod).findFirst().getAsInt();

  }
}

// public class FindOutlier{
//   static int find(int[] integers){
//     int[] sortedOdd = Arrays.stream(integers).filter(e -> e % 2 != 0).toArray();
//     int[] sortedEven = Arrays.stream(integers).filter(e -> e % 2 == 0).toArray();
  
//     if (sortedOdd.length == 1) {
//       return sortedOdd[0];
//     } else {
//       return sortedEven[0];
//     }
// }}
