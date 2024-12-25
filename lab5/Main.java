import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        int a, b;
        System.out.println("Задача 1.1:");
        Создание дроби
        Fraction fraction = new Fraction(0, 1);
        CacheableFraction cacheableFraction = new CacheableFraction(0, 1);
        System.out.println("Введите числитель и знаменатель:");
        a = in.nextInt();
        b = in.nextInt();
        try
        {
            new Fraction(a, b);
            fraction = m.toFraction(a,b);
            System.out.println("Дробь: " + fraction);
            System.out.println("Вещественное значение: " + fraction.toDouble());
            cacheableFraction = new CacheableFraction(a, b);
            System.out.println("Кэшируемая дробь: " + cacheableFraction);
            System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        }
        // Смена числителя
        System.out.println("Введите новый числитель:");
        a = in.nextInt();
        try
        {
            new Fraction(a, fraction.getDenominator());
            fraction = m.toFractionNumerator(fraction, a);
            System.out.println("Дробь: " + fraction);
            System.out.println("Вещественное значение: " + fraction.toDouble());
            cacheableFraction = new CacheableFraction(a, b);
            System.out.println("Кэшируемая дробь: " + cacheableFraction);
            System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        }
        // Смена знаменателя
        System.out.println("Введите новый знаменатель:");
        b = in.nextInt();
        try
        {
            new Fraction(fraction.getNumerator(), b);
            fraction = m.toFractionNumerator(fraction, b);
            System.out.println("Дробь: " + fraction);
            System.out.println("Вещественное значение: " + fraction.toDouble());
            cacheableFraction = new CacheableFraction(a, b);
            System.out.println("Кэшируемая дробь: " + cacheableFraction);
            System.out.println("Вещественное кэшируемое значение: " + cacheableFraction.toDouble());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Ошибка при создании/изменении дроби: " + e.getMessage());
        }
        
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

        System.out.println("Задача 3.6:");
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 5));
        ListProcessor intProcessor = new ListProcessor(intList);
        System.out.println("Исходный список: " + intProcessor);
        intProcessor.removeConsecutiveDuplicates();
        System.out.println("Список после удаления дубликатов: " + intProcessor);

        System.out.println("Задача 4.6: ");
        System.out.print("Введите количество абитуриентов: ");
        int numApplicants = Integer.parseInt(in.nextLine());
        if (numApplicants < 0 || numApplicants > 500)
        {
            System.out.println("Количество абитуриентов должно быть от 0 до 500.");
            return;
        }
        TestResultProcessor processor = new TestResultProcessor();
        for (int i = 0; i < numApplicants; i++)
        {
            System.out.print("Введите данные абитуриента (Фамилия Имя Баллы1 Баллы2 Баллы3): ");
            String line = in.nextLine();
            String[] parts = line.split(" ");
            try
            {
                if (parts.length != 5)
                {
                    throw new IllegalArgumentException("Неверный формат ввода. Ожидается: Фамилия Имя Баллы1 Баллы2 Баллы3");
                }
                String lastName = parts[0];
                String firstName = parts[1];
                int score1 = Integer.parseInt(parts[2]);
                int score2 = Integer.parseInt(parts[3]);
                int score3 = Integer.parseInt(parts[4]);
                Applicant applicant = new Applicant(lastName, firstName, score1, score2, score3);
                processor.addApplicant(applicant);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Ошибка ввода: " + e.getMessage());
                i--; // Повторяем ввод для этого абитуриента
            }
        }
        List<Applicant> admittedApplicants = processor.getAdmittedApplicants();
        System.out.println("\nАбитуриенты, допущенные к сдаче экзаменов в первом потоке:");
        for (Applicant applicant : admittedApplicants)
        {
            System.out.println(applicant.getLastName() + " " + applicant.getFirstName());
        }

        System.out.println("Задача 5.6:");
        String inputText = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt")))
        {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null)
            {
                sb.append(line).append("\n");
            }
            inputText = sb.toString().trim();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
        System.out.println("Input text: " + inputText);
        m.processText(inputText);

        System.out.println("Задача 6.1:");
        MyQueue<Integer> queue = new MyQueue<>();
        // Заполняем очередь
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Исходная очередь: " + queue);
        m.printQueueReversed(queue);

        System.out.println("Задача 7.1:");
        List<Point> points = Arrays.asList(
                new Point(1, 2),
                new Point(3, -4),
                new Point(1, 2),
                new Point(5, 6),
                new Point(3, -4),
                new Point(-2, -1),
                new Point(-2,-1)
        );
        try
        {
            Polyline polyline = new Polyline(points);
            System.out.println("Processed Polyline: " + polyline);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error creating polyline: " + e.getMessage());
        }

        System.out.println("Задача 7.2:");
        try
        {
            Map<Integer, List<String>> groupedPeople = PersonGroup.groupPeopleByNumber("data.txt");
            System.out.println(groupedPeople);
        }
        catch (IOException e)
        {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
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

    public <T> void printQueueReversed(MyQueue<T> queue)
    {
        if (queue.isEmpty())
        {
            System.out.println("Очередь пуста.");
            return;
        }
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty())
        {
            stack.push(queue.dequeue());
        }
        System.out.print("Очередь в обратном порядке: ");
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}

