import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ListCollector {

    public static <T, P> P collect(List<T> list,
                                   Supplier<P> creator,
                                   BiConsumer<P, T> collector) {
        Objects.requireNonNull(creator, "Creator не должен быть null.");
        Objects.requireNonNull(collector, "Collector не должен быть null.");
        P collection = creator.get();
        if (list != null) {
            for (T item : list) {
                collector.accept(collection, item);
            }
        }
        return collection;
    }
}

// Сбор эл-тов в разные списки по условию