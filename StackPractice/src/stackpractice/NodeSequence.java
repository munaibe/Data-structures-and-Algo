/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;


/**
 *
 * @author munai
 */
public class NodeSequence<E> extends NodeList<E> implements Sequence<E> {
    
    public Node<E> head,tail;
   public Iterable<E> it;
    
    public NodeSequence()
    {
        head=new Node(null,null,null);
        tail=new Node(head,null,null);
        head.setNext(tail);
        length=0;
        
       it=null;
        
    }
    
   
    public void checkRank(int r, int L)
    {
        if(r<0 || r>L)
        {
            throw new IndexOutOfBoundsException("Index out of bounds"); 
        }
    }

    @Override
    public int rankOf(Position<E> p) {
       Node<E> newNode=head.getNext();
       
       for(int i=1;i<length;i++)
       {
           if(newNode==p){
               return i;
           }
           newNode=newNode.getNext();
       }
       
       return 0;
    }

    @Override
    public Position<E> atRank(int r) {
        Node<E> newNode;
        checkRank(r,length);
        if(r<=length/2)
        {
            for(int i=1;i<r;i++){
                newNode=head.getNext();
            }
        }
        
        else{
            newNode=tail.getPrev();
            for(int i=1;i<length-r;i++){
                
                newNode=newNode.getPrev();
            }
            return newNode;
        }
        return null;
        
       
    }

    @Override
    public E elemAtRank(int r) {
       
      return atRank(r).element();
        
    }


     @Override
    public void insertAtRank(int r, E e) {
        checkRank(r,length);
        
        if(r == size())
			addLast(e);
        
        addBefore(atRank(r),e );
   
        
    }

    @Override
    public E removeAtRank(int r) {
        checkRank(r,length);
        
        Node<E> currNode=checkPos(atRank(r));
        E element =currNode.getElement();
        
        remove(atRank(r));
        return element; 
        
    }

    @Override
    public void replaceAtRank(int r, E e) {
    
        checkRank(r,length);
        
        Node<E> curr=checkPos(atRank(r));
       set(atRank(r), e);
    }
    
   public static <E> String toString(PositionList<E> l) {
	      Iterator <E> it =  l.iterator();
	      String s = "[";
	      while (it.hasNext()) {
	        s += it.next();	// implicit cast of the next element to String
	        if (it.hasNext())
	  	      s += ", ";
	        }
	      s += "]";
	      return s;

	    }

   
   public static void bubbleSort(NodeSequence<Integer> s){
       int size=s.size();
       
       for(int i=0; i<size;i++)
           
           for(int j=i+1; j<size-i-1;j++)
               
               if(s.elemAtRank(i)>s.elemAtRank(j)){
                   Integer temp=s.elemAtRank(j);
                   s.replaceAtRank(i, temp);
                   s.replaceAtRank(j, s.elemAtRank(i));
               }
       
   }
   
//   public static void merge(
//   a, int[] l, int[] r, int left, int right) {
// 
//    int i = 0, j = 0, k = 0;
//    while (i < left && j < right) {
//        if (l[i] <= r[j]) {
//            a[k++] = l[i++];
//        }
//        else {
//            a[k++] = r[j++];
//        }
//    }
//    while (i < left) {
//        a[k++] = l[i++];
//    }
//    while (j < right) {
//        a[k++] = r[j++];
//    }
//    
//   }
  
    
    public static void main(String[] args) {
    
   
        NodeSequence<Integer> seq=new NodeSequence<>();
        
        Random rand=new Random();
        int num= rand.nextInt(20000);


         seq.addFirst(num);
          int num2= rand.nextInt(20000);
        seq.addLast(num2);
       
        
//        for(int i=0;i<seq.size();i++){
//            seq.insertAtRank(i, num);
//        }
        
          bubbleSort(seq);
          System.out.println(seq.toString());
     
        
       
      
    }

    
   
    
    
  
    
    
    
}
