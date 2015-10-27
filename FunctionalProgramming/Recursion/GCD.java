import java.util.*;

// Search a sorted array 

public class GCD  {


// Returns index of the found element else -1
static public int getGCD( int num2, int num1) {      
    if ( num1 > num2 ) {
      //swap
      int t = num1;
      num1 = num2;
      num2 = t;
    }

    int r =  num2 % num1;
    if ( r == 0) {
      return num1;
    }
    return getGCD ( num2, r);        
}




public static void main(String args[]) {
  Scanner scan = new Scanner(System.in);
  int num1 = scan.nextInt();  
  int num2 = scan.nextInt();  // Get the number of tests.
   
  System.out.println("GCD of "+num1+" and "+num2+" equals "+getGCD(num1, num2));
  

}

}