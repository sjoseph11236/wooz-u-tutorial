public class ATM {
    
  final int[] DENOMINATIONS = {500, 200, 100, 50, 20, 10 }; 
  
  public int solve(int n) {
  
    if(!isValidAmount(n)) {
      return -1; 
    }
    
    int result = 0; 
    // ---
    // My First Answer
    // for(int i = 0; i < DENOMINATIONS.length; i++) { 
    //   int denomination = DENOMINATIONS[i];
    //   while( denomination <= n) {
    //     result++;
    //     n-= denomination;  
    //   }
      
    //   if(n == 0) {
    //     break;
    //   }
    // }
    //---- 
    for( int denomination : DENOMINATIONS) {
      result += n / denomination;
      n %= denomination; 
    }


    return result; 
  }
 //  Must be divisble by 10
 // This is on the class for pontential use in other methods on the class
 // and its good practice to seperate logic so that methodas are only doing one task.
  private boolean isValidAmount(int n) {
    int test = n % 10; 
    
    if(test != 0 ) {
      return false; 
    }
    
    return true; 
  }
}