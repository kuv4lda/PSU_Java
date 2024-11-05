public class Employee1
{
    private String name;
    private Departament1 departament;
    private Employee1 boss;

    public String getName()
    {
        return name;
    }
    
    public void setEmployee(String name, Departament1 departament)
    {
        this.name = name;
        this.departament = departament;
    }
    
    public Departament1 getDepartament()
    {
        return this.departament;
    }
    
    public Employee1 getBoss() {
        return boss;
    }
    
    public String toString()
    {
        if (departament.getBoss() == this)
            return name + " начальник отдела " + departament.getDepartament();
        else
            return name + " работает в отделе " + departament.getDepartament() + ", начальник которого " + departament.getBoss();
    }
}
