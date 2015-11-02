import java.util.*;
import java.io.*;
import java.math.*;
/*
Returns the n member of an array that only has one instance (lonely).
See: https://www.hackerrank.com/challenges/lonely-integer
There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs only once.

Input Format

The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints

1≤N<100
N % 2=1 (N is an odd number)
0≤A[i]≤100,∀i∈[1,N]
Output Format

Output S, the number that occurs only once.
*/
class LonelyInteger {



static private int isLonley( int[] a ) {
  int lone = 0;

  for (int i = 0; i < a.length; i++)
    lone ^= a[i];
  return lone;
}


 public final static void main(String[] args)  {
    
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of elements
    int[] numbers = new int[num];
    scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
    for (int i = 0; i < num; i++) {
        int input = scan.nextInt();
	numbers[i] = input;
    }
    System.out.println(isLonley( numbers ));
 } //main

}
