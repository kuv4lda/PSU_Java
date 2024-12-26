// Интерфейс для генерации значений
public interface ValueGenerator<T>
{
    T generate(int index);
}
