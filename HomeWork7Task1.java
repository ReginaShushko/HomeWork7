package homeWork7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");

        String text = scanner.nextLine();
        System.out.println("Entered string: " + text);

        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String replaced = text.replace("abc", "www");
            System.out.println("String result: " + replaced);
        } else {
            System.out.println("String result: " + text + "ttt");
        }
    }
}
