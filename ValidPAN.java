import java.util.*;
import java.util.regex.*;
import java.io.*;

/*
  find a valid or invalid PAN number
  See: https://www.hackerrank.com/challenges/valid-pan-format
*/

class ValidPAN {

private static boolean isValidPan(String pan) {

  Pattern p = Pattern.compile("[A-Z]{5}\\d{4}[A-Z]");
  Matcher m = p.matcher(pan);

  if ( m.find() )
    return true;
  else
    return false;
}


 public final static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    //System.out.print("Number of tests:");

    int num = scan.nextInt();  // Get the number of tests.
    String[] panList = new String[num];
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
