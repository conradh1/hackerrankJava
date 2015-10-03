import java.util.*;
import java.io.*;

class Anagram {

// https://www.hackerrank.com/challenges/anagram


private static char[] sortCharArray(char[] input) {
  int n = input.length;
  
  for (int j = 1; j < n; j++) {
    char key = input[j];
    int i = j-1;
    while ( (i > -1) && ( input [i] > key ) ) {
      input [i+1] = input [i];
      i--;
    }
    input[i+1] = key;
    
  }
  return input;
}

private static int getAnagram(String str) {

  int strSize = str.length();
  int numAna = 0;
  
  // Case odd number of characters
  if ((strSize % 2) != 0 ) {
    return -1;  
  }
  
  int mid =  (strSize/2);
  String str1 = str.substring(0,mid);
  String str2 = str.substring(mid);
  
  char[] letters1 = sortCharArray(str1.toCharArray());
  char[] letters2 = sortCharArray(str2.toCharArray());
  
  for ( int i = 0; i < letters1.length; i++ ) {
    if ( letters1[i] != letters2[i] ) numAna++;
  }
  
  return numAna;
}


 public final static void main(String[] args)  {
    
    Scanner scan = new Scanner(System.in);
    int tests = scan.nextInt(); // Obtain the number of tests.
    scan.nextLine();
    int[] anagrams = new int[tests];
    
    for ( int i = 0; i < tests; i++ ) {
      String input = scan.nextLine();   // Obtain string to find anagram
      anagrams[i] = getAnagram( input ); // get changes to make anagram
    }

    for ( int i = 0; i < tests; i++ ) {
      System.out.println(anagrams[i]);
    }



 } //main

}
