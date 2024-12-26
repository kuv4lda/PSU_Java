import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TextProcessor
{
    private String text;

    public TextProcessor(String text)
    {
        InputValidator.validateText(text);
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        InputValidator.validateText(text);
        this.text = text;
    }

    public Set<Character> getEvenWordSymbols()
    {
        Set<Character> symbols = new HashSet<>();
        String[] words = text.split("\\s+");
        for(int i=1; i < words.length; i+=2){
            for (char c : words[i].toCharArray())
            {
                symbols.add(c);
            }
        }
        return symbols;
    }

    @Override
    public String toString()
    {
        return "TextProcessor{" +
                "text='" + text + '\'' +
                '}';
    }
}
