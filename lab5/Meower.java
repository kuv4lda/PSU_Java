import java.util.List;

public class Meower
{ // Мяу всех котов, кто передан в списке
    public static void makeAllMeow(List<? extends Meowable> meowables)
    {
        for (Meowable meowable : meowables)
        {
            meowable.meow();
        }
    }
}
