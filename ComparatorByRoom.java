
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public abstract class ComparatorByRoom implements Comparator<Room2> {
    public ComparatorByRoom(){}
    public int compare(Room2 r1, Room2 r2){
        if(r1.getBuildingName().equals(r2.getBuildingName())){
            int room1 = Integer.parseInt(r1.getRoomNumber());
            int room2 = Integer.parseInt(r2.getRoomNumber());
            if(room1 > room2)
                return 1;
            else
                return -1;
        }
        else 
            return r1.getBuildingName().compareTo(r2.getBuildingName());
    }
}
