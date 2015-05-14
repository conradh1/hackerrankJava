import java.util.*;
import java.io.*;

class FunnyString {

public boolean isFunny(String sentence) {
  char[] S = sentence.toCharArray();
  char[] R = new char[S.length];
  boolean isFunny = false;
  int j = 0;
  for (int i = S.length-1; i >= 0; i-- ) {
    R[j] = S[i];
    j++;
  }
  for (int i = 1; i < S.length; i++ ) {
   if ( Math.abs(S[i]-S[i-1]) == Math.abs(R[i]-R[i-1]) ) {
     isFunny = true;
   }
   else {
     isFunny = false;
     break;
    }
  } //for
  return isFunny;
}


 public final static void main(String[] args)  {
    FunnyString mystrPlay = new FunnyString();
    Scanner scan = new Scanner(System.in);

    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    for (int i = 1; i <= num; i++) {
        //System.out.print("Next Input");
        String input = scan.next();
	if (mystrPlay.isFunny(input)) {
            System.out.println("Funny");
         }
         else {
            System.out.println("Not Funny");
         }
    }
  //mystrPlay.printBasic();
 } //main

}
