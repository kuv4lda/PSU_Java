import java.util.Collection;

public interface CollectionCreator<P extends Collection<C>, T, C>
{
    P create();
}
