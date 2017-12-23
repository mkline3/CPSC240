
/**
 * A line item in an invoice.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface LineItem
{
    /**
     * Gets the price of this line item.
     * 
     * @return      the price 
     */
    double getPrice();
    
    /**
     * Gets the description of this line item.
     * 
     * @return      the description
     */
    String toString();
}