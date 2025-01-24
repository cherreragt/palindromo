package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra para ver si es palindromo");
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder(word);

        String reverseWord = String.valueOf(sb.reverse());

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println("Palabra palindromo: ". concat(reverseWord));
        } else {
            System.out.println("no es palindromo: ".concat(reverseWord));
        }
    }
}