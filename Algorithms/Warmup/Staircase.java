import java.util.*;
import java.io.*;
import java.math.*;

// Prints stairs based on N levels
// See: https://www.hackerrank.com/challenges/staircase
class Staircase {
  static public void printStairs( int num ) {
    char stair[] = new char[num];
    for ( int i = 0; i < num; i++ ) {
      for ( int j = 0; j < num; j++ ) {
        int level = (num-1)-i;
	if (j < level )
	  stair[j] = ' ';
	else
	   stair[j] = '#';
      }
      System.out.println(String.valueOf(stair));
    }
  }

 public final static void main(String[] args)  {
    Staircase myStairs = new Staircase();
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();  // Get the factorial number

    myStairs.printStairs( num );

 } //main

}
