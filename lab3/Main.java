import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        out.println("Tasks catalog:");
        out.println("№1.1.(№1): Дом над землей..");
        out.println("№1.5.(№2): Перезарядка пистолета.");
        int x;
        int num = in.nextInt();
        switch(num)
        {
            case(1):
                out.print("Введите количчество этажей: ");
                in.nextLine();
                x = m.toInt();
                House house = new House(x);
                break;
            case(2):
                out.print("Введите количество патронов: ");
                in.nextLine();
                x = m.toInt();
                Gun gun = new Gun(x);
                out.println("Выберите действие: ");
                out.println("Перезарядка (1)");
                out.println("Разрядка (2)");
                out.println("Выстрел (3)");
                out.println("Положить пистолет (4)");
                while(num >= 1 && num <= 3)
                {
                    num = m.toInt();
                    switch(num)
                    {
                        case(1):
                            out.print("Введите количество патронов: ");
                            x = m.toInt();
                            gun.reload(x);
                            break;
                        case(2):
                            gun.unload();
                            break;
                        case(3):
                            gun.shoot();
                            break;
                        default:
                            break;
                    }
                }
                break;
            default:
                out.println("Такой задачи нет");
                break;
        }
    }
    
    public int toInt()
    {
        Scanner in = new Scanner(System.in);
        int number;
        while (true)
        {
            String input = in.nextLine();
            try
            {
                number = Integer.parseInt(input);
                break;
            }
            catch (NumberFormatException e)
            {
                out.println("Ошибка: Некорректный формат ввода. Пожалуйста, введите целое число.");
            }
        }
        return number;
    }
}
