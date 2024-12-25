import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PersonParser
{
    public static List<Person> parsePeopleFromFile(String filePath) throws IOException
    {
        List<Person> people = new ArrayList<>();
        Pattern pattern = Pattern.compile("([^:]+)(?::(\\d+))?");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find())
                {
                    String name = matcher.group(1).trim();
                    String numberStr = matcher.group(2);
                    Integer number = null;
                    if (numberStr != null)
                    {
                        number = Integer.parseInt(numberStr);
                    }
                    people.add(new Person(name, number));
                }
            }
        }
        return people;
    }
}
