import java.util.*;
import java.io.*;

class EvenTree {


public final static void main(String[] args)  {

    Scanner scan = new Scanner(System.in);
    // create dictionary
    int M = scan.nextInt();  // Get the number of vertices
    int N = scan.nextInt();  // Get the number of edges

    int[][] dim = new int[2][M] ; // holds the tree values

    dim[0][0] = 1;
    dim[1][0] = 0; //set root
    for (int i = 1; i <= M; i++) {
        //System.out.print("Next Input");
        int v = scan.nextInt(); // get vertice
        int e = scan.nextInt(); // get edge
        dim[0][i] = v;
        dim[1][i] = e;
    }
    //GraphNode n1 = new GraphNode(1); // set root
    //n1.neighbors = new GraphNode[]{n2,n3,n5};
     List<GraphNode> myGraph = new ArrayList<GraphNode>();
    // Make sure reading integers in correctly.
//      for (int i = 0; i <= M; i++) {
//         int v = dim[0][i];
//
// 	GraphNode tempNode = new GraphNode(1); // set root
//        System.out.println("1: "+dim[0][i]+" 2: "+dim[1][i]);
//      }
 } //main

} //EvenTree

class GraphNode{
	int val;
	GraphNode next;
	GraphNode[] neighbors;
	boolean visited;

	GraphNode(int x) {
		val = x;
	}

	GraphNode(int x, GraphNode[] n){
		val = x;
		neighbors = n;
	}

	public String toString(){
		return "value: "+ this.val;
	}
}
class Queue{
	GraphNode first, last;

	public void enqueue(GraphNode n){
		if(first == null){
			first = n;
			last = first;
		}else{
			last.next = n;
			last = n;
		}
	}

	public GraphNode dequeue(){
		if(first == null){
			return null;
		}
		else{
			GraphNode temp = new GraphNode(first.val, first.neighbors);
			first = first.next;
			return temp;
		}
	}
}
