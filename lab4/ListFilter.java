import java.util.ArrayList;
import java.util.List;

public class ListFilter
{
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("Список не должен быть null.");
        }
        if(predicate == null)
        {
            throw new IllegalArgumentException("Предикат не должен быть null.");
        }
        List<T> result = new ArrayList<>();
        for (T item : list)
        {
            if (predicate.test(item))
            {
                result.add(item);
            }
        }
        return result;
    }
}

// Фильтрует список по условию