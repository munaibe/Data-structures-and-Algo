/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public interface Deque<E> {
    public int size();
    public boolean isEmpty();
    
    public E getFirst();
    public E getLast();
    
    public void addFirst(E e);
    public void addLast(E e);
    
    public E removeFirst();
    public E removeLast();
    
    
}
