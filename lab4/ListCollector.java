import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ListCollector
{

    public static <T, C extends Collection<T>, P extends Collection<C>> P collectList(List<T> list,
                                                         CollectionCreator<P, T, C> creator,
                                                         Collector<P, T, C> collector) {
        Objects.requireNonNull(creator, "Creator не должен быть null.");
        Objects.requireNonNull(collector, "Collector не должен быть null.");
        P collection = creator.create();
        if(list!=null)
        {
            for (T item : list)
            {
                collector.collect(collection, item);
            }
        }
        return collection;
    }

    public static <T, P extends Collection<T>> P collectSimple(List<T> list,
                                                             CollectionCreator<P, T, T> creator,
                                                             SimpleCollector<P, T> collector) {
        Objects.requireNonNull(creator, "Creator не должен быть null.");
        Objects.requireNonNull(collector, "Collector не должен быть null.");
        P collection = creator.create();
        if(list!=null)
        {
            for (T item : list) {
                collector.collect(collection, item);
            }
        }
        return collection;
    }
}
