import java.util.*;
import java.io.*;

class MakeItAnagram {

public int findDelLetters(String str1, String str2) {

  int numdel = 0;
  HashMap<Character, Integer> str1Hash = new HashMap<Character, Integer>();
  HashMap<Character, Integer> str2Hash = new HashMap<Character, Integer>();
  char[] letters1 = str1.toCharArray();
  char[] letters2 = str2.toCharArray();

  // letters1 subset of letters2
//   for (int i = 0; i < letters1.length; i++ ) {
//     int o = alphaHash.get(S[i]);
//       alphaHash.remove(S[i]);
//       alphaHash.put(S[i], ++o);
//
//   }

  for (int i = 0; i < letters1.length; i++ ) {
       boolean foundChar = false;
       for (int j = 0; j < letters2.length; j++ ) {
	  if ( letters1[i] == letters2[j] ) {
	    foundChar = true;
	    break;
	  }
       }
       if ( !foundChar ) {
         numdel++;
       }
  }
  // letters2 subset of letters1
  for (int i = 0; i < letters2.length; i++ ) {
       boolean foundChar = false;
       for (int j = 0; j < letters1.length; j++ ) {
	  if ( letters2[i] == letters1[j] ) {
	    foundChar = true;
	    break;
	  }
       }
       if ( !foundChar ) {
         numdel++;
       }
  }

  return numdel;
}


 public final static void main(String[] args)  {
    MakeItAnagram anagram = new MakeItAnagram();

    Scanner scan = new Scanner(System.in);

    String str1 = scan.nextLine();  // Get the number of tests.
    String str2 = scan.nextLine();  // Get the number of tests.


    System.out.println(anagram.findDelLetters( str1, str2));



 } //main

}
