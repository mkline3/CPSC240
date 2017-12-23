
/**
 * This is a class that stores info on a room
 * 
 * Matt Kline 
 * 1/18
 */
public class umwRoom
{
    private String buildingName;
    private int roomNum;
    private int seating;
    
    public umwRoom(String buildingName, int roomNum, int seating){
        this.buildingName = buildingName;
        this.roomNum = roomNum;
        this.seating = seating;
    }
    public String getBuilding(){
        return buildingName;
    }
    public int getRoom(){
        return roomNum;
    }
    public int getSeating(){
        return seating;
    }

   public static void main(String[] args){
    umwRoom one = new umwRoom("Trinkle", 32, 7);
    System.out.println("The building is: " + one.getBuilding());
    System.out.println("The room number is: " + one.getRoom());
    System.out.println("The number of seats are: " + one.getSeating());
    
   }
}

