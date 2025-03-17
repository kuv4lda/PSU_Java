public interface ReducerWithInitial<T,P>
{
    P reduce(P accumulator, T value);
}

// Определение логики свёртки