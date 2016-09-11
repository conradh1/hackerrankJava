import java.io.*;
import java.util.*;
import java.text.*;

/*
https://www.hackerrank.com/challenges/array-left-rotation

A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example,
if  left rotations are performed on array , then the array would become .

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as
a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers)
and (the number of left rotations you must perform).  The second line contains  space-separated integers describing
the respective elements of the array's initial state.


*/
class LeftRotation {

 public static void main (String args[]) {

        try{
                BufferedReader br =
                      new BufferedReader(new InputStreamReader(System.in));

        String input;

        input=br.readLine(); // size of array
        String[] params = input.split(" ");

        int size = Integer.parseInt(params[0]);  //get array size
        int left = Integer.parseInt(params[1]); // set left shift

        input=br.readLine();  // array
        String[] listStr = input.split(" ");
        int[] list = new int[listStr.length];
        int[] shiftList = new int[listStr.length];

        for ( int i = 0; i < listStr.length; i++)   {
          list[i] = Integer.parseInt(listStr[i]);
        }


         for ( int i = 0; i < list.length; i++)   {
            int shiftPos = i - left;
            if ( shiftPos >= 0) {
                shiftList[shiftPos] = list[i];
            }
            else {
              int newPos = list.length + shiftPos;
              shiftList[newPos] = list[i];
            }
         }
         for ( int i = 0; i < list.length; i++)   {
             System.out.print(shiftList[i]+" ");
         }
         System.out.println();
        }
        catch(IOException io){
              io.printStackTrace();
        }
 } //main

}
