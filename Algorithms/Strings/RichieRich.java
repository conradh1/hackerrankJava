/*
https://www.hackerrank.com/challenges/richie-rich

Sandy likes palindromes. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as it does forward. For example, madam is a palindrome.

On her  birthday, Sandy's uncle, Richie Rich, offered her an -digit check which she refused because the number was not a palindrome. Richie then challenged Sandy to make the number palindromic by changing no more than  digits. Sandy can only change  digit at a time, and cannot add digits to (or remove digits from) the number.

Given  and an -digit number, help Sandy determine the largest possible number she can make by changing digits.

Note: Treat the integers as numeric strings. Leading zeros are permitted and can't be ignored (So 0011 is not a palindrome, 0110 is a valid palindrome). A digit can be modified more than once.

Input Format

The first line contains two space-separated integers,  (the number of digits in the number) and  (the maximum number of digits that can be altered), respectively.
The second line contains an -digit string of numbers that Sandy must attempt to make palindromic.

Constraints

Each character  in the number is an integer where .
Output Format

Print a single line with the largest number that can be made by changing no more than  digits; if this is not possible, print -1.

Sample Input 0

4 1
3943
Sample Output 0

3993
Sample Input 1

6 3
092282
Sample Output 1

992299
Sample Input 2

4 1
0011
Sample Output 2

-1
*/

import java.util.*;

public class RichieRich {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String number = "39143";
    int n = 4, k = 1;

    makePalindrome(n,k,number);
  }


  public static void makePalindrome( int n, int k, String number ) {

    char[] numbers = (number).toCharArray();  // integer to char array
    int cut = n / 2;
    int top = numbers.length-1;
    int p = 0;
    boolean passed = false;

    if (numbers.length % 2 == 1) cut++;  // case odd numbers in array

    for ( int i = 0; i < cut; i++) {
      if ( numbers[i] != numbers[top-i] ) {
	p++;
	if (numbers[i] > numbers[top-i])
	  numbers[top-i] = numbers[i];
	else
	  numbers[i] = numbers[top-i];
      }
    }

    if ( p <= k ) passed = true;
    // case cannot make plaindrone
    if ( passed ) {
       String output = new String(numbers);
       System.out.println(output);
    }

    else
      System.out.println("-1");


  }
}