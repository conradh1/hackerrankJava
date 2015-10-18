import java.util.*;
import java.io.*;

class UtopianTree {


public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    // create dictionary
    int N = scan.nextInt();  // Get the number of cycles
    UtopianTree u = new UtopianTree();


    int[] cycles = new int[N]; // holds the cycle values

    for (int i = 0; i < cycles.length; i++) {
        //System.out.print("Next Input");
        int c = scan.nextInt(); // get vertice
        cycles[i] = c;
    }
    for (int i = 0; i < cycles.length; i++) {
        // do the cycles
        System.out.println(u.doCyclesRecursion( 0, cycles[i], 0));
    }
 } //main

 public int doCyclesRecursion(int total, int c, int i) {
    if ( i == c ) {
      return (total + 1);
    }
    else {
       if ( i % 2 != 0 ) return (doCyclesRecursion( total*2, c, i+1));
       else return (doCyclesRecursion( total+1, c, i+1));
    }
 }
 public int doCycles(int total, int c) {

    total++; //case zero
    for (int i = 1; i <= c; i++) {
      if ( i % 2 != 0 ) total*=2;
      else ++total;
    }
    return total;
 }
} //UtopianTree