import java.util.*;
import java.io.*;

class InsertSort2 {


public void insertionSort2(int ar[]) {
  int index;

  for ( int i = 0; i < ar.length - 1; i++ ) {
    index = i;
    for ( int j = i+1; j < ar.length; j++ ) {
      if ( ar[index] > ar[j] ) {
        index = j;
      }
    }
    swap(ar, index,i);
    printArray(ar);
  }
}

private int[] swap (int ar[], int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
        return ar;
}

// prints 10 entries per row
private void printArray(int[] ar) {
  for ( int i = 0; i < ar.length; i++ ) {
      System.out.print(ar[i]+" ");
  }
  System.out.println();
}

public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);

    InsertSort2 s2 = new InsertSort2();
    // get number of keys
    int n = scan.nextInt();  // Get the number of tests
    int[] ar = new int[n]; // holds the price for each flavor

    for (int i = 0; i < n; i++) {
	ar[i] = scan.nextInt();
    }
    s2.insertionSort2(ar);

 } //main

}
