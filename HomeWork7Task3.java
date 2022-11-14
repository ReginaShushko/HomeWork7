package homeWork7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task3 {
    public static void main(String[] args) {
        String text = "listen to the news from today, read the text at the same time!" +
                "Listen to the news from today - without reading the text.";

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            ++count;
        }
        System.out.println("Number of punctuations marks: " + count);
    }
}
