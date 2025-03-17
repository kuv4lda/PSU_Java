//Реализация очереди на основе связанного списка 

import java.util.*;

public class MyQueue<T>
{
    private LinkedList<T> queue; // Приватное поле для хранения элементов очереди в виде связного списка

    public MyQueue()
    {
        queue = new LinkedList<>(); // LinkedList для хранения элементов очереди
    }

    public void enqueue(T element)
    {
        queue.addLast(element); // Добавление элемента в конец списка (очереди)
    }

    public T dequeue()
    {
        if (isEmpty())
        { // Проверяем, не пуста ли очередь
            throw new NoSuchElementException("Очередь пуста"); // Если пуста, выбрасываем исключение
        }
        return queue.removeFirst(); // Удаление и возвращение первого элемента из списка
    }

    public T peek()
    {
        if (isEmpty())
        { // Проверяем, не пуста ли очередь
            throw new NoSuchElementException("Очередь пуста"); // Если пуста, выбрасываем исключение
        }
        return queue.getFirst(); // Возвращение первого элемента из списка
    }

    public boolean isEmpty()
    {
        return queue.isEmpty(); // Проверка, пуст ли LinkedList
    }

    public int size()
    {
        return queue.size(); // Возвращение количества элементов в очереди
    }

    @Override
    public String toString()
    {
        return queue.toString();
    }
}



