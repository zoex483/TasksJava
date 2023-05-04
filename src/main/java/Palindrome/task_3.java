package Palindrome;

// решение задачи суммы с 1 до n используя рекурсию
// метод вызывает сам себя
// если не правильно написать алгоритм, стек может переполниться

public class task_3 { // 1 to n
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int n) {
        if( n == 1 ) return 1; // base step
        return n + sum ( n - 1);
        // recursive step 10 + sum(9) = (9) + sum(8) + sum(7).....


    }
}
