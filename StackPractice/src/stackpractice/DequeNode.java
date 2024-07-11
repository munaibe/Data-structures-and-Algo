/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public class DequeNode<E> extends Node<E> implements Deque<E> {
    
 public Node<E> head,tail;
 public int length;
 
 public DequeNode(){
     head=new Node(null, null, null);
     tail=new Node(head,null,null);
     head.setNext(tail);
     length=0;
 }
 
 public int size(){
     return length;
 }
 
 public boolean isEmpty(){
     return length==0;
 }
 
 public Position<E> first(){
     if(isEmpty()){
         System.out.println("Empty deque exception");
     }
     return head.getNext();
 }
 
 public Position<E> last(){
     if(isEmpty()){
         System.out.println("Empty deque exception");
     }
     return tail.getPrev();
 }
 
 public void insertFirst( E e){
     length++;
     Node<E> newNode=new Node(head,e,head.getNext());
     head.getNext().setPrev(newNode);
     head.setNext(newNode);
 }
 
 public void insertLast( E e)
 {
     length++;
     Node<E> newNode= new Node(tail.getPrev(), e, tail);
     tail.getPrev().setNext(newNode);
     tail.setPrev(newNode);
     
 }
 
 public E removeFirst(){
     Node<E> newNode=head.getNext();
     Node<E> next=head.getNext().getNext();
     
     head.setNext(next);
     next.setPrev(head);
     
     newNode.setNext(null);
     newNode.setPrev(null);
     
     E element=newNode.getElement();
     
     
     return element;
 }
 
 public E removeLast()
 {
     E element=tail.getPrev().getElement();
     Node<E> newNode=tail.getPrev();
     Node<E> prev=tail.getPrev().getPrev();
     
     tail.setPrev(prev);
     prev.setNext(tail);
     
     newNode.setNext(null);
     newNode.setPrev(null);
 }
    
}
