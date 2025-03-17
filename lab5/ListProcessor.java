// ОБрабатывает список целых чисел, удаляя дубликаты, идущие подряд

import java.util.ArrayList;
import java.util.List;

public class ListProcessor
{
    private List<Integer> list;

    // Конструкторы
    public ListProcessor()
    {
        this.list = new ArrayList<>();
    }

    public ListProcessor(List<Integer> list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("Список не может быть null");
        }
        this.list = new ArrayList<>(list); // Создаем копию, чтобы не изменять исходный список
    }
    // Возвращаем копию, чтобы не нарушить инкапсуляцию
    public List<Integer> getList()
    {
      return new ArrayList<>(list);
    }

    // Метод для добавления элемента
    public void add(Integer element)
    {
        this.list.add(element);
    }

    // Метод для обработки списка: удаление дубликатов
    public void removeConsecutiveDuplicates()
    {
        if (list.isEmpty())
        {
            return; // Ничего не делаем, если список пуст
        }
        List<Integer> result = new ArrayList<>();
        Integer previous = null;
        for (Integer element : list)
        {
            if (previous == null)
            {
                if (element != null)
                {
                   result.add(element);
                   previous = element;
                }
            }
            else
                if (element == null)
                {
                    result.add(element);
                    previous = element;
                }
                else
                    if (!element.equals(previous))
                    {
                        result.add(element);
                        previous = element;
                    }
        }
        this.list = result;
    }


    @Override
    public String toString()
    {
        return "ListProcessor{" + "list=" + list + '}';
    }
}
