
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class TestComparator {
    public static void main(String[] args){
         Room2 room1 = new Room2("110", "Trinkle", 35);
        Room2 room2 = new Room2("07", "Trinkle", 28);
        Room2 room3 = new Room2("118", "Monroe", 75);
        Room2 room4 = new Room2("250", "Monroe", 25);
        Room2 room5 = new Room2("417", "Eagle Landing", 4);
        ArrayList<Room2> list = new ArrayList<>();
        list.add(room1);
        list.add(room2);
        list.add(room3);
        list.add(room4);
        list.add(room5);
        for(int i = 0; i< list.size(); i++)
            System.out.println(list.get(i).getBuildingName() +" " + list.get(i).getRoomNumber()+" " +
                    list.get(i).getCapacity());
        ComparatorByRoom com = new ComparatorByRoom() {};
        System.out.println("");
        System.out.println("Rooms compared by name: ");
        Collections.sort(list,com);
        int x;
         for( x = 0; x<list.size(); x++)
            System.out.println(list.get(x).getBuildingName()+" " + list.get(x).getRoomNumber()
            + " " + list.get(x).getCapacity());
        ComparatorByCapacity com2 = new ComparatorByCapacity() {};
        System.out.println("");
        System.out.println("Rooms compared by Capacity: ");
        Collections.sort(list,com2);
         for( x = 0; x<list.size(); x++)
            System.out.println(list.get(x).getBuildingName()+" " + list.get(x).getRoomNumber()
            + " " + list.get(x).getCapacity());
    }
}
