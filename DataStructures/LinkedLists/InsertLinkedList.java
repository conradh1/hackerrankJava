import java.util.*;
import java.io.*;

class InsertLinkedList {

  class Node {
     int data;
     Node next;
  }
  Node Insert(Node head,int data) {
    // This is a "method-only" submission.
    // You only need to complete this method.
      Node tmpNode = head;
      Node newNode = new Node();
      newNode.data = data;
      newNode.next = null;
	while (tmpNode.next != null) {
	  tmpNode = tmpNode.next;
	}
	tmpNode.next = newNode;
	return head;
  }

}
