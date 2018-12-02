package dellwaidr.practice.console;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер: ");
        int number = getNextIntegerNumber(scanner);
        switch (number) {
            case 1:
                System.out.println(task1(1, 2, 4));
                break;
            case 2:
                System.out.println(task2(2, 3));
                break;
            case 3:
                System.out.println(task3(-2));
                break;
            case 4:
                System.out.println(task4(3));
                break;
            case 5:
                System.out.println(task5(-2.34));
                break;
            case 6:
                System.out.println(task6(3.6));
                break;
            case 7:
                System.out.print("Введите первое число: ");
                int a = getNextIntegerNumber(scanner);
                System.out.print("Введите второе число: ");
                int b = getNextIntegerNumber(scanner);
                sumANDmultiplication(a, b);
                break;
        }
    }

    private static int getNextIntegerNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели не целое число. Повторите пожалуйста ввод:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * 1.Вычислите 1/2+1/4. Ответ: 0.75
     */
    public static double task1(double a, double b, double c) {
        double result = (a / b) + (a / c);
        return result;
    }

    /**
     * 2.Вычислите значение выражения (a+4b)(a−3b)+a2 при a=2 и b=3. Ответ:  -94
     */
    public static int task2(int a, int b) {
        int result = (int) ((a + 4 * b) * (a - 3 * b) + Math.pow(a, 2));
        return result;
    }

    /**
     * 3.Вычислите |x|+x5, если x=−2. Ответ: -30
     */
    public static int task3(int x) {
        int result = (int) (Math.abs(x) + Math.pow(x, 5));
        return result;
    }

    /**
     * 4.Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
     */
    public static double task4(double x) {
        double result = Math.pow((x + 1), 2) + 3 * (x + 1);
        return result;
    }

    /**
     * 5.Вычислите значение выражения |x−5|−sinx/3+√x2+2014*cos2x−3 при x=−2.34. Ответ: -1.76911 (проверено!)
     */
    public static double task5(double x) {
        double result = (Math.abs(x - 5) - Math.sin(x)) / 3 + (Math.sqrt(Math.pow(x, 2) + 2014)) * Math.cos(2 * x) - 3;
        return result;
    }

    /**
     * 6.Вычислите значение выражения e(x−2)+|sin(x)|−x4⋅cos1x при x=3.6 Ответ: -156.1276
     */
    public static double task6(double x) {
        double result = Math.pow(Math.E, (x - 2)) + Math.abs(Math.sin(x)) - Math.pow(x, 4) * Math.cos(1 / x);
        return result;
    }

    /**
     * 7.Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
     */
    public static void sumANDmultiplication(int a, int b) {

        System.out.println("Сумма чисел равна " + (a + b));
        System.out.println("Произведение чисел равно " + (a * b));

    }

}
