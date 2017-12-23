import java.util.*;

/**
 * Write a description of class Iterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IterateItems implements Iterator<LineItem>
{
    private int current = 0;
    private ArrayList<LineItem> items;
    
    /**
     * Constructor for objects of class Iterator
     */
     public IterateItems(ArrayList<LineItem> items)
     {
         this.items = items;
     }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean hasNext()
    {
        return current < items.size();
    }

    public LineItem next()
    {
        return items.get(current++);
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
