import java.util.*;
import java.io.*;

class AltChar {

public int numDelection(String sentence) {
  char[] S = sentence.toCharArray();

  int numdel = 0;

  for (int i = 0; i < S.length-1; i++ ) {
   if ( S[i] == 'A' && S[i+1] == 'A') {
     numdel++;
   }
   else if ( S[i] == 'B' && S[i+1] == 'B') {
     numdel++;
   }
  } //for
  return numdel;
}


 public final static void main(String[] args)  {
    AltChar mystrPlay = new AltChar();
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    String[] sentencelist = new String[num];
    for (int i = 0; i < num; i++) {
       String input = scan.next();
       sentencelist[i] = input;
    }
    // pritn the output for each string
     for (int i = 0; i <= sentencelist.length; i++) {
       System.out.println(mystrPlay.numDelection(sentencelist[i]));
     }
 } //main

}
