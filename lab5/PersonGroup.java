//Группировка людей из файла по номерам

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class PersonGroup
{
    public static Map<Integer, List<String>> groupPeopleByNumber(String filePath) throws IOException
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            return reader.lines()
                    .map(line -> {
                        String[] parts = line.split(":");
                        if (parts.length == 2)
                        {
                            try
                            {
                                String name = parts[0].trim();
                                int number = Integer.parseInt(parts[1].trim());
                                return new Person(name, number);
                            }
                            catch (NumberFormatException e)
                            {
                                return null;
                            }
                        }
                        return null;
                    })
                    .filter(Objects::nonNull)
                    .filter(person -> person.getNumber() != null)
                    .collect(Collectors.groupingBy(
                            Person::getNumber,
                            Collectors.mapping(person -> formatName(person.getName()), Collectors.toList())
                    ));
        }
    }
    private static String formatName(String name)
    {
        if (name == null || name.isEmpty())
        {
            return "";
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
