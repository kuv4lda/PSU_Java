public interface Function<T, P>
{
    P apply(T value);
}

// Принимает значение типа T и возвращает значение типа P