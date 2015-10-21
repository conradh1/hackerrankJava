import java.util.*;
import java.io.*;

class InsertSort1 {


public void insertionSort1(int ar[]) {
  int index;

  boolean sorted = false;
  while (!sorted) {
    sorted = true;
    for ( int i = 0; i < ar.length - 1; i++ ) {
      if ( ar[i] > ar[i+1] ) {
        printSwapArray(ar, i, i+1);
        ar = swap(ar, i,i+1);
        sorted = false;
      }
    }
  }
  // print sorted array
  for ( int i = 0; i < ar.length; i++ ) {
    System.out.print(ar[i]+" ");
  }
  System.out.println();
}

private int[] swap (int ar[], int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
        return ar;
}

// prints 10 entries per row
private void printSwapArray(int[] ar, int a, int b) {
  for ( int i = 0; i < ar.length; i++ ) {
    if ( ar[i] == ar[b] )
      System.out.print(ar[a]+" ");
    else
      System.out.print(ar[i]+" ");
  }
  System.out.println();
}

public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);

    InsertSort1 s1 = new InsertSort1();
    // get number of keys
    int n = scan.nextInt();  // Get the number of tests
    int[] ar = new int[n]; // holds the price for each flavor

    for (int i = 0; i < n; i++) {
	ar[i] = scan.nextInt();
    }
    s1.insertionSort1(ar);
 } //main

}
