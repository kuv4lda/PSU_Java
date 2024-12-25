class Line {
    private Point start; // Начальная точка линии
    private Point end;   // Конечная точка линии

    // Конструктор для создания объекта Line
    public Line(Point start, Point end)
    {
        // Проверка на null и равенство начальной и конечной точек
        if (start == null || end == null)
        {
            throw new IllegalArgumentException("Start and end points cannot be null.");
        }
        if (start.equals(end))
        {
            throw new IllegalArgumentException("Start and end points cannot be equal.");
        }
        this.start = start;
        this.end = end;
    }

    // Метод для получения начальной точки линии
    public Point getStart()
    {
        return start;
    }

    // Метод для получения конечной точки линии
    public Point getEnd()
    {
        return end;
    }

    // Переопределенный метод для строкового представления объекта Line
    @Override
    public String toString()
    {
        return "Линия от " + start + " до " + end;
    }
}
