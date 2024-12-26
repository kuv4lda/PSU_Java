import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("1.3");
        NumberComparator num1 = NumberComparator.inputNumber(in);
        NumberComparator num2 = NumberComparator.inputNumber(in);
        int resultNum = num1.сравнить(num2);
        System.out.println("Результат сравнения чисел: " + resultNum);
        
        System.out.println("2.4");
        List<Integer> integerList = new ArrayList<>();
        ListFiller.fillList(integerList, index -> index);
        System.out.println("Список: " + integerList);

        System.out.println("3.1");
        // 1. Преобразование строк в длины
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = ListTransformer.transformList(strings, String::length);
        System.out.println("Длины строк: " + lengths);

        // 2. Преобразование чисел (абсолютное значение для отрицательных)
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> absNumbers = ListTransformer.transformList(numbers, x -> Math.abs(x));
        System.out.println("Абсолютные значения: " + absNumbers);

        // 3. Преобразование массивов в максимальные значения
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{1, 5, 2, 8});
        arrays.add(new int[]{-3, -10, -2});
        arrays.add(new int[]{10, 20, 30, 40});
        List<Integer> maxValues = ListTransformer.transformList(arrays, arr ->
        {
            if (arr == null || arr.length == 0)
            {
                return Integer.MIN_VALUE;
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println("Максимальные значения: " + maxValues);

        System.out.println("3.2");
        
        
        System.out.println("3.2");
        
        
        System.out.println("3.2");
        
        
        System.out.println("3.2");
        
    }
}
