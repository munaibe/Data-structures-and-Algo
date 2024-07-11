/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public class VectorClass<E> implements Vector<E> {

    public E[] arr;
    public int length=0;
   
    
    public VectorClass(int cap){
        length=cap;
        arr=(E[])new Object[length];
    }
    
    
    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length==0;
    }

    
    public boolean checkIndex(int r){
     return (r<0 || r>length);
    }
    
    @Override
    public E elemAtRank(int r) {
        if(checkIndex(r))
        {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        
        return arr[r];
    }

    @Override
    public E replaceAtRank(int r, E e) {
         if(checkIndex(r))
        {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
         E element=arr[r];
         arr[r]=e;
         
         return element;
    }

    @Override
    public void insertAtRank(int r, E e) {
         if(checkIndex(r))
        {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
         
         if(arr.length==length){
             E[] A= (E[]) new Object[length*2];
             
             for(int i=0; i<length-1;i++){
             A[i]=arr[i];
         }
             A=arr;
             
             
             
             for(int i=0;i<A.length-1;i++){
             if(i==r)
             {
                 A[i+1]=A[i];
                 A[r]=e;
                 
             }
             length++;
         }
             
         }
         
        
         
    }

    @Override
    public E removeAtRank(int r) {
            if(checkIndex(r))
        {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
            
            E element=arr[r];
            
              for(int i=0;i<arr.length-1;i++){
             if(i==r)
             {
                 arr[i]=arr[i+1];
                
                 
             }
            
          
         
    }
    
}
