import java.util.Collection;

public interface SimpleCollector<P extends Collection<T>, T>
{
    void collect(P collection, T value);
}
