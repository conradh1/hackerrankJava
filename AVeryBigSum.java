import java.util.*;
import java.io.*;
import java.math.*;

class AVeryBigSum {

 public final static void main(String[] args)  {
    AVeryBigSum mySum = new AVeryBigSum();
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    BigInteger bigSum = new BigInteger("0");
    scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
    for (int i = 0; i < num; i++) {
       BigInteger bigInt = new BigInteger(scan.next());
       bigSum = bigSum.add( bigInt);
       //System.out.println( bigInt+"|"+bigSum );
    }
    System.out.println( bigSum );
 } //main

}
