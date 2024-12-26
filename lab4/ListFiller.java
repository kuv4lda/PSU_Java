import java.util.List;

public class ListFiller
{
   public static <T> void fillList(List<T> list, ValueGenerator<T> generator)
   {
        if (list == null)
        {
            throw new IllegalArgumentException("Список не должен быть null.");
        }
        if(generator == null)
        {
             throw new IllegalArgumentException("Генератор значений не должен быть null.");
        }
        for (int i = 1; i <= 100; i++)
        {
            list.add(generator.generate(i));
        }
    }
}


