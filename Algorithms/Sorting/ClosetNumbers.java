import java.util.*;

// See: https://www.hackerrank.com/challenges/closest-numbers

public class ClosetNumbers {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    public void findCloseNumbers( int[] array ) {
      int close = Integer.MAX_VALUE;
      ArrayList<Integer> closeList = new ArrayList<Integer>();
      
      for (int i = 0; i < array.length-1; i++ ) {
        int diff = Math.abs(array[i+1] - array[i] );
        
        if (  diff < close  ) {
          close = diff;
          closeList.clear(); // clear list
          closeList.add(array[i]);
          closeList.add(array[i+1]);
        }
        else if (  diff == close  ) {          
          // add another matching difference
          closeList.add(array[i]);
          closeList.add(array[i+1]);
        }
      }
      for (Integer number : closeList) {
        System.out.print(number+" ");
      }      
      System.out.println("");
    }
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        ClosetNumbers sorter = new ClosetNumbers();
        Scanner scan = new Scanner(System.in);

         // get number of keys
        int n = scan.nextInt();  // Get the number of tests
        int[] input = new int[n]; // holds the price for each flavor

        for (int i = 0; i < n; i++) {
          input[i] = scan.nextInt();
        }
        //int[] input = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470};
        sorter.sort(input);
        sorter.findCloseNumbers( input);                
    }
}