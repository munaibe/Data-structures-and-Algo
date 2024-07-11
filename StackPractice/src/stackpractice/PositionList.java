/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackpractice;

import java.util.Iterator;

/**
 *
 * @author munai
 * @param <E>
 */
public interface PositionList<E> {
    
    public int size();//return number of elememgs in lists
    public boolean isEmpty();//returns if lists is empty
    
    public Position<E> first();//return first Position before head node
    public Position<E> last();//return last Position before last node
    public Position<E> next(Position<E> p);//returns next Position after given Positoin
    public Position<E> Prev( Position<E> p);//returns previous Positin before given Postion
    
    public void addFirst(E e);//adds a new Node with giveen element at top of list
    public void addLast(E e);//adds a new node with given element at bottom of list
    public void addAtfer( Position<E> p, E e);//adss a new node after given position, with element
    public void addBefore(Position<E> p, E e);//adds new node before given position with element
    
    public E remove(Position<E> p);//removes a given position from list and returns the element
    public E set(Position<E> p, E e);//sets a new element in given position, returning old element
    
    public Iterator<E> iterator();
    public Iterable<Position<E>> positions();
    
}
