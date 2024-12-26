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

    }
}
