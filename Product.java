
/**
 * A product with a price and description.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product implements LineItem
{
    private String description;
    private double price;
    
    /**
     * Constructs a product.
     * 
     * @param   description     the description
     * @param   price           the price
     */
    public Product(String description, double price)
    {
        this.description = description;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return description;
    }
}
