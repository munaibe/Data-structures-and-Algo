/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public interface Queue<E> {
    
    public int size();
    public boolean isEmpty();
    public void enqueue(E el);
    public E dequeue();
    public E Front();
    
}
