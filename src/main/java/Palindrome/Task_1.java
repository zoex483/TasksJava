package Palindrome;

/**
 palindrome is a number that reads the same on both sides (1001)
 */
public class Task_1 {
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
