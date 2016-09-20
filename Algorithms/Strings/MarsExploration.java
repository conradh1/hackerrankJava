/*
Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, .

Note: As the original message is just SOS repeated  times, 's length will be a multiple of .

Constraints
 * 1 <= |S| <= 99
 * |S| % 3 = 0
 * S will only contain uppercase English letters

 will contain only uppercase English letters.
Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Sample Input 1

SOSSOT
Sample Output 1

1
*/

import java.util.Arrays;

public class MarsExploration {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String m1 = "SOSSPSSQSSOR";
    System.out.println(""+getRadiationCount(m1));
    m1 = "SOSSOT";
    System.out.println(""+getRadiationCount(m1));
    m1 = "SOSSOSSOS";
    System.out.println(""+getRadiationCount(m1));

  }


  public static int getRadiationCount(String msg) {

    char[] letters = (msg).toCharArray();  // integer to char array
    int bad = 0;

    int i = 0;
    while ( i < letters.length ) {
       if ( letters[i] != 'S' )
	bad++;
       if ( letters[i+1] != 'O' )
        bad++;
       if ( letters[i+2] != 'S' )
        bad++;
       i += 3;
    }
    return bad;
  }

}
