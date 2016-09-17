import java.util.*;
import java.io.*;

class SuperReducedString {

// https://www.hackerrank.com/challenges/reduced-string


private static void reduceString(String str) {



  for ( int i = 1; i < str.length(); i++ ) {
    if (str.charAt(i) == str.charAt(i-1)) {
      str = str.substring(0, i-1) + str.substring(i+1);
      i = 0;
    }
  }


  if ( str.length() != 0)  System.out.println(str);
  else System.out.println("Empty String");
}


 public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine(); // Scan input string

    reduceString(input);
 } //main

}
