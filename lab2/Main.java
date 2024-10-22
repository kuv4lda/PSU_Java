import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
        Random r = new Random();
        Main m = new Main();
        out.println("Tasks catalog:");
        out.println("№1.4.(№1): Время.");
        out.println("№1.5.(№2): Дом.");
        out.println("№2.4.(№3): Сотрудники и отделы.");
        out.println("№1.4.(№1): Время.");
        out.println("№1.4.(№1): Время.");
        out.println("№1.4.(№1): Время.");
        out.println("Введите номер задачи (тот, что в скобочках): ");
        int num = in.nextInt();
        switch(num)
        {
            case(1):
                Time time = new Time();
                time.setSeconds(10);
                out.println(time);
                time.setSeconds(10000);
                out.println(time);
                time.setSeconds(100000);
                out.println(time);
                break;
            case(2):
                House house = new House();
                house.setFloors(1);
                out.println(house);
                house.setFloors(5);
                out.println(house);
                house.setFloors(23);
                out.println(house);
                break;
            case(3):
                Employee emp1 = new Employee();
                Employee emp2 = new Employee();
                Employee emp3 = new Employee();
                Departament dep = new Departament();
                dep.setDepartament("IT");
                emp1.setEmployee("Петров", dep);
                emp2.setEmployee("Козлов", dep);
                emp3.setEmployee("Сидоров", dep);
                String boss = emp2.getName();
                dep.setBoss(boss);
                out.println(emp1);
                out.println(emp2);
                out.println(emp3);
                break;
            case(4):
                break;
            case(5):
                break;
            case(6):
                break;
            default:
                out.println("Такой задачи нет");
                break;
        }
	}
}
