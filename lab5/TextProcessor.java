//Обработка текста для извлечения символов из чётных слов

import java.util.Set;
import java.util.TreeSet;

public class TextProcessor {
    private String text;

    public TextProcessor(String text) {
        InputValidator.validateText(text);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        InputValidator.validateText(text);
        this.text = text;
    }

//Возвращает уникальные символы из слов с чётными индексами
    public Set<Character> getEvenWordSymbols() {
        Set<Character> symbols = new TreeSet<>();
        String[] words = text.split("\\s+");
        for (int i = 1; i < words.length; i += 2) {
            for (char c : words[i].toCharArray()) {
                symbols.add(c);
            }
        }
        return symbols;
    }

    @Override
    public String toString() {
        return "TextProcessor{" +
                "text='" + text + '\'' +
                '}';
    }
}
