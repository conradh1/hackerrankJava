import java.util.*;
import java.io.*;

class CutTheSticks {



private void doCut(int[] sticks) {
  boolean allZeros = false;

  int min = sticks[0];
  // find min value
  for ( int i = 1; i < sticks.length; i++ ) {
    if ( min > sticks[i] ) {
      min = sticks[i];
    }
  }

  while ( !allZeros ) {
    int cuts = 0; // number of cuts
    int nmin = 1001;
    for ( int i = 0; i < sticks.length; i++ ) {
      if ( sticks[i] > 0 ) {
	sticks[i] -= min;
	cuts++;
      }
      if (sticks[i] > 0 && sticks[i] < nmin ) {
	nmin = sticks[i];  //new length
      }
    }
    if ( cuts == 0 ) allZeros = true;
    else {
      System.out.println(""+cuts);
      min = nmin;
    }
    //System.out.println("legnth"+min);
  }
  //System.out.println(Arrays.toString(sticks));
}

 public final static void main(String[] args)  {
    CutTheSticks mySticks = new CutTheSticks();
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();  // Get the number of tests.
    int[] sticks = new int[num];
    for (int i = 0; i < num; i++) {
        sticks[i] = scan.nextInt();
    }
    mySticks.doCut( sticks );

 } //main

}
