public class House2
{
    private int floors;
    
    public int getFloors()
    {
        return floors;
    }

    private void setFloors(int floors)
    {
        this.floors = floors;
    }

    public House2()
    {
        this.floors = 0;
    }

    public House2(int floors)
    {
        this.floors = floors;
    }

    public String toString()
    {
        switch (floors % 10)
        {
            case (1):
                return "Дом с " + floors + " этажом";
            case (2):
            case (3):
            case (4):
            case (5):
            case (6):
            case (7):
            case (8):
            case (9):
            case (0):
                return "Дом с " + floors + " этажами";
        }
        return "";
    }
}
