import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
      int max = -1;

      if ( r - l < 0 ) { return -1; } // case l > r

      for ( int i = l; i <= r; i ++ ) {
	for ( int j = i; j <= r; j++ ) {
	  int or = i ^ j;
	  //System.out.println(i+"^"+j+"="+or);
	  if ( or > max ) {
	    max = or;
	  }
	}
      }
      return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
