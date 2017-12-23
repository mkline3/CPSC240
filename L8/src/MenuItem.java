
/**
 * class MenuItem
 * 
 * @author Jessica Zeitz
 * @version October 31
 */
public class MenuItem
{
    // instance variables
    private String name;
    private String desc;
    private boolean vegetarian;
    private double price;

    /**
     * Constructor for objects of class MenuItem
     */
    public MenuItem(String n, String d, boolean v, double p)
    {
        this.name = n;
        this.desc = d;
        this.vegetarian = v;
        this.price = p;
    }

    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public boolean getVegetarian()
    {
        return vegetarian;
    }
    
    public double getPrice()
    {
        return price;
    }
}
