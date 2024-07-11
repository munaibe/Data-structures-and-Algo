/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public interface NodeStack<E> {
    public int size();
    public boolean isEmpty();
    public void push(E n);
    public E pop();
    public E top();
}
