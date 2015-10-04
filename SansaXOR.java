import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SansaXOR {
/*
 * See: https://www.hackerrank.com/challenges/sansa-and-xor
 */

    private static int sansaXor(int[] input) {
      int level = 0;
      int total = 0;
      //for ( int i = 0; i < input.length; i++ ) 
      //    System.out.print(input[i]+"|");
      do  {        
        for ( int i = 0; i < input.length-level; i++ ) {          
          //System.out.print("(");
          for ( int j = 0; j <= level; j++ ) {
            //System.out.print(input[i+j]+"x");
            total ^= input[i+j];
          }
          //System.out.print(")");
        }
        ++level;               
      } while ( level < input.length );
      //System.out.println(total);
      return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        int[] outputs = new int[tests];
        scan.nextLine();
        for ( int i = 0; i < tests; i++ ) {
          int size = scan.nextInt();
          scan.nextLine();
          scan.useDelimiter("[,\\s+]");
          //String input = scan.nextLine();
          //String[] strArray = input.split(" ", size);
          int[] intArray = new int[size];
          for ( int j = 0; j < size; j++ ) {
            intArray[j] = scan.nextInt();
          }
          outputs[i] = sansaXor(intArray);
          scan.useDelimiter("\n");
        }
        for ( int i = 0; i < tests; i++ ) {
          System.out.println(outputs[i]);
        }
   }
}
