package org.example;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String inputText = scanner.nextLine().toLowerCase();

            HashSet<Character> lettersSet = new HashSet<>();
            for (char c: inputText.toCharArray()) {
                if(alphabet.indexOf(c) != -1) {
                    lettersSet.add(c);
                }
            }

            if (lettersSet.size() == alphabet.length()) {
                System.out.println("Текст содержит все буквы русского алфавита");

            } else {
                System.out.println("Текст не содержит все буквы русского алфавита");
            }
        }
    }
