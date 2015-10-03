import java.util.*;
import java.io.*;

class TwoStrings {

// https://www.hackerrank.com/challenges/two-strings


private static boolean isSubString(StringBuffer str1, StringBuffer str2) {

  boolean isSubString = false;
  char[] letters1 = str1.toString().toCharArray();
  char[] letters2 = str2.toString().toCharArray();
  
    
  for ( int i = 0; i < letters1.length; i++ ) {
    for ( int j = 0; j < letters2.length; j++ ) {
      if (letters2[j] == letters1[i] ) {
        isSubString = true;
        return isSubString;
      }
    }    
  }  
  return isSubString;
}


 public final static void main(String[] args)  {
    
    Scanner scan = new Scanner(System.in);
    int tests = scan.nextInt(); // Obtain the number of tests.
    scan.nextLine();
    boolean[] subStrings = new boolean[tests];
    
    for ( int i = 0; i < tests; i++ ) {
      StringBuffer input1 = new StringBuffer();
      StringBuffer input2 = new StringBuffer();
      input1.append( scan.nextLine() );   // Obtain string to first string
      input2.append( scan.nextLine() );   // Obtain string to second string
      subStrings[i] = isSubString( input1, input2 ); // get changes to make anagram
    }

    for ( int i = 0; i < subStrings.length; i++ ) {
      if ( subStrings[i] ) 
        System.out.println( "YES" ); 
      else 
        System.out.println( "NO" ); 
    }
 } //main

}
