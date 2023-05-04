package Common;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * первый и второй члены последовательности равны единицам
 * а каждый следующий — сумме двух предыдущих
 * То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
 */

public class fibonacci {
    public static void main(String[] args) {
        int n0 = 1; // В первые 2 переменные присваиваем число 1, потому что первый и второй член Фибоначчи равны 1.
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" "); //Далее выводим с помощью system.out.print() первые 2 числа последовательности Фибоначчи. Обратите внимание, что мы использовали System.out.print(), а не System.out.println() для того, чтоб первые числа последовательности 1  1 стали в ряд горизонтально.
        for(int i = 3; i <=11; i++) {
            n2 = n0+n1;
            System.out.print(n2+" "); //И далее с помощью цикла for суммируем 2 предыдущих числа последовательности, чтоб получить новое число последовательности. А также цикл ограничиванием условием i<=11, поскольку согласно условия задачи нам необходимо вывести первые 11 чисел последовательности Фибоначчи.
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
