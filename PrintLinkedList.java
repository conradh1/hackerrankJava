import java.util.*;
import java.io.*;

/*
See: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list

Note that this submission is only the method print.

*/
class PrintLinkedList {
class Node {
     int data;
     Node next;
  }
void Print(Node head) {
  Node tmpNode = head;
  while (tmpNode != null) {
    System.out.println(tmpNode.data+"");
    tmpNode = tmpNode.next;
  }
}



 public final static void main(String[] args)  {



 } //main

}
