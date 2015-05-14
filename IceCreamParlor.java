import java.util.*;
import java.io.*;

class IceCreamParlor {

  int M;  //dolars to spend on ice cream
  int N; //total number of flavors
  int[] Ci; // cost of each flavor 1..N


public IceCreamParlor( int m, int n, int[] ci ) {
  this.M = m;
  this.N = n;
  this.Ci = ci;
}

public void searchFlavors() {

  int[] index = new int[this.N];

  for (int i = 0; i < Ci.length; i++ ) {
    index[i] = -1;
  }  //assign to -1

  for (int i = 0; i < Ci.length; i++ ) {
       for (int j = 0; j < Ci.length; j++ ) {
          if ( i != j ) {
             if ( Ci[i] + Ci[j]  == M) {
	      System.out.println((i+1)+" "+(j+1));
	      return;
             }
          }
       }
  }
}

public void printIceCreamParlor() {
  System.out.println("Dollars: "+this.M+" Total Flavors: "+this.N+" Cost"+Arrays.toString(this.Ci));

}


public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    List<IceCreamParlor> ICPList = new ArrayList<IceCreamParlor>();

    // create dictionary
    int T = scan.nextInt();  // Get the number of tests


     for (int i = 0; i < T; i++) {
      int m = scan.nextInt(); // get dollars to spend on ice cream
      int n = scan.nextInt(); // get number of flavors
      int[] flavors = new int[n]; // holds the price for each flavor
      for ( int j = 0; j < n; j++ ) {
	flavors[j] = scan.nextInt();
      }
      IceCreamParlor tempICP = new IceCreamParlor(m, n, flavors);
      ICPList.add(tempICP);
     }

     // Loop through each object
     Iterator<IceCreamParlor> ICPIterator = ICPList.iterator();
     while  ( ICPIterator.hasNext()) {
	IceCreamParlor tempICP = ICPIterator.next();
	tempICP.searchFlavors();
	//tempICP.printIceCreamParlor();
     }

 } //main


} //IceCreamParlor