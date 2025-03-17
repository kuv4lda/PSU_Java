//Проверяет, что текст не null и не пуст

public class InputValidator
{
    public static void validateText(String text)
    {
        if (text == null || text.trim().isEmpty())
        {
            throw new IllegalArgumentException("Текст не может быть null или пустым.");
        }
    }
}
