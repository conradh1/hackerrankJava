import java.util.*;
import java.util.regex.*;
import java.io.*;

/*
  Looks for a substring in a list of strings
  See: https://www.hackerrank.com/challenges/find-substring
*/

class FindSubstring {

private static int countSubstrings(String sentence, String subString) {

  String[] words = sentence.split(" ");
  int occurances = 0;
  Pattern prefix = Pattern.compile("^"+subString);
  Pattern suffix = Pattern.compile(subString+"$");
  Matcher mp, ms;

  Matcher mp = p.matcher(word);
  Matcher ms = p.matcher(word);

  if ( mp.find() )
    occurances++;
  else if ( ms.find() )
    occurances++;

  return occurances;
}


 public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");

    int num = scan.nextInt();  // Get the number of tests.
    String[] setenceList = new String[num];
    for (int i = 0; i < num; i++) {
       String input = scan.next();
       panList[i] = input;
    }
    // pritn the output for each string
     for (int i = 0; i < panList.length; i++) {
       System.out.println(isValidPan(panList[i]) ? "YES" : "NO");
     }
 } //main

}
