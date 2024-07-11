/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author munai
 * @param <E>
 */
public class NodeList<E>  extends Node<E> implements PositionList<E> {

    Node<E> head, tail;
    static int length;
    
    public NodeList()
    {
        head=new Node(null, null, null);
        tail=new Node(null, null, head);
        head.setNext(tail);
        length=0;
    }
    
    
   
    
    public Node<E> checkPos(Position<E> p)
    {
        
        if(p==null){
            System.out.println("invalid");
        }
        
        if(p==head){
            System.out.println("head not a valid pos");
            
        }
        
        if(p==tail){
            System.out.println("Tail not a valid pos");
        }
        
        
        Node<E> newNode= (Node<E>)p;
         if(newNode.next==null || newNode.prev==null)
        {
            System.out.println("P not a valid pos");
            return null;
        }
        return newNode;
    }
    
    
    
    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length==0;
    }

    @Override
    public Position<E> first() {
        return head.getNext();
    }

    @Override
    public Position<E> last() {
        return tail.getPrev();
    }

    @Override
    public Position<E> next(Position<E> p) {
        Node<E> newNode=checkPos(p);
        return newNode.getNext();
    }

    @Override
    public Position<E> Prev(Position<E> p) {
        Node<E> newNode=checkPos(p);
        return newNode.getPrev();
    }

    @Override
    public void addFirst(E e) {
        length++;
        Node<E> newNode=new Node(head, e, head.getNext());
        head.next.setPrev(newNode);
        head.setNext(newNode);
        
        
    }

    @Override
    public void addLast(E e) {
         length++;
        Node<E> newNode=new Node(tail.prev, e, tail);
        tail.prev.setNext(newNode);
        tail.setPrev(newNode);
       
    }

    @Override
    public void addAtfer(Position<E> p, E e) {
        length++;
        Node<E> currNode=checkPos(p);
        Node<E> newNode= new Node(currNode, e, currNode.next);
        currNode.next.setPrev(newNode);
        currNode.setNext(newNode);
        
    }

    @Override
    public void addBefore(Position<E> p, E e) {
       Node<E> v = checkPos(p);
    	length++;
    	Node<E> newNode = new Node<E>(v.getPrev(),e,v);
    	v.getPrev().setNext(newNode);
    	v.setPrev(newNode);
        
    }

    @Override
    public E remove(Position<E> p) {
        Node<E> currNode=checkPos(p);
        
        currNode.prev.setNext(currNode.next);
        currNode.next.setPrev(currNode.prev);
        
        currNode.setNext(null);
        currNode.setPrev(null);
        
     
        
        return currNode.getElement();
    }
    

    @Override
    public E set(Position<E> p, E e) {
       Node<E> v = checkPos(p);
    	E oldElt = v.element();
    	v.setElement(element);
    	return oldElt;
    }


    
    @Override
    public String toString(){
        try
        {
            String s="[";
            if(!isEmpty()){
                Position<E> cur=first();
            while(true){
                s+=(cur.element());
                
                if(cur==last()){
            break;
                }
                s+=(",");
                cur=next(cur);
        }
           
            }
            s+="]";
            return s;
        }catch(Exception e){
            e.printStackTrace();
            return "Error";
            
        }
 
    }
    
    
    @Override
    	public Iterator<E> iterator() {
		return (Iterator<E>) new ElementIterator<E>(this);
	}

  	public Iterable<Position<E>> positions() {
    	PositionList<Position<E>> P = new NodeList<Position<E>>();
    	if (!isEmpty()) {
      		Position<E> p = first();
      		while (true) {
				P.addLast(p);
				if (p == last())
	  			break;
			p = next(p);
      		}
    	}
    	return (Iterable<Position<E>>) P;
  	}
  
  
        
	  public static void main(String[] args) {
		NodeList<Integer>  NP = new NodeList<Integer> ();
//                Random rand=new Random(15);


		for (int i = 0; i <= 15; ++i) {

		  NP.addFirst(i + 1);

	    }
	    NP.remove(NP.first());
		System.out.println("The NodePositionList is \n");

		System.out.println(NP.toString());
		System.out.println();
		while (NP.size() > 0)
		  System.out.println (NP.remove(NP.first()));
	  }

        
        
}
