import java.util.*;
import java.io.*;

public class TreeTopView {

  public static void main(String[] args) {
    new TreeTopView().run();
  }

  static class Node {
    Node left;
    Node right;

    int data;

    public Node(int data) {
      this.data = data;
    }
  }

  public void run() {
    // build the simple tree from chapter 11.

    Node root = new Node(3);
    root.left = new Node(5);    
    root.right = new Node(2);
    root.left.left = new Node(1);
    root.left.left.right = new Node(9);
    root.left.right = new Node(4);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.right.left = new Node(8);

    System.out.println("Top View of Tree");    
    top_view(root);
  }

  public void top_view(  Node root ) {      
    if(root==null)
      return;
     Stack<Integer> s=new Stack<Integer>();    
     Node tmpNode = root;     
     
     // go left side
     while ( tmpNode != null ) {
      s.push( tmpNode.data );
      tmpNode = tmpNode.left;
     }
     while(s.size()!=0)
      System.out.print(s.pop()+" ");
      
      if (root.right == null )
        return;
     // go right side
     Queue<Integer> q=new LinkedList<Integer>(); 
     q.add(root.right.data);
     tmpNode=root.right;     
     while(tmpNode.right!=null)
     {
      q.add(tmpNode.right.data);
      tmpNode=tmpNode.right;
     }
     while(q.size()!=0)
      System.out.print(q.poll()+" ");
  }

  
  public void topview(Node root)
 {
     if(root==null)
      return;
     traverse_left(root.left);
     System.out.print(root.data+" ");
     traverse_right(root.right);
 }
 public void traverse_left(Node x)
 {
     if(x==null)
      return;
     traverse_left(x.left);
      System.out.print(x.data+"  ");
 }
 public void traverse_right(Node x)
 {
     if(x==null)
      return;
     System.out.print(x.data+"  ");
     traverse_right(x.right);     
 } 

}
