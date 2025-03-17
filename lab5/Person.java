//Хранение данных человека (имя и номер)

public class Person
{
    private String name;
    private Integer number;

    public Person(String name, Integer number)
    {
        setName(name);
        setNumber(number);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = formatName(name);
    }

    private String formatName(String name)
    {
        if (name == null || name.isEmpty())
        {
            return "";
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }


    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }


    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
