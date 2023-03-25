package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        Filter filter = new Filter();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений ");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        System.out.print("Вот случайный список: ");
        List<Integer> list = filter.randomList(n, m);
        printList(list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра ");
        int f = scanner.nextInt();
        filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        filter.filterOut(list);
        logger.log("Завершаем программу");


    }

    public static void printList(List<Integer> list) {
        System.out.println(Arrays.toString(list.toArray()).replaceAll("\\[|\\]|,", ""));
    }
}