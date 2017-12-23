/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
/**
 *
 * @author Matt
 */
public class DinerMenuIterator implements Iterator {
     private Object items[];
     private int position = 0;
     
      public DinerMenuIterator(Object items[])
    {
        this.items = items;
    }

    public Object next()
    {
        MenuItem item = (MenuItem)items[(position)];
        position++;
        return item;
    }
    
    public boolean hasNext()
    {
        if (position >= items.length) {
            return false;
        } else {
            return true;
        }
    }
    
}
