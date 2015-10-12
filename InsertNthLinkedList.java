import java.util.*;
import java.io.*;
/*
 HackerRank solution: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
*/

class InsertNthLinkedList {

  class Node {
     int data;
     Node next;
  }

  Node InsertNth(Node head, int data, int position) {
      // This is a "method-only" submission.
      // You only need to complete this method.
      Node newNode = new Node();
      newNode.data = data;
      newNode.next = null;

      // place on the head
      if (position == 1 ) {
        newNode.next = head;
        head = newNode;
      }
      else {
        Node tmpNode = head;
	for ( int i = 0; i < position-2; i++) {
          tmpNode = tmpNode.next;
	}
        newNode.next = tmpNode.next;
        tmpNode.next = newNode;
      }
      return head;
  }

}
