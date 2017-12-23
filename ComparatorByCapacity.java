
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
public abstract class ComparatorByCapacity implements Comparator<Room2> {
    public ComparatorByCapacity(){}
    public int compare(Room2 r1, Room2 r2){
        if(r1.getCapacity()> r2.getCapacity())
            return 1;
        else if(r1.getCapacity()==r2.getCapacity())
            return 0;
        else
            return -1;
    }
}
