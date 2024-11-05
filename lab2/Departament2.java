import java.util.List; 
import java.util.ArrayList; 

public class Departament2
{
    private String name;
    private Employee2 boss;
    private List<Employee2> employees = new ArrayList<>();
    
    public String getDepartament()
    {
        return name;
    }

    public Employee2 getBoss()
    {
        return boss;
    }
    
    public void setDepartament(String name)
    {
        this.name = name;
    }
    
    public void setBoss(Employee2 boss)
    {
        this.boss = boss;
    }
    
    public void addEmployee(Employee2 employee)
    {
        employees.add(employee);
    }
    
    public List<Employee2> getEmployees()
    {
        return employees;
    }
}