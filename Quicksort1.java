import java.util.*;
import java.io.*;

class QuickSort1 {

public QuickSort1(int ar[]) {
  int p = ar.length/2; //get the mid point

  int[] p1 = new int[p];
  int[] p2 = new int[p];

  if ( ar[0] > ar[p] ) {
    //sort left
    for ( int i = 0; i < p; i++) {
      p1[i] = ar[i];
    }
    int i= 0;
    int j = p1.length;
    while (i <= j) {
            if (i <= j) {
                p1 = swap(p1, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
    }
  }
  else {
    //sort right
    int j = 0;
    for ( int i = p; i < ar.length; i++) {
      p2[j++] = ar[i];
    }
    int i = 0;
    j = p2.length;
    while (i <= j) {
            if (i <= j) {
                p2 = swap(p2, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
    }
  }
  printArray(p1);
  printArray(p2);
  System.out.println();
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
}

public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);

    // get number of keys
    int n = scan.nextInt();  // Get the number of tests
    int[] ar = new int[n]; // holds the price for each flavor

    for (int i = 0; i < n; i++) {
	ar[i] = scan.nextInt();
    }
    QuickSort1 q1 = new QuickSort1(ar);

 } //main

}
