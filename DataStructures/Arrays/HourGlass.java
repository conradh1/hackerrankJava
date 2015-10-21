import java.io.*;
import java.util.*;
import java.text.*;

class HourGlass {

 public final static void main(String[] args)  {        
        try {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String input;
          int size = 6;
          int[][] matrix = new int[size][size];
          for ( int i = 0; i < size; i++ ) {
            input=br.readLine(); // size of array
            String[] line = input.split(" ");
            for(int j = 0; j < line.length; j++) {
              matrix[i][j] = Integer.parseInt(line[j]);
            }
          }
                    
        }
        catch(IOException io)
        {
          io.printStackTrace();
        }       
        
 } //main

}
