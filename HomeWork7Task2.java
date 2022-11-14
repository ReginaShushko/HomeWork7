package homeWork7;

import java.util.Scanner;

public class HomeWork7Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");

        String text = scanner.nextLine();
        System.out.println("Entered string: " + text);

        System.out.println(text.replaceAll("\\s+", " "));
    }
}
