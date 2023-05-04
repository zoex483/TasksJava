/*
 * Задача 1
 * Дана последовательность N целых чисел. Найти сумму простых чисел
 */
package GBtasks_2;

import java.util.Scanner;

public class task01 {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("the sum of prime numbers: " + getSum());
        sc.close();
    }

    public static int getSum() {
        int sum = 0;
        int number = -1;
        while ((number = getNextInput()) > 1) {
            if (isPrime(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static int getNextInput() {
        System.out.print("Enter a new number: ");
        return sc.nextInt();
    }

    public static boolean isPrime(int number) {
        for (int divider = 2; divider <= (int) Math.sqrt(number); divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}

