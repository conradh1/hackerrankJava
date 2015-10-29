import java.util.*;
import java.io.*;

class InsertSort1 {

public void insertionSort(int array[]) {
  int size = array.length;
  int j = 0;
  for ( int i = 1; i < size; i++) {
    j = i;
    while ( j > 0 && array[j-1] > array[j] ) {      
        array = swap(array,j,j-1);
        j--;
        System.out.println(Arrays.toString(array));
    }        
  }

   System.out.println(Arrays.toString(array));
}


static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
}
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
