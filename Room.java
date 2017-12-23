
/**
 * This class represents a room in a building.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class Room implements Comparable<Room>
{
    // fields
    private String roomNumber;
    private String buildingName;
    private int capacity;

    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        this.capacity = 0;
    }
    
    /**
     * Constructor for objects of class Room
     * 
     * @param   rN  the room number
     * @param   bN  the building name
     * @param   c   the room capacity
     */
    public Room(String rN, String bN, int c)
    {
        setRoomNumber(rN);
        setBuildingName(bN);
        setCapacity(c);
    }
    
    /**
     * Mutator method (setter) for room number.
     * 
     * @param  rN   a new room number 
     */
    public void setRoomNumber(String rN)
    {
        this.roomNumber = rN;
    }
    
    /**
     * Mutator method (setter) for building name.
     * 
     * @param  bN   a new building name 
     */
    public void setBuildingName(String bN)
    {
        this.buildingName = bN;
    }
    
    /**
     * Mutator method (setter) for capacity.
     * 
     * @param  c   a new capacity 
     */
    public void setCapacity(int c)
    {
        this.capacity = c;
    }
    
    /**
     * Accessor method (getter) for room number.
     * 
     * @return  the room number 
     */
    public String getRoomNumber()
    {
        return this.roomNumber;
    }
    
    /**
     * Accessor method (getter) for building name.
     * 
     * @return  the building name 
     */
    public String getBuildingName()
    {
        return this.buildingName;
    }
    
    /**
     * Accessor method (getter) for capacity.
     * 
     * @return  the capacity 
     */
    public int getCapacity()
    {
        return this.capacity;
    }
    public int compareTo(Room r){
        if(r.getCapacity()> this.getCapacity())
            return 1;
        else if(r.getCapacity() == this.getCapacity())
            return 0;
        else
            return -1;
    }
}
