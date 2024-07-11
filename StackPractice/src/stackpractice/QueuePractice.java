/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackpractice;

import java.util.Arrays;

/**
 *
 * @author munai
 */
public class QueuePractice<E> implements Queue<E> {

    public E[] Q;
    public int front, rear=-1;
    public int maxCap;
    
    
    public QueuePractice(int c){
        maxCap=c;
        Q=(E[])new Object[maxCap];
    }
    
    
 
    
    @Override
   public boolean isFull(){
       if(front==0&&rear==maxCap-1)
       {
           return true;
   }
       
    return false;   
   }

    @Override
    public boolean isEmpty() {
       if(front==-1 && rear==-1)
       {
           return true;
       }
       return false;
    }

    @Override
    public void enqueue(E el) {
       
        if(front==-1){
       front=0;
        }
       rear++;
       Q[rear]=el;
       
        
    }

    @Override
    public E dequeue() {
     E element=Q[front];
    
     Q[front]=null;
     front++;
     return element;
    }

    @Override
    public E Front() {
           E element=Q[front];
     return element;
    }
      
     public String toString()
    {
      
        if(isEmpty())
        {
           return "Q is empty";
        }
       
    
        
        return "{" + Arrays.toString(Q) + "]";
    }
    
    
    public static void main(String[] args) {
     QueuePractice<Integer> queue= new QueuePractice<>(5);
     
     
     queue.enqueue(1);
     queue.enqueue(2);
     queue.enqueue(3);
     queue.enqueue(4);
     queue.enqueue(5);
     
     
     
        System.out.println(queue.toString());
        
        queue.dequeue();
        
          System.out.println(queue.toString());
            queue.dequeue();
            System.out.println(queue.toString());
     
    }
}
