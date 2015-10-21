import java.io.*;
import java.util.*;
import java.text.*;

class ReverseArray {

 public static void main (String args[]) {
        
        try{
                BufferedReader br = 
                      new BufferedReader(new InputStreamReader(System.in));
                        
         String input;
        input=br.readLine(); // size of array        
        int size = Integer.parseInt(input);
        input=br.readLine();  // array
        String[] list = input.split(" ");
        for ( int i = size-1; i >=0; i--)   {
            System.out.print(list[i]+" ");
            
        }
        System.out.println();                               
        }catch(IOException io){
                io.printStackTrace();
        }              
 } //main

}
