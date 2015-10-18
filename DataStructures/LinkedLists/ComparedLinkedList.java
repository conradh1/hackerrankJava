import java.util.*;
import java.io.*;

/*
See: https://www.hackerrank.com/challenges/compare-two-linked-lists

Note that this submission is only the method CompareLists.

*/
class CompareLinkedList {
  class Node {
     int data;
     Node next;
  }
  int CompareLists(Node headA, Node headB) {
    Node tmpA = headA;
    Node tmpB = headB;   
    int aSize = 0;
    int bSize = 0;
    
    // both are null
    if ( tmpA == null && tmpB == null ) {
      return 1;
    }
    else {
      while (tmpA != null && tmpB != null) {      
        if ( tmpA.data != tmpB.data )
          return 0;
        if ( tmpA.next != null) {
          aSize++;          
        }
        if ( tmpB.next != null) {
          bSize++;            
        }
        tmpA = tmpA.next;          
        tmpB = tmpB.next;
      }
    }
    if ( aSize != bSize ) 
          return 0;   
    return 1;
  }



 public final static void main(String[] args)  {



 } //main

}
