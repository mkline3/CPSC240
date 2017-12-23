import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * class PancakeHouseMenu
 * 
 * @author Jessica Zeitz
 * @version October 31
 */
public class PancakeHouseMenu
{
    // instance variables
    private LinkedList menuItems;

    /**
     * Constructor for objects of class PancakeHouseMenu
     */
    public PancakeHouseMenu()
    {
        menuItems = new LinkedList();
        
        addItem("Special Pancake Breakfast", "Pancakes, scrambled eggs, toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes, fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);
        addItem("Waffles", "Buttermilk waffles with fruit", true, 3.59);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price)
    {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(item);
    }
    
    public LinkedList getMenuItems()
    {
        return menuItems;
    }
    
//    public Iterator createIterator()
//    {
//        return new PancakeHouseIterator(menuItems);
//    }
}
