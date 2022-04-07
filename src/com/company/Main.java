package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean tr = true;
        while (tr) {
            Scanner inName = new Scanner(System.in);
            System.out.println("Введите Ваше имя: ");
            String name = inName.nextLine();

            Scanner inAge = new Scanner(System.in);
            System.out.println("Введите возраст: ");
            int age = inAge.nextInt();
        }
    }
}
