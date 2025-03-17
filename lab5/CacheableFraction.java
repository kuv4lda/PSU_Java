// Кэширует результат toDouble() из Fraction и сбрасывает его при изменении дроби

public class CacheableFraction extends Fraction
{
    private Double cachedDoubleValue; 

    public CacheableFraction(int numerator, int denominator) // Конструктор 
    {
        super(numerator, denominator);
        this.cachedDoubleValue = null;
    }

    @Override
    public double toDouble()
    {
        if (cachedDoubleValue == null) // Вычисляет вещественное значение дроби
        {                              // Если его нет, а после кэширует и возвращает
            cachedDoubleValue = super.toDouble();
        }
        return cachedDoubleValue;
    }

    @Override
    public void setNumerator(int numerator) // Сеттер (св-во) числителя
    {
        super.setNumerator(numerator);
        cachedDoubleValue = null; // Сброс кэша
    }

    @Override
    public void setDenominator(int denominator) // Сеттер (св-во) знаменателя
    {
        super.setDenominator(denominator);
        cachedDoubleValue = null; // Сброс кэша
    }
}
