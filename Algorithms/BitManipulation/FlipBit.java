import java.util.*;
import java.io.*;

class FlipBit {


public static byte[] toBinary(long number) {
        byte[] binary = new byte[64];
        int index = 0;
        long copyOfInput = number;
        while (copyOfInput > 0) {
            binary[index++] = (byte) (copyOfInput % 2);
            copyOfInput = copyOfInput / 2;
        }
        return binary;
 }

 public static void printBinary(byte[] binary) {
        for (int i = binary.length - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        System.out.println();
 }

 public static long toInt( byte[] bytes ) {
     int count = 0;
     long result = 0;

     for (int i = bytes.length-1; i >= 0; i--) {
      if(bytes[i]==1)result+= Math.pow(2, i);
     }
     return result;
 }


public long doFlip(long num) {
    byte[] numBits = new byte[64];
    numBits = toBinary(num);
    //printBinary( numBits);
    byte[] flipBits = new byte[64];

    // only flipping 32 bits
    for (int i=0; i< 32; i++){
        if (numBits[i] == 1){
            flipBits[i] = 0;
        }
        else if (numBits[i] == 0){
            flipBits[i] = 1;
        }
    }
    //printBinary( flipBits);
    return( toInt(flipBits) );
}

 public final static void main(String[] args)  {
    FlipBit flip = new FlipBit();

    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();  // Get the number of tests.
    long[] tests = new long[num];
    for (int i = 0; i < num; i++) {
       tests[i] = scan.nextLong(); // get flip bit
    }
    for (int i = 0; i < num; i++) {
     System.out.println((flip.doFlip(tests[i])));
    }
 } //main

}
