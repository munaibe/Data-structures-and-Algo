/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

import java.util.NoSuchElementException;

/**
 *
 * @author munai
 */
public class ElementIterator<E> implements Iterable<E> {

    
    public PositionList<E> p;
   public Position<E> cursor;
    
    public ElementIterator(PositionList<E> po){
        p=po;
        
       cursor = (p.isEmpty())? null : p.first();

    }
    
    
      @Override
    public boolean hasNext() {
        return cursor!=null;
    }
    
    
    @Override
    public E next() {
          if (cursor == null)
      throw new NoSuchElementException("No next element");
    E toReturn = cursor.element();
    cursor = (cursor == p.last())? null : p.next(cursor);
    return toReturn;

    }

  
    
}
