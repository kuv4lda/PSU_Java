import java.util.Objects;

interface IFraction
{
    double toDouble(); // Вещественное значение дроби
    void setNumerator(int numerator); // Числитель
    void setDenominator(int denominator); // Знаменатель
}

public class Fraction implements IFraction
{
    private int numerator; // Числитель
    private int denominator; // Знаменатель

    public Fraction(int numerator, int denominator)
    {
        if (denominator == 0) // Проверка знаменателя
        {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) // Нормализация дроби
        {
           numerator = -numerator;
           denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() // Геттер (св-во) числителя
    {
        return numerator;
    }

    public int getDenominator()  // Геттер (св-во) знаменателя
    {
        return denominator;
    }

    @Override
    public double toDouble() // toDouble из IFraction
    {
        return (double) numerator / denominator;
    }

    @Override
    public void setNumerator(int numerator) // Сеттер (св-во) числителя из IFraction
    {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) // Сеттер (св-во) знаменателя из IFraction
    {
        if (denominator == 0) //Проверка знаменателя
        {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (denominator < 0) // Нормализация дроби
        {
            this.numerator = -this.numerator;
            denominator = -denominator;
        }
        this.denominator = denominator;
    }

    @Override
    public String toString() // Метод
    {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) // Сравнение 
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() // Возвращает хэш-код объекта
    {
        return Objects.hash(numerator, denominator);
    }
}
