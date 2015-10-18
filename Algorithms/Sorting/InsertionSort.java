import java.util.*;
import java.io.*;
import java.math.*;

/*
 Solves the hackerRank insertion part 1
 See: https://www.hackerrank.com/challenges/insertionsort1
*/
class InsertionSort {

  public static void insertSort( int[] list ) {
    int x = 0, j = 0;
    for ( int i = 1; i < list.length; i++ ) {
      x = list[i];
      j = i; 
      while ( j > 0 && list[j-1] > x) {
        list[j] = list[j-1];
        --j;
      }
      list[j] = x;
      System.out.println(Arrays.toString(list).replaceAll("[\\,\\[\\]\\ ]", ""));
    }
  }
  public final static void main(String[] args)  {
    
  Scanner scan = new Scanner(System.in);

  int num = scan.nextInt();  // Get the dimention of the array
  int[] inputArray = new int[num];
  scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
  for (int i = 0; i < num; i++) {
       inputArray[i]= scan.nextInt();       
  }
  insertSort( inputArray );
  
 } //main

}
