package Interview;

//cоздание бесконечного цикла на пустом месте

public class EndlessCycle {
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
            // бесконечный цикл
            System.out.println(i); // бесконечность цикла
        }
    }
}
