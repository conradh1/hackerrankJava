import java.util.*;
import java.io.*;
/*
 HackerRank solution: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
*/

class InsertHeadLinkedList {

  class Node {
     int data;
     Node next;
  }

  Node Insert(Node head,int data) {
      // This is a "method-only" submission.
      // You only need to complete this method.

      if ( head == null ) {
        head = new Node();
        head.data = data;
        head.next = null;
      }
      else {
        Node newNode = new Node();
        newNode.data = data;
	newNode.next = head;
	head = newNode;
      }
      return head;
  }

}
