import java.util.*;
import java.io.*;

/*
See: https://www.hackerrank.com/challenges/compare-two-linked-lists

Note that this submission is only the method  MergeLists.

*/
class Merge {
  class Node {
     int data;
     Node next;
  }
  Node MergeLists(Node headA, Node headB) {   
    Node mergeNode = new Node();
    Node current = new Node();
           
    // both are null
    
    // case A is not null and B is null
    if ( headA == null)
      return headB;
    // case A is null and B is not null
    if ( headB == null)
      return headA;
          
    // case for first node
    if ( headA.data < headB.data ) {
      mergeNode = headA;
      headA = headA.next;
    }
    else {
      mergeNode = headB;
      headB = headB.next;
    }
    
    current = mergeNode;
    while ( headA != null && headB != null ) {      
      if ( headA.data < headB.data ) {
        current.next = headA;
        current = current.next;
        headA = headA.next;
      }
      else {
        current.next = headB;
        current = current.next;
        headB = headB.next;
      }          
    }                
      if ( headA == null ) {
        current.next = headB;        
      }
      else if ( headB == null ) {
        current.next = headA;        
      }
    return mergeNode;
  }
}
