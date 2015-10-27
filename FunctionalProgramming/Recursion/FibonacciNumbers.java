import java.util.*;

// Search a sorted array 

public class FibonacciNumbers  {


// Returns index of the found element else -1
static public long fib( int num) {   
  if ( num == 0 )
    return 0;
  if ( num  <= 2)
    return 1;  
  return ( fib(num-1) + fib(num-2));
    
}




public static void main(String args[]) {
  Scanner scan = new Scanner(System.in);
  int num = scan.nextInt();    
   
  System.out.println("Fib of "+num+" is: "+fib(num) );
  

}

}