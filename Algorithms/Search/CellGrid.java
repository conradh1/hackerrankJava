import java.util.*;
import java.io.*;

class CellGrid {

static int[][] matrix;
static int maxCells = -1;

public void flushGrid(int rows, int cols) {
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      if ( matrix[i][j] == 1) {
	maxCells = Math.max(maxCells, traceCell(i,j));
      }
    }
  }
}

private int traceCell(int i, int j) {
  boolean deadEnd = false;
  Queue<int[]> queueFlip = new LinkedList<int[]>();
  int cells = 0;

  queueFlip.add(new int[]{i,j}); // add first bit to flip
  matrix[i][j] = -1;
  while ( !queueFlip.isEmpty() ) {
    ++ cells;
    int flip[] = queueFlip.element();
    i = flip[0]; j = flip[1];
    //System.out.println("debug i = " + i + ", j = " + j);
    queueFlip.remove();

    // upper three
    if ( i > 0 && j > 0 && matrix[i-1][j-1] == 1) {
      int[] p = new int[]{i-1, j-1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }
    if ( i > 0 && matrix[i-1][j] == 1) {
      int[] p = new int[]{i-1, j};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }
    if ( i > 0 && j < matrix[i].length-1 && matrix[i-1][j+1] == 1) {
      int[] p = new int[]{i-1, j+1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }

    // mid right
    if ( j < matrix[i].length-1 && matrix[i][j+1] == 1) {
      int[] p = new int[]{i, j+1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }

    // lower three
    if ( i < matrix.length-1 && j < matrix[i].length-1 && matrix[i+1][j+1] == 1) {
      int[] p = new int[]{i+1, j+1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }
    if ( i < matrix.length-1 && matrix[i+1][j] == 1) {
      int[] p = new int[]{i+1, j};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }
    if (  i < matrix.length-1 && j > 0 &&  matrix[i+1][j-1] == 1) {
      int[] p = new int[]{i+1, j-1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }

    // mid left
    if (  j > 0 && matrix[i][j-1] == 1) {
      int[] p = new int[]{i, j-1};
      queueFlip.add(p); // add first bit to flip
      matrix[p[0]][p[1]] = -1;
    }
  }
  return cells;
}

private void printMatrix() {
  for (int i = 0; i < matrix.length; i++) {
       System.out.println(Arrays.toString(matrix[i]));
  }
}

 public final static void main(String[] args)  {
    CellGrid myGrid = new CellGrid();

    Scanner scan = new Scanner(System.in);

    int rows = scan.nextInt();  // Get the number of rows for the matrix
    int cols = scan.nextInt();  // Get the number of columns for the matrix

    matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = scan.nextInt();
      }
    }
    /*matrix = new int[][] {{ 1, 1, 0, 0 },
             { 0, 1, 1, 0 },
	     { 0, 0, 1, 0 },
	     { 1, 0, 0, 0 }};*/

    myGrid.flushGrid(rows,cols);
    System.out.println(maxCells);
    //myGrid.printMatrix();
  }
}
