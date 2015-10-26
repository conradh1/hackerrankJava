import java.util.*;
public class TreeLevelOrderTraversal {

  public static void main(String[] args) {
    new TreeLevelOrderTraversal().run();
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
    root.left.right = new Node(4);
    root.right.left = new Node(6);

    System.out.println("Traversing tree in order");
    //printInOrder(root);
    LevelOrder(root);
    System.out.println("");
  }

  public void LevelOrder(Node node) {    
   Queue<Node> currentLevel = new LinkedList<Node>();  //Use a linked list to transverse down the tree.
      Queue<Node> nextLevel = new LinkedList<Node>();

      currentLevel.add(node);

        // Go through the Linked List starting at the root until reaching the last node
        // in terms of Big 0 search, it's juts O(n) going through each branch.
        while (!currentLevel.isEmpty()) {
            Iterator<Node> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Node currentNode = iter.next();
                // add the next level to print
                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
                System.out.print(currentNode.data + " ");
            }
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Node>();
       }
  }
}
