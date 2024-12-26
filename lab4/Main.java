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
        
        // Пример использования с Integer
        List<Integer> integerList = new ArrayList<>();
        ListFiller.fillList(integerList);
        System.out.println("Integer list: " + integerList);

    }
}
