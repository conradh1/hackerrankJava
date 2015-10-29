import java.util.*;
import java.io.*;

class QuickSort1 {

public void partition(int ar[]) {  
  int pivot = ar[0];
  List<Integer> pl = new ArrayList<Integer>();
  List<Integer> pr = new ArrayList<Integer>();
    
  for (int i = 1; i < ar.length; i++ ) {
    if ( ar[i] < pivot ) 
      pl.add(ar[i]);
    else {
      pr.add(ar[i]);
    }
  
  }
  pl.add(pivot); // add the pivot to the left collection
  int i =0;
  for (Integer num : pl) {
     ar[i] = num;
     i++;
  }  
  for (Integer num : pr) {
     ar[i] = num;
     i++;
  }
  printArray(ar);
}



// prints 10 entries per row
private void printArray(int[] ar) {
  for ( int i = 0; i < ar.length; i++ ) {
      System.out.print(ar[i]+" ");
  }
  System.out.println("");
}

public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);

    // get number of keys
    int n = scan.nextInt();  // Get the number of tests
    int[] ar = new int[n]; // holds the price for each flavor

    for (int i = 0; i < n; i++) {
	ar[i] = scan.nextInt();
    }
    QuickSort1 q1 = new QuickSort1();
    q1.partition(ar);

 } //main

}
