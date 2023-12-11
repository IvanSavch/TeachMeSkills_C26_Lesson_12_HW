package com.teachmeskills.lesson12.hw.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *The program receives arbitrary text as input. This text may contain a number
 * document (one or more), email and phone number. Document number in format:
 * xxxx-xxxx-xx, where x is any number; phone number in the format: +(xx)xxxxxxx. Document
 * may not contain all the information, i.e. for example, may not contain a number
 * phone, or something else.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.nextLine();
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                Pattern pattern = Pattern.compile("[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*");
                Matcher email = pattern.matcher(doc);
                if (email.find()) {
                    System.out.println("email:" + email.group());
                } else System.out.println("no");
                break;
            case 2:
                Pattern pattern1 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
                Matcher docNumber = pattern1.matcher(doc);
                if (docNumber.find()) {
                    System.out.println(docNumber.group());
                } else System.out.println("not found");
                break;
            case 3:
                String patterns
                        = "(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}"
                        + "|(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}"
                        + "|(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}";

                Pattern pattern2 = Pattern.compile(patterns);
                Matcher phoneNumber = pattern2.matcher(doc);
                if (phoneNumber.find()) {
                    System.out.println(phoneNumber.group());
                } else System.out.println("not found");
                break;
        }
    }
}
