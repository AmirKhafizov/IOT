package ru.kpfu.utils;

import java.util.Scanner;

/**
 * @author Iskander Valiev
 * created by isko
 * on 4/12/20
 */
public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static int enterNumber(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}
