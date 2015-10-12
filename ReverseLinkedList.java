import java.util.*;
import java.io.*;
/*
 HackerRank solution: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
*/

class ReverseLinkedList {

  class Node {
     int data;
     Node next;
  }

  Node Reverse(Node head) {
    Node currNode = head;
    Node prevNode = null;
    Node nextNode = null;

    if ( head != null ) {
      while ( currNode != null ) {
	nextNode = currNode.next;
	currNode.next = prevNode;
        prevNode = currNode;
	currNode = nextNode;
      }
      head = prevNode;
    }
    return head;
  }

}
