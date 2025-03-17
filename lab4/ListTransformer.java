import java.util.ArrayList;
import java.util.List;

public class ListTransformer 
{
    public static <T, P> List<P> transformList(List<T> list, Function<T, P> function)
    {
        if (list == null)
        {
             throw new IllegalArgumentException("Список не должен быть null.");
        }
        if (function == null)
        {
             throw new IllegalArgumentException("Функция не должна быть null.");
        }
        List<P> result = new ArrayList<>();
        for (T item : list)
        {
            result.add(function.apply(item));
        }
        return result;
    }
}

// Преобразует элементы списка в новый список