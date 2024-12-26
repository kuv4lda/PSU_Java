import java.util.Collection;

public interface Collector<P extends Collection<C>, T, C>
{
    void collect(P collection, T value);
}
