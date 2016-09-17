import java.util.*;
import java.io.*;

class BeautifulBinaryString {

// https://www.hackerrank.com/challenges/beautiful-binary-string

/*
Alice has a binary string, , of length . She thinks a binary string is beautiful if and only if it doesn't contain the substring .

In one step, Alice can change a  to a  (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

Input Format

The first line contains an integer,  (the length of binary string ).
The second line contains a single binary string, , of length .

Constraints

Each character in .
Output Format

Print the minimum number of steps needed to make the string beautiful.

Sample Input 0

7
0101010
Sample Output 0

2
Sample Input 1

5
01100
Sample Output 1

0
Sample Input 2

10
0100101010
Sample Output 2

3




*/


private static int countSteps(String str) {


  int steps = 0;
  char[] bin = str.toCharArray();
  int i = 0;
  char a,b,c;
  while ( i < bin.length ) {
    if ( i+2 < bin.length  && bin[i] == '0') {
      if ( bin[i+1] == '1' && bin[i+2] == '0') {
       i += 3;
       steps++;
      }
      else
	i++;
    }
    else
      i++;
  }

  return steps;

}


 public final static void main(String[] args)  {

     Scanner scan = new Scanner(System.in);

    String input = scan.nextLine(); // Scan input string
    String binString = scan.nextLine(); // Scan input string



    System.out.println(countSteps(binString));
 } //main

}
