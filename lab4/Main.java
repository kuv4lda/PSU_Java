import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        int a, b;
        // System.out.println("Задача 1.1:");
        // // Создание дроби
        // Fraction fraction = new Fraction(0, 1);
        // CacheableFraction cacheableFraction = new CacheableFraction(0, 1);
        // System.out.println("Введите числитель и знаменатель:");
        // a = in.nextInt();
        // b = in.nextInt();
        // try
        // {
        //     new Fraction(a, b);
        //     fraction = m.toFraction(a,b);
        //     System.out.println("Дробь: " + fraction);
        //     System.out.println("Вещественное значение: " + fraction.toDouble());
        //     cacheableFraction = new CacheableFraction(a, b);
        //     System.out.println("Кэшируемая дробь: " + cacheableFraction);
        //     System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        // }
        // catch (IllegalArgumentException e)
        // {
        //     System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        // }
        // // Смена числителя
        // System.out.println("Введите новый числитель:");
        // a = in.nextInt();
        // try
        // {
        //     new Fraction(a, fraction.getDenominator());
        //     fraction = m.toFractionNumerator(fraction, a);
        //     System.out.println("Дробь: " + fraction);
        //     System.out.println("Вещественное значение: " + fraction.toDouble());
        //     cacheableFraction = new CacheableFraction(a, b);
        //     System.out.println("Кэшируемая дробь: " + cacheableFraction);
        //     System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        // }
        // catch (IllegalArgumentException e)
        // {
        //     System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        // }
        // // Смена знаменателя
        // System.out.println("Введите новый знаменатель:");
        // b = in.nextInt();
        // try
        // {
        //     new Fraction(fraction.getNumerator(), b);
        //     fraction = m.toFractionNumerator(fraction, b);
        //     System.out.println("Дробь: " + fraction);
        //     System.out.println("Вещественное значение: " + fraction.toDouble());
        //     cacheableFraction = new CacheableFraction(a, b);
        //     System.out.println("Кэшируемая дробь: " + cacheableFraction);
        //     System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        // }
        // catch (IllegalArgumentException e)
        // {
        //     System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        // }
        
        System.out.println("Задача 2.1:");
        try
        {
            // Создание кота
            Cat cat = new Cat("Барсик");
            System.out.println(cat);
            
            // Вызов метода makeAllMeow с одним котом
            List<Cat> cats = Arrays.asList(cat);
            Meower.makeAllMeow(cats);
            System.out.println("Кот " + cat.getName() + " мяукнул " + cat.getMeowCount() + " раз(а)");

            //Создание 2-го кота
            Cat cat2 = new Cat("Мурзик");
            System.out.println(cat2);
            
            // Вызов метода makeAllMeow с двумя котами
            List<Cat> cats2 = Arrays.asList(cat,cat2);
            Meower.makeAllMeow(cats2);
            System.out.println("Кот " + cat.getName() + " мяукнул " + cat.getMeowCount() + " раз(а)");
            System.out.println("Кот " + cat2.getName() + " мяукнул " + cat2.getMeowCount() + " раз(а)");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Ошибка при создании кота: " + e.getMessage());
        }
    }
    
    public Fraction toFraction(int a, int b)
    {
        Fraction fraction = new Fraction(a, b);
        return fraction;
    }
    
    public Fraction toFractionNumerator(Fraction fraction, int a)
    {
        fraction.setNumerator(a);
        return fraction;
    }
    
    public Fraction toFractionDenominator(Fraction fraction, int b)
    {
        fraction.setDenominator(b);
        return fraction;
    }
}

