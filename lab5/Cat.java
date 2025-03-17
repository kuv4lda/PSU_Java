// Сущность кота с именем и счётчиком мяуканий 

public class Cat implements Meowable
{
    private String name; // Имя
    private int meowCount = 0; // Кол-во мяу

    public Cat(String name) // Конструктор
    {
        if (name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("Имя кота не может быть пустым.");
        }
        this.name = name;
    }

    public String getName() // Геттер имени
    {
        return name;
    }
    
    public int getMeowCount() // Геттер кол-ва мяу
    {
        return meowCount;
    }
    
    @Override
    public void meow() // Метод для мяу кота 
    {
        System.out.println(name + ": мяу!");
        meowCount++;
    }

    @Override
    public String toString() // Метод
    {
        return "Кот: " + name;
    }
}
