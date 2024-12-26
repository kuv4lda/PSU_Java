import java.util.List;
import java.util.Objects;

public class ListReducer
{
    public static <T, P> P reduceList(List<T> list, ReducerWithInitial<T, P> reducer, P initialValue)
    {
       Objects.requireNonNull(reducer, "Reducer не должен быть null.");
        if (list == null || list.isEmpty())
        {
            return initialValue;
        }
        P accumulator = initialValue;
        for (T item : list)
        {
            accumulator = reducer.reduce(accumulator, item);
        }
        return accumulator;
    }
}
