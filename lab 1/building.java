@@ -0,0 +1,83 @@
public class Building
{

    private String buildingName;
    private int floors;
    private int rooms;
    private String colour;



    public Building(String buildingName, int floors, int rooms, String colour)
    {
      this.buildingName = buildingName;
      this.floors = floors;
      this.rooms = rooms;
      this.colour = colour;
    }


    public void setBuldingName(String buildingName)
    {
       this.buildingName = buildingName;
    }

    public void setFloors(int floors)
    {
       this.floors = floors;
    }

    public void setNumberOfRoomsPerFloor(int rooms)
    {
       this.rooms = rooms;
    }

    public void setColor(String colour) 
    {
       this.colour = colour;
    }

    public String getNameOfBulding() 
    {
      return buildingName;
    }

    public int getNumberOfFloor() 
    {
      return floors;
    }

    public int getNumberOfRoomsPerFloor()
    {
      return rooms;
    }

    public String getColor() 
    {
      return colour;
    }

    public static void main(String[] args)
    {
      Building[] building = new Building[5];
      building[0] = new Building("Kilimanjaro house",5,7,"Orange");
      building[1] = new Building("Pioneer",4,6,"Maroon");
      building[2] = new Building("Nyati house",2,7,"Purple");
      building[3] = new Building("Nyayo house",8,2,"Red");
      building[4] = new Building("Afya Center",5,9,"Green");

      System.out.println("---------Start of report-----------------");


      for(int count =0;  count < building.length ; count ++)
      {
         System.out.println(building[count].getNameOfBulding() + " is a " + building[count].getColor() + " building and has " +(building[count].getNumberOfFloor() * building[count].getNumberOfRoomsPerFloor()) + " rooms " );
      }
        System.out.println("---------End of report-----------------");

    }

    public Building()
    {}

}
