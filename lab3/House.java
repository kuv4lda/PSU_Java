import static java.lang.System.out;
import java.util.Scanner;

public class House
{
    private int floors;

    public int getFloors()
    {
        return floors;
    }

    public void setFloors(int floors)
    {
        if (floors <= 0)
        {
            Scanner in = new Scanner(System.in);
            while(floors < 1)
            {
                out.println("Количество этажей должно быть положительным числом");
                floors = in.nextInt();
            }
        }
        out.println("Количество этажей: " + floors);
        this.floors = floors;
    }

    public House()
    {
        out.println("Создан дом");
        out.println("Количество этажей: 1");
        this.floors = 1;
    }

    public House(int floors)
    {
        setFloors(floors);
        out.println("Создан дом");
    }

    public String toString()
    {
        int lastDigit = floors % 10;
        int tensDigit = (floors / 10) % 10;
        if (floors == 1)
        {
            return "Дом с " + floors + " этажом";
        }
        else if (tensDigit == 1)
        {
            return "Дом с " + floors + " этажами";
        }
        else if (lastDigit == 1)
        {
            return "Дом с " + floors + " этажом";
        }
        else
        {
            return "Дом с " + floors + " этажами";
        }
    }
}
