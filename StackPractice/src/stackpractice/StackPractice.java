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
public class StackPractice<E>  implements Stack<E> {

    //using am array to implement stack
    
 public E[] arr;
 public int cap;
 public int top=-1;
 
 public StackPractice(int c){
     cap=c;
     arr=(E[])new Object[cap];
 }
 
 public int size(){
     return top+1;
 }
 
 public boolean isEmpty(){
     return top<0;
 }
 
 
 
 public void push(E e){
     if(top==cap){
         System.out.println("Stack is full exception");
     }
     top++;
     arr[top]=e;
 }
 
 
 public E pop(){
     if(isEmpty()){
         System.out.println("Stack is empty Exception");
     }
     
     
     E element=arr[top];
     arr[top]=null;
     top--;
     return element;
 }
 
 
 public E top(){
       if(isEmpty()){
         System.out.println("Stack is empty Exception");
     }
   
     return arr[top];
 }
    
    
}
