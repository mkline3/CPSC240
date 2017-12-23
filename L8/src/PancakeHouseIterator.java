import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class PancakeHouseIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PancakeHouseIterator implements Iterator
{
    private ArrayList items;
    private int position = 0;
    
    /**
     * Constructor for objects of class PancakeHouseIterator
     */
    public PancakeHouseIterator(ArrayList items)
    {
        this.items = items;
    }

    public Object next()
    {
        MenuItem item = (MenuItem)items.get(position);
        position++;
        return item;
    }
    
    public boolean hasNext()
    {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
