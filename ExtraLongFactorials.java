import java.util.*;
import java.io.*;
import java.math.*;

// Do N! on big integers using the BigInteger objects
// See: https://www.hackerrank.com/challenges/extra-long-factorials/submissions/code/14099336
class ExtraLongFactorials {
  static public void doFactorial( int num ) {
    BigInteger bigN = new BigInteger(String.valueOf(num));
    int fac = num;

    for ( int i = 1; i < num; i++ ) {
      fac--;
      BigInteger bigFac = new BigInteger(String.valueOf(fac));
      bigN = bigN.multiply(bigFac);
    }

   System.out.println( bigN );
  }
  static public void doFactorialSmall( int num ) {
    long N = num;
    int fac = num;
    for ( int i = 1; i < num; i++ ) {
      N = N*(Long.valueOf(fac-i));
    }

    System.out.println( N );
  }

 public final static void main(String[] args)  {
    ExtraLongFactorials myfac = new ExtraLongFactorials();
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the factorial number

    ExtraLongFactorials.doFactorial( num );

 } //main

}
