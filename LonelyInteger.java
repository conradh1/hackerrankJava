import java.util.*;
import java.io.*;
import java.math.*;
/*
Returns the n member of an array that only has one instance (lonely).
See: https://www.hackerrank.com/challenges/lonely-integer

*/
class LonelyInteger {



static private int isLonley( Hashtable<Integer, Integer> numbers ) {
  Enumeration members;
  
  members = numbers.keys();
  while( members.hasMoreElements()) {
    int member = (Integer) members.nextElement();
    int total = numbers.get(member);
    if ( total == 0 )
      return member;  // return the lonely number
  }
  return -1;
}


 public final static void main(String[] args)  {
    
    Scanner scan = new Scanner(System.in);
    Hashtable<Integer, Integer> numbers  = new Hashtable<Integer, Integer>();
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    scan.useDelimiter("[,\\s+]");  //Set the scanner delimiter to \s or ,
    for (int i = 1; i <= num; i++) {
        //System.out.print("Next Input");
        int input = scan.nextInt();
	if ( numbers.containsKey( input )) {
	  int total = numbers.get( input );
          numbers.put( input, ++total );
	}
	else {
	  numbers.put( input, 0 );
	}
    }
    System.out.println(isLonley( numbers ));
 } //main

}
