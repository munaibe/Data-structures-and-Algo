/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public interface Vector<E> {
    
    
    public int size();//returns the amount elements in vector
    public boolean isEmpty();//returns if vector is empty
    public E elemAtRank(int r);//returns element at index
    public void replaceAtRank(int r, E e);//replaces element at index
    public void insertAtRank(int r, E e);//inserts element at index
    public E removeAtRank(int r);//removes element at rank
    
}
