import java.util.InputMismatchException;
import java.util.Scanner;

class NumberComparator implements Сравнимое<NumberComparator>
{
    private int number;

    public NumberComparator(int number)
    {
        this.number = number;
    }
    public NumberComparator()
    {
        this.number = 0;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public static NumberComparator inputNumber(Scanner scanner)
    {
        int number;
        while (true)
        {
            try
            {
                System.out.print("Введите целое число: ");
                number = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Неверный ввод. Пожалуйста введите целое число.");
                scanner.next();
            }
        }
        return new NumberComparator(number);
    }

    @Override
    public int сравнить(NumberComparator other)
    {
        return Integer.compare(this.number, other.number);
    }

    @Override
    public String toString()
    {
        return "Число: " + number;
    }
}
