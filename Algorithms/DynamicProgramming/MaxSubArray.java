import java.util.*;
import java.io.*;
import java.math.*;

class MaxSubArray {

public static int maxNonCont(int[] list) {
  int maxNonCont = 0;
  int maxNonContNeg = Integer.MIN_VALUE;
  for ( int i = 0; i < list.length; i++ ) {
    // great than zero, add to total
    if ( list[i] > 0 ) 
      maxNonCont += list[i];
    // find greatest negative number
    else if ( list[i] <= 0 && list[i] > maxNonContNeg)
      maxNonContNeg = list[i];
  }
  // found no positive numbers
  if (maxNonCont == 0 )
    maxNonCont = maxNonContNeg;
    
  return maxNonCont;
}

public static int maxCont(int[] arr) {
  int maxSoFar = arr[0];
  int currMax = arr[0];
                 
  for (int i = 1; i < arr.length; i++) {
      currMax = Math.max(arr[i], currMax + arr[i]);
      maxSoFar = Math.max(maxSoFar, currMax);
  }
  return maxSoFar;
}

public static int maxCont2(int[] list) {
  int best_start_index = -1;
  int best_end_index = -1;
  int current_index = -1;
  int best_sum = Integer.MIN_VALUE;
  int current_sum = 0;
  
  for ( int i = 0; i < list.length; i++) {
    int val = current_sum + list[i]; //add the sum plus the Ith value
    
    if ( val > best_sum  ) {
      if ( current_sum == 0)
        current_index = i;
      current_sum = val;
    }
    else 
      current_sum = 0;
    if ( current_sum > best_sum ) {
      best_sum = current_sum;
      best_start_index = current_index;
      best_end_index = i;
    }             
  }
  return best_sum;

}
 public final static void main(String[] args)  {
    
    
    Scanner scan = new Scanner(System.in);
    List<int[]> results = new ArrayList<int[]>();
    
    int num = scan.nextInt();  // Get the number of tests.        
        
    for (int i = 0; i < num; i++) {
       int size = scan.nextInt();  // Get the size of the array       
       int[] seq = new int[size];
       scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
       for (int j = 0; j < seq.length; j++ ) {
        seq[j] = scan.nextInt();
       }
       scan.useDelimiter("[\n]");  //Set the scanner delimiter to \s or ,
       results.add(seq);       
    }
    for (int[] list:results ) {
      System.out.println(maxCont(list)+" "+maxNonCont(list)); 
    }
    
 } //main

}
