package com.teachmeskills.lesson12.hw.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Output to the console from the line that the user enters from the keyboard everything
 * abbreviations. An abbreviation is a word of 2 to 6 characters, consisting
 * only capital letters, no numbers
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,6}");
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            System.out.println("yes");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }else System.out.println("no");


    }
}
