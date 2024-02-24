package ru.stepup.AccessLogParser;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
                int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
                int secondNumber = new Scanner(System.in).nextInt();
        System.out.println("Сумма: ");
        System.out.println(firstNumber+secondNumber);
        System.out.println("Разность: ");
        System.out.println(firstNumber-secondNumber);
        System.out.println("Произведение : ");
        System.out.println(firstNumber*secondNumber);
        System.out.println("Частное : ");
        System.out.println((double)firstNumber/secondNumber);
    }
}