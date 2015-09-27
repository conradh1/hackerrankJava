import java.util.*;
import java.io.*;
/*
This Hacker Rank Problem does a summary of fractions of numbers
negative/total positive/total   zeros/total
See: https://www.hackerrank.com/challenges/plus-minus
*/

class PlusMinus {

public void doFractions(int pos, int neg, int zero, int num) {
  Double posR = pos/ (double) num;
  String str = String.format("%.03f",posR );
  System.out.println(str);

  Double negR = neg/(double) num;
  str = String.format("%.03f",negR );
  System.out.println(str);

  Double zeroR = zero/(double) num;
  str = String.format("%.03f",zeroR );
  System.out.println(str);
}


 public final static void main(String[] args)  {
    PlusMinus myPlusMinus = new PlusMinus();
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();  // Get the number integers
    int pos = 0,neg = 0, zero = 0;
    for (int i = 0; i < num; i++) {
       int input = scan.nextInt();
       if (input > 0 )
	  pos++;
       else if ( input < 0 )
          neg++;
       else if ( input == 0 )
          zero++;
    }
    myPlusMinus.doFractions(pos, neg, zero, num);
 } //main

}
