import java.util.*;
import java.io.*;
import java.math.*;

/*
  Solution to difference of diagonals in an array
  See problem: https://www.hackerrank.com/challenges/diagonal-difference/submissions/code/14098322
*/

class DiagonalDifference {



 int getTop2BottomSum( int matrix[][] ) {
    int l2r = 0;
    for ( int i = 0; i < matrix.length; i++) {
      l2r += matrix[i][i];
      //System.out.println(matrix[i][i]);
    }
    //System.out.println("Sum"+l2r);
    return l2r;
 }

 int getBottom2TomSum( int matrix[][] ) {
    int r2l = 0;
    int j = 0;
    for ( int i = matrix.length-1; i >= 0; i--) {
      r2l += matrix[i][j];
      //System.out.println(matrix[i][i]);
      j++;
    }
    //System.out.println("Sum"+r2l);
    return r2l;
 }

 public final static void main(String[] args)  {
  /*int[][] matrix = new int[][]{
  { 11, 2, 4 },
  { 4, 5, 6 },
  { 10, 8, -12 }
  };*/
  DiagonalDifference myDiaDiff = new DiagonalDifference();
  Scanner scan = new Scanner(System.in);

  int num = scan.nextInt();  // Get the dimention of the array
  scan.nextLine(); //get rid of \n
  int matrix[][] = new int[num][num];  //create Matrix

  for (int i = 0; i < num; i++) {
       String inputLine = scan.nextLine();
       String[] inputArray = inputLine.split(" ");  //split the integers on the line
       for (int j = 0; j < inputArray.length; j++ ) {
         matrix[i][j] = Integer.parseInt(inputArray[j]);
       }
  }

  int dSum = Math.abs(myDiaDiff.getTop2BottomSum(matrix) - myDiaDiff.getBottom2TomSum(matrix));
  System.out.println(dSum);
 } //main

}
