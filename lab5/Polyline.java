import java.util.*;
import java.util.stream.Collectors;

class Polyline
{
    private List<Point> points;

    //Конструктор, который обрабатывает входной список точек
    public Polyline(List<Point> points)
    {
        if (points == null || points.isEmpty(){
            throw new IllegalArgumentException("List of points cannot be null or empty.");
        }
        this.points = points.stream()
                .distinct() // Убираем дубликаты
                .sorted(Comparator.comparingInt(Point::getX)) // Сортируем по X
                .map(p -> new Point(p.getX(), Math.abs(p.getY()))) // Делаем Y положительными
                .collect(Collectors.toList());
    }

    public List<Point> getPoints()
    {
        return points;
    }

    @Override
    public String toString()
    {
        return "Линия [" + points.stream()
                .map(Point::toString)
                .collect(Collectors.joining(",")) + "]";
    }
}
