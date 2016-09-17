import java.util.*;
import java.io.*;

class CamelCase {

// https://www.hackerrank.com/challenges/camelcase


private static int countWords(String str) {


  int total = 1;
  for ( int i = 0; i < str.length(); i++ ) {
    char c = str.charAt(i);
    if ( Character.isUpperCase(c) ) {
      total++;
    }
  }

  return total;

}


 public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine(); // Scan input string

    System.out.println(countWords(input));
 } //main

}
