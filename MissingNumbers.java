import java.util.*;
import java.io.*;
import java.math.*;

/*
Missing number problem using hash tables.
See: https://www.hackerrank.com/challenges/missing-numbers

*/
class MissingNumbers {
 
 private static void showMissingNumbers(int[] firstNumArray, int[] secondNumArray ) {
    TreeMap<Integer, Integer> firstNumList  = new TreeMap<Integer, Integer>();
    TreeMap<Integer, Integer> secondNumList  = new TreeMap<Integer, Integer>();
    for (int i = 0; i < firstNumArray.length; i++)  {      
      int number = firstNumArray[i];
      if ( firstNumList.containsKey( number )) {
          int total = firstNumList.get( number );
          firstNumList.put( number, ++total );
      }
      else 
          firstNumList.put( number, 0 );        
    } 
    for (int i = 0; i < secondNumArray.length; i++)  {
      int number = secondNumArray[i];
      if ( secondNumList.containsKey( number )) {
          int total = firstNumList.get( number );
          secondNumList.put( number, ++total );
      }
      else 
          secondNumList.put( number, 0 );        
    }
    // Get a set of the entries
    Set set = secondNumList.entrySet();
    // Get an iterator
    Iterator i = set.iterator();
    // Display elements
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      if ( firstNumList.containsKey ( me.getKey() )) {
        if ( firstNumList.get( me.getKey() ) == me.getValue() )
          System.out.print( me.getKey() );
      }
      else 
        System.out.print( me.getKey() );
    }
    System.out.println();
 }
 public final static void main(String[] args)  {
  
  DiagonalDifference myDiaDiff = new DiagonalDifference();
  Scanner scan = new Scanner(System.in);

  int n = scan.nextInt();  // Get the dimention of the first array
  scan.nextLine();
  String inputLine = scan.nextLine();
  
  String[] inputArray1 = inputLine.split(" ");  //split the integers on the line
  int[] firstNumArray = new int[n];
  for (int i = 0; i < n; i++)
  {
    firstNumArray[i] = Integer.parseInt(inputArray1[i]);
  }
   
  int m = scan.nextInt();  // Get the dimention of the second array
  scan.nextLine();
  inputLine = scan.nextLine();
  String[] inputArray2 = inputLine.split(" ");  //split the integers on the line
  int[] secondNumArray = new int[m];
  for (int i = 0; i < n; i++)
  {
    secondNumArray[i] = Integer.parseInt(inputArray2[i]);
  }
  showMissingNumbers(firstNumArray, secondNumArray );
} //main

}
