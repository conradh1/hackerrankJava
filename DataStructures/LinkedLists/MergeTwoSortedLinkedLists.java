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
    Node tmpNode = new Node();
           
    // both are null
    
    // case A is not null and B is null
    if ( headB == null)
      return headA;
    // case A is null and B is not null
    if ( headA == null)
      return headB;
      
    if ( headA.data < headB.data ) {
      // headA has the smallest number
      mergeNode = headA;
      headA = headA.next;
    }
    else {
      // swap so headA has the smallest
      mergeNode = headB;
      headB = headB.next;
    }
    tmpNode = mergeNode;
    while ( headA != null && headB != null ) {
        if ( headA.data < headB.data ) {
          mergeNode = headA;
          headA = headA.next;
        }
        else {
          mergeNode = headB;
          headB = headB.next;        
        }
        mergeNode = mergeNode.next;
    }
    // end trails
    if ( headA != null )
      mergeNode.next = headA;
    
    if ( headB != null )
      mergeNode.next = headB;
             
    return tmpNode;
  }
}
