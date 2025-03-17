//Хранение координат точки на плоскости

import java.util.*;

class Point
{
    private int x; // Координата X
    private int y; // Координата Y

    // Конструктор для создания объекта Point
    public Point(int x, int y)
    {
        // Проверка на допустимые значения координат
        if (x < -100 || x > 1000)
        {
            throw new IllegalArgumentException("X coordinate must be between -100 and 1000.");
        }
        if (y < -100 || y > 1000)
        {
            throw new IllegalArgumentException("Y coordinate must be between -100 and 1000.");
        }
        this.x = x;
        this.y = y;
    }

    // Метод для получения координаты X
    public int getX()
    {
        return x;
    }

    // Метод для получения координаты Y
    public int getY()
    {
        return y;
    }

    // Переопределенный метод для строкового представления объекта Point
    @Override
    public String toString()
    {
        return "{" + x + ";" + y + "}";
    }

    // Переопределенный метод для сравнения объектов Point
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    // Переопределенный метод для получения хэш-кода объекта Point
    @Override
    public int hashCode()
    {
        return Objects.hash(x, y);
    }
}
