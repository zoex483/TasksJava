package Common;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * первый и второй члены последовательности равны единицам
 * а каждый следующий — сумме двух предыдущих
 * То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
 */

public class fibonacci {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <=11; i++) {
            n2 = n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
