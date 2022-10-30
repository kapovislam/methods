import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static int countDayDelivery(double deliveryDistance) {
        int deliveryDay = (int) Math.ceil((deliveryDistance + 21) / 40);
        return deliveryDay;
    }

    private static void printRecommendedVersion(int osClient, int yearClintDevice) {
        int currentYear = LocalDate.now().getYear();
        if (yearClintDevice > currentYear) {
            System.out.println("Этот год еще не наступил");
            return;
        }
        if (osClient == 0) {
            System.out.print("Установите ");
            if (yearClintDevice < currentYear) {
                System.out.print("Lite ");
            }
            System.out.print("версию для iOS");
        } else if (osClient == 1) {
            System.out.print("Установите ");
            if (yearClintDevice < currentYear) {
                System.out.print("Lite ");
            }
            System.out.print("версию для Android");
        } else {
            System.out.println("Такого устройства не существует");
        }
    }

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year != 100 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не високосный");
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        //Задание 3
        /**
         * Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию
         * и возвращает итоговое количество дней доставки.
         */
        int distance = 140;
        int day = countDayDelivery(distance);
        System.out.print("Потребуется дней: " + day);

    }

    private static void task2() {
        //Задание 2
        /**
         * Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android
         * и год выпуска устройства.
         * Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
         */
        int deviceYear = 2021;
        int clientOs = 1;
        printRecommendedVersion(clientOs, deviceYear);
    }

    private static void task1() {
        //Задание 1
        /**
         * Реализуйте метод, который получает в качестве параметра год, а затем проверяет,
         * является ли он високосным, и выводит результат в консоль.
         */
        int year = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год ");
        year = Integer.parseInt(in.nextLine());
        printLeapYear(year);
    }

}