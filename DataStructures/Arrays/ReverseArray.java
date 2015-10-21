import java.io.*;
import java.util.*;
import java.text.*;

class ReverseArray {

 public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    int[] list = new int[num];
    scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
    for (int i = 0; i < num; i++) {
        int input = scan.nextInt();
        list[i] = input;
    }

    for ( int i = list.length-1; i >= 0; i-- ) {
      System.out.print(list[i]+" ");
    }
    System.out.println();
 } //main

}
