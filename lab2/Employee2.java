import java.util.List;
import java.util.ArrayList; 

public class Employee2
{
    private String name;
    private Departament2 departament;
    private Employee2 boss;

    public String getName()
    {
        return name;
    }
    
    public void setEmployee(String name, Departament2 departament)
    {
        this.name = name;
        this.departament = departament;
        departament.addEmployee(this);
    }
    
    public Departament2 getDepartament()
    {
        return this.departament;
    }
    
    public Employee2 getBoss()
    {
        return boss;
    }
    
    public List<Employee2> getDepartmentEmployees()
    {
        return departament.getEmployees();
    }
    
    public String toString()
    {
        if (departament.getBoss() == this)
            return name + " начальник отдела " + departament.getDepartament();
        else
            return name + " работает в отделе " + departament.getDepartament() + ", начальник которого " + departament.getBoss();
    }
}
