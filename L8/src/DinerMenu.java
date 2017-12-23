
import java.util.Iterator;


/**
 * class DinerMenu
 * 
 * @author Jessica Zeitz 
 * @version October 31
 */
public class DinerMenu
{
    // instance variables
    private static final int MAX_ITEMS = 4;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    /**
     * Constructor for objects of class DinerMenu
     */
    public DinerMenu()
    {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT", "Tofu, lettuce, tomato", true, 2.99);
        addItem("BLT", "Bacon, lettuce, tomato", false, 2.99);
        addItem("Corn Chowder", "Corn, potatoes, bacon", false, 3.29);
        addItem("Hotdog", "Hot dog with saurkraut, relish", false, 3.05);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price)
    {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }
    
    public MenuItem[] getMenuItems()
    {
        return menuItems;
    }
     public Iterator createIterator()
    {
        return new DinerMenuIterator(menuItems);
    }
}
