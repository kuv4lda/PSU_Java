import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

	//1.3: Сравнение двух объектов.
	//Сравнимое (Интерфейс Сравнимое.java и класс NumberComparator.java)
        System.out.println("1.3");
        NumberComparator num1 = NumberComparator.inputNumber(in);
        NumberComparator num2 = NumberComparator.inputNumber(in);
        int resultNum = num1.compare(num2);
        System.out.println("Результат сравнения чисел: " + resultNum);
	
	//2.4: Заполнение списка числами от 1 до 100 через.
	//Заполнение списка (Класс ListFiller.java и интерфейс ValueGenerator.java)
        System.out.println("2.4");
        List<Integer> integerList = new ArrayList<>();
        ListFiller.fillList(integerList, index -> index);
        System.out.println("Список: " + integerList);

	//3.1: Преобразование списка (Класс ListTransformer.java и интерфейс Function.java)
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

	//3.2: Фильтрация списка (Класс ListFilter.java и интерфейс Predicate.java)
        System.out.println("3.2");
        // 1. Фильтрация строк по длине
        /*List<String>*/ strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<String> filteredStrings = ListFilter.filterList(strings, str -> str.length() >= 3);
        System.out.println("Строки с длиной >= 3: " + filteredStrings);

        // 2. Фильтрация чисел
        /*List<Integer>*/ numbers = Arrays.asList(1, -3, 7, 0, -5);
        List<Integer> filteredNumbers = ListFilter.filterList(numbers, x -> x <= 0);
        System.out.println("Отрицательные числа: " + filteredNumbers);

        // 3. Фильтрация массивов целых чисел
        /*List<int[]>*/ arrays = new ArrayList<>();
        arrays.add(new int[]{1, 5, 2});
        arrays.add(new int[]{-3, -10, -2});
        arrays.add(new int[]{-1, 0, -5});
        arrays.add(new int[]{1, -2, 3});

        List<int[]> filteredArrays = ListFilter.filterList(arrays, arr ->
        {
            if(arr == null || arr.length == 0)
            {
                return false;
            }
            for (int num : arr)
            {
                if (num > 0)
                {
                    return false; // Если хотя бы один элемент положительный, то массив не проходит
                }
            }
            return true; // Если все элементы не положительные, то массив проходит
        });

        System.out.print("Массивы без положительных элементов: [");
        for(int i=0;i<filteredArrays.size();i++)
        {
            System.out.print(Arrays.toString(filteredArrays.get(i)));
            if(i!=filteredArrays.size() - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

	//3.3. Свёртка списка (Класс ListReducer.java и интерфейс ReducerWithInitial.java)
        System.out.println("3.3");
        // 1. Соединение строк
        /*List<String>*/ strings = Arrays.asList("qwerty", "asdfg", "zx");
        String combinedString = ListReducer.reduceList(strings, (a, b) -> a + b, "");
        System.out.println("Соединенные строки: " + combinedString);

        // 2. Сумма чисел
        /*List<Integer>*/ numbers = Arrays.asList(1, -3, 7);
        int sum = ListReducer.reduceList(numbers, Integer::sum, 0);
        System.out.println("Сумма чисел: " + sum);

        // 3. Общее количество элементов в списках
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 2, 3));
        listOfLists.add(Arrays.asList(4, 5));
        listOfLists.add(Arrays.asList(6, 7, 8, 9));

        int totalSize = ListReducer.reduceList(listOfLists,(a,b) -> a + b.size(), 0);
        System.out.println("Общее количество элементов: " + totalSize);

	//Коллекционирование (Класс ListCollector.java и интерфейсы Supplier, BiConsumer)
        System.out.println("3.4");
        // 1. Разделение чисел на положительные и отрицательные подсписки
        /*List<Integer>*/ numbers = Arrays.asList(1, -3, 7, -5, 0, 2, -8);
        List<List<Integer>> partitionedNumbers = ListCollector.collect(numbers,
                ArrayList::new,
                (lists, num) -> {
                    if (lists.isEmpty()) {
                        lists.add(new ArrayList<>());
                        lists.add(new ArrayList<>());
                    }
                    if (num > 0) {
                        lists.get(0).add(num);
                    } else if (num < 0) {
                        lists.get(1).add(num);
                    }
                }
        );
        System.out.println("Разделенные числа: " + partitionedNumbers);

        // 2. Разделение строк по длине
        /*List<String>*/ strings = Arrays.asList("qwerty", "asdfg", "zx", "qw", "abc");
        List<List<String>> groupedStrings = ListCollector.collect(strings,
                ArrayList::new,
                (lists, str) -> {
                    boolean added = false;
                    for (List<String> list : lists) {
                        if (!list.isEmpty() && list.get(0).length() == str.length()) {
                            list.add(str);
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        List<String> newGroup = new ArrayList<>();
                        newGroup.add(str);
                        lists.add(newGroup);
                    }
                }
        );
        System.out.println("Сгруппированные строки по длине: " + groupedStrings);

        // 3. Коллекционирование в Set (уникальные значения)
        List<String> stringsUnique = Arrays.asList("qwerty", "asdfg", "qwerty", "qw", "asdfg");
        Set<String> uniqueStrings = ListCollector.collect(stringsUnique,
                HashSet::new,
                Set::add
        );
        System.out.println("Уникальные строки: " + uniqueStrings);
    }
}
