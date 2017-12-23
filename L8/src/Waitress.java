import java.util.*;
/**
 * class Waitress
 * 
 * @author Jessica Zeitz 
 * @version October 31
 */
public class Waitress
{
    // instance variables
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    /**
     * Constructor for objects of class Waitress
     */
    public Waitress(PancakeHouseMenu phm, DinerMenu dm)
    {
        this.pancakeHouseMenu = phm;
        this.dinerMenu = dm;
    }

    public void printMenu()
    {
        LinkedList breakfast = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunch = dinerMenu.getMenuItems();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeIterator = breakfast.iterator();
        
        System.out.println("MENU\n----\nBREAKFAST");
//         for (int i=0; i<breakfast.size(); i++)
//         {
//             MenuItem item = (MenuItem)breakfast.get(i);
//             System.out.println(item.getName());
//         }
        printMenu(pancakeIterator);
        
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        // What happens if menu is not full?
//        for (int j=0; j<lunch.length; j++)
//        {
//            MenuItem item = lunch[j];
//            System.out.println(item.getName());
//        }
    }
    
    private void printMenu(Iterator iterator)
    {
        while (iterator.hasNext())
        {
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName());
        }
    }
}
