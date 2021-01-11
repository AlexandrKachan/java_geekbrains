package ru.geekbrains.leson_3.guess_the_namber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System. in);
        System.out.println("Ваша задача угадать число.");
        int range = 50;
        int namber = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == namber){
                System.out.println("Вы у гадали");
                break;
            } else if (input_number > namber){
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}
