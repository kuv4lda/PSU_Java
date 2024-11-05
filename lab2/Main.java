import static java.lang.System.out;

public class Main
{
    public static void main(String[] args)
    {
        out.println("Tasks catalog:");
        out.println("№1.4.(№1): Время.");
        out.println("№1.5.(№2): Дом.");
        out.println("№2.4.(№3): Сотрудники и отделы.");
        out.println("№1.4.(№4): Сотрудники и отделы (2).");
        out.println("№1.4.(№5): Дом (2).");
        out.println("№1.4.(№6): Пистолет стреляет.");
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
                House1 house_1 = new House1();
                house_1.setFloors(1);
                out.println(house_1);
                house_1.setFloors(5);
                out.println(house_1);
                house_1.setFloors(23);
                out.println(house_1);
                break;
            case(3):
                Departament1 dep_1 = new Departament1();
                Employee1 emp1_1 = new Employee1();
                Employee1 emp2_1 = new Employee1();
                Employee1 emp3_1 = new Employee1();
                dep_1.setDepartament("IT");
                emp1_1.setEmployee("Петров", dep_1);
                emp2_1.setEmployee("Козлов", dep_1);
                emp3_1.setEmployee("Сидоров", dep_1);
                dep_1.setBoss(emp2_1);
                out.println(emp1_1);
                out.println(emp2_1);
                out.println(emp3_1);
                break;
            case(4):
                Departament2 dep_2 = new Departament2();
                Employee2 emp1_2 = new Employee2();
                Employee2 emp2_2 = new Employee2();
                Employee2 emp3_2 = new Employee2();
                dep_2.setDepartament("IT");
                emp1_2.setEmployee("Петров", dep_2);
                emp2_2.setEmployee("Козлов", dep_2);
                emp3_2.setEmployee("Сидоров", dep_2);
                dep_2.setBoss(emp2_2);
                out.println("Список сотрудников отдела IT:");
                for (Employee2 employee : emp1_2.getDepartmentEmployees())
                    out.println(employee);
                break;
            case(5):
                House2 house1_2 = new House2(2);
                House2 house2_2 = new House2(35);
                House2 house3_2 = new House2(91);
                out.println(house1_2);
                out.println(house2_2);
                out.println(house3_2);
                break;
            case(6):
                Gun pistol = new Gun(3);
                for (int i = 0; i < 5; i++)
                {
                    pistol.shoot(); 
                }        
        	System.out.println("Осталось патронов: " + pistol.getBullets());
                break;
            default:
                out.println("Такой задачи нет");
                break;
        }
    }
}
