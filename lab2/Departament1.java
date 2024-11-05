public class Departament1
{
    private String name;
    private Employee1 boss;
    
    public String getDepartament()
    {
        return name;
    }

    public Employee1 getBoss()
    {
        return boss;
    }
    
    public void setDepartament(String name)
    {
        this.name = name;
    }
    
    public void setBoss(Employee1 boss)
    {
        this.boss = boss;
    }
}
