import java.util.*;
import java.io.*;
/*
 HackerRank solution: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
*/

class DeleteNthLinkedList {

  class Node {
     int data;
     Node next;
  }

  Node DeleteNth(Node head, int position) {
      Node currNode = head;

      if ( position == 0 ) {
	currNode = currNode. next;
	head = currNode;
      }
      else {
	for (int i = 0; i < position-1; i++ ) {
	  currNode = currNode.next;
	}
	Node prevNode = currNode.next;
	currNode.next = prevNode.next;
      }
      return head;
  }

}
