
/**
 * class FullMenu
 * 
 * @author Jessica Zeitz
 * @version October 31
 */
public class FullMenu
{
    public static void main(String[] args)
    {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        
        waitress.printMenu();
    }
}
