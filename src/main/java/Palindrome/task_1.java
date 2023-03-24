package Palindrome;

/**
 palindrome is a number that reads the same on both sides (1001)
 *
 палиндром — это число, слово или текст, одинаково читающееся в обоих направлениях.
 Например, слова "радар", "топот" или число "12321" будут палиндромами.
 Чтобы проверить, является ли число палиндромом, нужно сравнивать попарно символ с обоих концов слова.
 То есть сравнить первый и последний, потом второй и предпоследний, и так далее, двигаясь к центру слова.
 *
 */

public class task_1 {
    public static void main(String[] args) {
        String s = "94849" ; // "ABCBA" "шабаш" "халалах" "Муза, ранясь шилом опыта, ты помолишься на разум" "94849"
        System.out.println(isPalindrome(s) ? "YES" : "NO");
    }

    private static boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0)
            return true; // base step
        if (s.charAt(0) == s.charAt(s.length()  - 1))
            return isPalindrome(s.substring(1, s.length() - 1)); // recursive step


        return false;

    }
}
