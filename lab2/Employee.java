public class Employee
{
    private String name;
    private Departament departament;

    public String getName()
    {
        return name;
    }
    
    public void setEmployee(String name, Departament departament)
    {
        this.name = name;
        this.departament = departament;
    }
    
    public Departament getDepartament()
    {
        return this.departament;
    }
    
    public String toString()
    {
        if(name == departament.getBoss())
            return name + " начальник отдела " + departament.getDepartament();
        else
            return name + " работает в отделе " + departament.getDepartament() + ", начальник которого " + departament.getBoss();
    }
}
