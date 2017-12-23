
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
public class TestComparable {
    public static void main(String[] args){
        Room room1 = new Room("110", "Trinkle", 35);
        Room room2 = new Room("B7", "Trinkle", 28);
        Room room3 = new Room("118", "Monroe", 75);
        Room room4 = new Room("250", "Monroe", 25);
        Room room5 = new Room("417", "Eagle Landing", 4);
        ArrayList<Room> list = new ArrayList<>();
        list.add(room1);
        list.add(room2);
        list.add(room3);
        list.add(room4);
        list.add(room5);
        for(int i = 0; i< list.size(); i++)
            System.out.println(list.get(i).getBuildingName() +" " + list.get(i).getRoomNumber()+" " +
                    list.get(i).getCapacity());
        Collections.sort(list);
        System.out.println("");
        System.out.println("The order from largest capacity to smallest is:");
        for(int x = 0; x<list.size(); x++)
            System.out.println(list.get(x).getBuildingName()+" " + list.get(x).getRoomNumber()
            + " " + list.get(x).getCapacity());
    }
}
