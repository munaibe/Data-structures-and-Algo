/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public class Node<E> implements Position<E> //this class is for  singly linked list node
{
    public Node<E> next;//link to next node
    public Node<E> prev;
    public E element;//element stored in node
    
    public Node(Node<E> p, E e, Node<E> n)//when constructor id called it creates a new node with element and link to next node
    {
     element=e;
     next=n;
     prev=p;
        
    }
    
     public Node(E e)//when constructor id called it creates a new node with element and link to next node
    {
     element=e;
      next=null;
      prev=null;
        
    }
     
     public Node()
     {
         element=null;
          next=null;
      prev=null;
     }
    
    public void setElement(E el){
        element=el;
    }
    
    public E getElement(){
        return element;
    }
    
    public void setPrev(Node<E> p){
        prev=p;
    }
    
    public Node<E> getPrev(){
        return prev;
    }
    
    public void setNext(Node<E> n){
        next=n;
    }
    
    public Node<E> getNext(){
        return next;
    }

    @Override
    public E element() {
        return element;
    }
    
}
