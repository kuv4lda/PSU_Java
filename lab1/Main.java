import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        Main m = new Main();
        out.println("Tasks catalog:");
        out.println("Task №1.2.(№1): Сумма знаков.");
        out.println("Task №1.4.(№2): Есть ли позитив.");
        out.println("Task №1.6.(№3): Большая буква.");
        out.println("Task №1.8.(№4): Делитель.");
        out.println("Task №1.10.(№5): Многократный вызов.");
        out.println("Task №2.2.(№6): Безопасное деление.");
        out.println("Task №2.4.(№7): Строка сравнения.");
        out.println("Task №2.6.(№8): Тройная сумма.");
        out.println("Task №2.8.(№9): Возраст.");
        out.println("Task №2.10.(№10): Вывод дней недели.");
        out.println("Task №3.2.(№11): Числа наоборот.");
        out.println("Task №3.4.(№12): Степень числа.");
        out.println("Task №3.6.(№13): Одинаковость.");
        out.println("Task №3.8.(№14): Левый треугольник.");
        out.println("Task №3.10.(№15): Угадайка");
        out.println("Task №4.2.(№16): Поиск последнего значения.");
        out.println("Task №4.4.(№17): Добавление в массив.");
        out.println("Task №4.6.(№18): Реверс.");
        out.println("Task №4.8.(№19): Объединение.");
        out.println("Task №5.0.(№20): Удалить негатив.");
        out.println("Введите номер задачи (тот, что в скобочках): ");
        int num = in.nextInt();
        int x, y, z, a, b, pos;
        int[] Arr, Arr1, Arr2;
        String str;
        char ch;
        switch(num)
        {
            case(1):
                out.println("Task №1:");
                out.println("Дана сигнатура метода: public int sumLastNums (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числах, предполагая, что знаков в числе не менее двух");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.sumLastNums(x));
                break;
            case(2):
                out.println("Task №2:");
                out.println("Дана сигнатура метода: public bool isPositive (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true, если оно положительное");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.isPositive(x));
                break;
            case(3):
                out.println("Task №3:");
                out.println("Дана сигнатура метода: public bool isUpperCase (char x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.");
                out.print("Введите символ: ");
                in.nextLine();
                str = in.nextLine();
                ch = str.charAt(0);
                out.println("Результат: " + m.isUpperCase(ch));
                break;
            case(4):
                out.println("Task №4:");
                out.println("Дана сигнатура метода: public bool isDivisor (int a, int b);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал true, если любое из принятых чисел делит другое нацело.");
                out.print("Введите a и b: ");
                a = in.nextInt();
                b = in.nextInt();
                out.println("Результат: " + m.isDivisor(a, b));
                break;
            case(5):
                out.println("Task №5:");
                out.println("Дана сигнатура метода: public int lastNumSum(int a, int b)");
                out.println("Необходимо реализовать метод таким образом, чтобы он считал сумму цифр двух чисел из разряда единиц. Выполните с его помощью последовательное сложение пяти чисел и результат выведите на экран.");
                out.print("Введите 5 чисел: ");
                Arr = new int[5];
                for(int i = 0; i < 5; i++)
                {
                    Arr[i] = in.nextInt();
                }
                out.println("Результат: " + m.lastNumSum(m.lastNumSum(m.lastNumSum(m.lastNumSum(Arr[0], Arr[1]), Arr[2]), Arr[3]), Arr[4]));
                break;
            case(6):
                out.println("Task №6:");
                out.println("Дана сигнатура метода: public double safeDiv (int x, int y);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При делении на 0 следует вернуть из метода число 0.");
                out.print("Введите x и y: ");
                x = in.nextInt();
                y = in.nextInt();
                out.println("Результат: " + m.safeDiv(x, y));
                break;
            case(7):
                out.println("Task №7:");
                out.println("Дана сигнатура метода: public String makeDecision (int x, int y);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения.");
                out.print("Введите x и y: ");
                x = in.nextInt();
                y = in.nextInt();
                out.println("Результат: " + m.makeDecision(x, y));
                break;
            case(8):
                out.println("Task №8:");
                out.println("Дана сигнатура метода: public bool sum3 (int x, int y, int z);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трех принятых) можно сложить так, чтобы получить третье. ");
                out.print("Введите x, y и z: ");
                x = in.nextInt();
                y = in.nextInt();
                z = in.nextInt();
                out.println("Результат: " + m.sum3(x, y, z));
                break;
            case(9):
                out.println("Task №9:");
                out.println("Дана сигнатура метода: public String age (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х, а затем одно из слов: год, года, лет");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.age(x));
                break;
            case(10):
                out.println("Task №10:");
                out.println("Дана сигнатура метода: public void printDays (String x);");
                out.println("В качестве параметра метод принимает строку, в которой записано название дня недели. Необходимо реализовать метод таким образом, чтобы он выводил на экран название переданного в него дня и всех последующих до конца недели дней.");
                out.print("Введите день недели: ");
                in.nextLine();
                str = in.nextLine();
                out.println("Результат: ");
                m.printDays(str);
                break;
            case(11):
                out.println("Task №11:");
                out.println("Дана сигнатура метода: public String reverseListNums (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно).");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.reverseListNums(x));
                break;
            case(12):
                out.println("Task №12:");
                out.println("Дана сигнатура метода: public int pow (int x, int y);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.");
                out.print("Введите x и y: ");
                x = in.nextInt();
                y = in.nextInt();
                out.println("Результат: " + m.pow(x, y));
                break;
            case(13):
                out.println("Task №13:");
                out.println("Дана сигнатура метода: public bool equalNum (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.equalNum(x));
                break;
            case(14):
                out.println("Task №14:");
                out.println("Дана сигнатура метода: public void leftTriangle (int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у которого х символов в высоту, а количество символов в ряду совпадает с номером строки.");
                out.print("Введите x: ");
                x = in.nextInt();
                out.println("Результат: ");
                m.leftTriangle(x);
                break;
            case(15):
                out.println("Task №15:");
                out.println("Дана сигнатура метода: public void guessGame()");
                out.println("Необходимо реализовать метод таким образом, чтобы он генерировал случайное число от 0 до 9, далее считывал с консоли введенное пользователем число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод запускается до тех пор, пока пользователь не угадает число. После этого выведите на экран количество попыток, которое потребовалось пользователю, чтобы угадать число.");
                out.println("Угадайте число: ");
                m.guessGame();
                break;
            case(16):
                out.println("Task №16:");
                out.println("Дана сигнатура метода: public int findLast (int[] arr, int x);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал индекс последнего вхождения числа x в массив arr. Если число не входит в массив – возвращается -1.");
                Arr = new int[10];
                out.print("Начальный массив: ");
                for(int i = 0; i < Arr.length; i++)
                {
                    Arr[i] = r.nextInt(9 - (-9) + 1) - 9;
                    out.print(Arr[i] + " ");
                }
                out.print("\nВведите x: ");
                x = in.nextInt();
                out.println("Результат: " + m.findLast(Arr, x));
                break;
            case(17):
                out.println("Task №17:");
                out.println("Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr, однако в позицию pos будет вставлено значение x.");
                Arr = new int[10];
                for(int i = 0; i < Arr.length; i++)
                {
                    Arr[i] = r.nextInt(9 - (-9) + 1) - 9;
                    out.print(Arr[i] + " ");
                }
                out.print("\nВведите x: ");
                x = in.nextInt();
                out.print("Введите позицию: ");
                pos = in.nextInt();
                out.println("Результат: " + m.toString_Array(m.add(Arr, x, pos)));
                break;
            case(18):
                out.println("Task №18:");
                out.println("Дана сигнатура метода: public void reverse (int[] arr);");
                out.println("Необходимо реализовать метод таким образом, чтобы он изменял массив arr. После проведенных изменений массив должен быть записан задом-наперед.");
                Arr = new int[10];
                out.print("Начальный массив: ");
                for(int i = 0; i < Arr.length; i++)
                {
                    Arr[i] = r.nextInt(9 - (-9) + 1) - 9;
                    out.print(Arr[i] + " ");
                }
                out.print("\nРезультат: ");
                m.reverse(Arr);
                break;
            case(19):
                out.println("Task №19:");
                out.println("Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).");
                Arr1 = new int[5];
                Arr2 = new int[5];
                out.print("Начальный массив №1: ");
                for(int i = 0; i<Arr1.length; i++)
                {
                    Arr1[i] = r.nextInt(9);
                    out.print(Arr1[i] + " ");
                }
                out.print("\nНачальный массив №2: ");
                for(int i = 0; i<Arr2.length; i++)
                {
                    Arr2[i] = r.nextInt(9);
                    out.print(Arr2[i] + " ");
                }
                out.println("\nРезультат: " + m.toString_Array(m.concat(Arr1, Arr2)));
                break;
            case(20):
                out.println("Task №20:");
                out.println("Дана сигнатура метода: public int[] deleteNegative (int[] arr);");
                out.println("Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных. ");
                Arr = new int[10];
                out.print("Начальный массив: ");
                for(int i = 0; i < Arr.length; i++)
                {
                    Arr[i] = r.nextInt(9 - (-9) + 1) - 9;
                    out.print(Arr[i] + " ");
                }
                out.println("\nРезультат: " + m.toString_Array(m.deleteNegative(Arr)));
                break;
            default:
                out.println("Такой задачи нет");
        }
    }
    public String toString_Array(int[] Arr)
    {
        String t = "";
        for(int i = 0; i < Arr.length; i++)
        {
            t = t + Arr[i] + " ";
        }
        return t;
    }
    public int sumLastNums(int x)
    {
        return x % 10 + (x / 10) % 10;
    }
    public boolean isPositive(int x)
    {
        if(x > 0)
            return true;
        else
            return false;
    }
    public boolean isUpperCase(char y)
    {
        return y >= 'A' && y <= 'Z';
    }
    public boolean isDivisor(int a, int b)
    {
        if(a % b == 0 || b % a == 0)
            return true;
        else
            return false;
    }
    public int lastNumSum(int a, int b)
    {
        int t = a % 10 + b % 10;
        out.println(a + " + " + b + " = " + t);
        return t;
    }
    public double safeDiv(int a, int b)
    {
        if(b == 0)
            return 0;
        else
        {
            double ta = a, tb = b;
            return ta / tb;
        }
    }
    public String makeDecision(int a, int b)
    {
        if(a > b)
            return a + " > " + b;
        if(a == b)
            return a + " = " + b;
        if(a < b)
            return a + " < " + b;
        return "";
    }
    public boolean sum3(int x, int a, int b)
    {
        if(x + a == b || b + x == a || a + b == x)
            return true;
        else
            return false;
    }
    public String age(int x)
    {
        int tx = x % 10;
        if(x >= 10 && x <= 14)
            return x + " лет";
        switch(tx)
        {
            case(0):
            case(5):
            case(6):
            case(7):
            case(8):
            case(9):
                return x + " лет";
            case(1):
                return x + " год";
            case(2):
            case(3):
            case(4):
                return x + " года";
            default:
                return "Error";
        }
    }
    public void printDays(String day)
    {
        switch(day)
        {
            case("Понедельник"):
            case("понедельник"):
                out.println("Понедельник");
            case("Вторник"):
            case("вторник"):
                out.println("Вторник");
            case("Среда"):
            case("среда"):
                out.println("Среда");
            case("Четверг"):
            case("четверг"):
                out.println("Четверг");
            case("Пятница"):
            case("пятница"):
                out.println("Пятница");
            case("Суббота"):
            case("суббота"):
                out.println("Суббота");
            case("Воскресенье"):
            case("воскресенье"):
                out.println("Воскресенье");
                break;
            default:
                out.println("Это не день недели");
        }
    }
    public String reverseListNums(int x)
    {
        String s = "";
        for(int i = x; i >= 0; i--)
        {
            s = s + i + " ";
        }
        return s;
    }
    public int pow(int a, int b)
    {
        int t = 1;
        for(int i = 0; i < b; i++)
        {
            t = t * a;
        }
        return t;
    }
    public boolean equalNum(int x)
    {
        boolean flag = true;
        int t = x % 10;
        x = x / 10;
        while(x > 0)
        {
            if(t == x % 10)
            {
                t = x % 10;
                x = x / 10;
            }
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public void leftTriangle(int x)
    {
        for(int i = 1; i <= x; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                out.print("*");
            }
            out.println("");
        }
    }
    public void guessGame()
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(9), i = 0, t=-1;
        while(t!=x)
        {
            i++;
            t = in.nextInt();
            if(t == x)
                break;
            out.println("Вы не угадали!");
        }
        out.println("Вы отгадали! Количество попыток: " + i);
    }
    public int findLast(int[] Arr, int c)
    {
        int t = -1;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == c)
                t = i;
        }
        return t;
    }
    public int[] add (int[] Arr, int x, int pos)
    {
        int[] Arr1 = new int[Arr.length+1];
        for(int i = 0; i < pos; i++)
        {
            Arr1[i] = Arr[i];
        }
        Arr1[pos] = x;
        for(int i = pos+1; i < Arr1.length; i++)
        {
            Arr1[i] = Arr[i-1];
        }
        return Arr1;
    }
    public void reverse(int[] Arr)
    {
        int t;
        for(int i = 0; i < Arr.length / 2; i++)
        {
            t = Arr[i];
            Arr[i] = Arr[Arr.length-i-1];
            Arr[Arr.length-i-1] = t;
        }
        for(int i=0; i<Arr.length; i++)
        {
            out.print(Arr[i] + " ");
        }
        out.println("");
    }
    public int[] concat(int[] Arr1, int[] Arr2)
    {
        int[] Arr = new int [Arr1.length + Arr2.length];
        for(int i = 0; i < Arr1.length; i++)
        {
            Arr[i] = Arr1[i];
        }
        for(int i = Arr1.length; i < Arr.length; i++)
        {
            Arr[i] = Arr2[i-Arr1.length];
        }
        return Arr;
    }
    public int[] deleteNegative(int[] Arr)
    {
        int t = 0, j = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0)
                t++;
        }
        int[] Arr1 = new int[Arr.length-t];
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 0)
            {
                Arr1[j] = Arr[i];
                j++;
            }
        }
        return Arr1;
    }
}
