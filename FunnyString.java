import java.util.*;
import java.io.*;
import java.math.*;
/*
Determines whether a string reverse is funny or not based on its char value being zero.
See: https://www.hackerrank.com/challenges/funny-string

*/
class FunnyString {

static FunnyString mystrPlay;

public boolean isFunny(String sentence) {
  boolean isFunny = true;
  
  int strSize = sentence.length();
  int[] fw = new int[strSize];
  int[] rw = new int[strSize];
  int j = strSize-1;
  for ( int i = 0; i < strSize;  i++ ) {
    fw[i] = (int)sentence.charAt(i);
    rw[i] = (int)sentence.charAt(j);
    j--;
  }

  int diff = 0;
  for ( int i = 1; i < strSize;  i++ ) { 
    if ( (Math.abs(fw[i]-fw[i-1])) != (Math.abs(rw[i]-rw[i-1])) ) {
      isFunny = false;
      break;
    }
  }
  
  return isFunny;
}

static public void evalulateStrings(List<String> sentenceList) {
    // interate through the string list
    for (String sentence : sentenceList ) {
        //System.out.println("debug"+sentence);
        if (mystrPlay.isFunny(sentence)) {
          System.out.println("Funny");
        }
        else {
          System.out.println("Not Funny");
        }
    }
} 

 public final static void main(String[] args)  {
    mystrPlay = new FunnyString();
    Scanner scan = new Scanner(System.in);
    List<String> sentenceList = new ArrayList<String>();
    //System.out.print("Number of tests:");
    int num = scan.nextInt();  // Get the number of tests.
    for (int i = 1; i <= num; i++) {
        //System.out.print("Next Input");
        String input = scan.next();
	sentenceList.add(input);
    }
    evalulateStrings(sentenceList);
 } //main

}
