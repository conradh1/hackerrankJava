import java.util.*;
import java.io.*;

class Palindrome {

public int getPalindromeIndexBad(String word) {
  String substrW, substrR;
  int index = -1;
  String reverse = new StringBuffer(word).reverse().toString();

  // first case it is a palindrone
  if ( word.equals( reverse) ) {
    return index;
  }

  // loop through each possible substr removing characters

  for (int i = 1; i < reverse.length(); i++) {

    substrR = reverse.substring(0, reverse.length()-i);
    substrW = word.substring(i);
    //System.out.println("poping"+word.charAt(i-1));
    //System.out.println("i: "+i+" W: "+substrW);
    //System.out.println("i: "+i+" R: "+substrR);
    // are the sub strings palindrones
    if ( substrR.equals( substrW ) ) {
      if ( substrR.length() == 1 ) return i;  //case last character
      else return i - 1;
    }
  }
  return index; // case no palindrone
}

public int palindromeIndex(String word) {
  char[] forward = word.toCharArray();
  final int N = forward.length;
  int index = -1;

  for(int i = 0, j = N-1; i < j; ++i, --j) {
    if ( forward[i] != forward[j] ) {
      index = isPalindrome(forward, i+1, j) ? i : j;
      break;
    }
  }
  return index;
}

private static boolean isPalindrome(final char[] C, final int A, final int B){
        for(int i = A, j = B; i < j; ++i, --j){
            if (C[i] != C[j]){
                return false;
            }
        }
        return true;
 }

 public final static void main(String[] args)  {
    Palindrome mystrPlay = new Palindrome();
    Scanner scan = new Scanner(System.in);


    int num = scan.nextInt();  // Get the number of tests.
    String[] words = new String[num];
    for (int i = 0; i < num; i++) {
        words[i] = scan.next();
    }
    for (int i = 0; i < num; i++) {
        System.out.println(mystrPlay.palindromeIndex(words[i]));
    }
 } //main

}
