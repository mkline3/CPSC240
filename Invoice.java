import java.util.*;
import javax.swing.event.*;

/**
 * An invoice for a sale, consisting of line items.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Invoice
{
    private ArrayList<LineItem> items;
    private ArrayList<ChangeListener> listeners;

    /**
     * Constructs a blank invoice.
     */
    public Invoice()
    {
        items = new ArrayList<LineItem>();
        listeners = new ArrayList<ChangeListener>();
    }

    /**
     * Adds an item to the invoice.
     * @param item the item to add
     */
    public void addItem(LineItem item)
    {
        items.add(item);

        // Lab 9
        // Notify all observers of the change to the invoice
        
    }

    /**
     * Adds a change listener to the invoice.
     * @param listener the change listener to add
     */
    public void addChangeListener(ChangeListener listener)
    {
        listeners.add(listener);
        // Lab 9
        // Add listender to arraylist of listeners

    }

    /**
     * Gets an iterator that iterates through the items.
     * @return an iterator for the items
     */
    public Iterator<LineItem> getItems()
    {
        IterateItems i = new IterateItems(items);
        return i;
        // Lab 9
        // Return an iterator that iterates over the arraylist of items
        // I have provided the IterateItems class for you to use
        
    }

    public String format(InvoiceFormatter formatter)
    {
        String r = formatter.formatHeader();
        Iterator<LineItem>iter = getItems();
        
        while (iter.hasNext())
        {
            r += formatter.formatLineItem(iter.next());
        }
        
        return r + formatter.formatFooter();
    }
}
