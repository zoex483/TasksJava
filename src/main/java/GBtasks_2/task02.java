/*
 * Задача 2
 * Дана последовательность из N целых чисел. 
 * Верно ли, что последовательность является возрастающей.
 */

package GBtasks_2;

import java.util.Random;

public class task02 {

    public static void main(String[] args) {
        System.out.println("\nthe sequence is increasing: " + checkWether());
    }


    public static String checkWether() {
        int count = generateRandomInt(2, 4);
        int current = -1;
        int previous = generateRandomInt(1, 15);
        System.out.print(previous + " ");
        boolean isIncrease = true;
        while (count > 1) {

            current = generateRandomInt(1, 15);
            if (current < previous && isIncrease) {
                isIncrease = false;
            }
            previous = current;
            System.out.print(previous + " ");
            count--;
        }
        return (isIncrease ? "yes" : "no");
    }

    private static int generateRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}


