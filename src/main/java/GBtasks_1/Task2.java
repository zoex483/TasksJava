package GBtasks_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b, sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности:");
        n = scanner.nextInt();
        System.out.println("Введите " + n + " целых чисел оканчивающаяся нулем");
        a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if ((a > 0) && (b < 0)) {
                sum += a;
            }
            a = b;
        }
        System.out.println("сумму положительных чисел, \n" +
                "после которых следует отрицательное число " + sum);
        scanner.close();

    }
}
