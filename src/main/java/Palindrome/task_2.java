package Palindrome;

// Как узнать является ли строка палиндромом с использованием Java?

/**     StringBuffer предоставляет метод с именем reverse(), один из способов проверки палиндрома.
      - Создайте объект StringBuffer, передав необходимую строку в качестве параметра конструктору.
      - Обратное содержимое объекта с помощью метода reverse().
      - Преобразуйте объект StringBuffer в Sting с помощью метода toString().
      - Теперь сравните String и перевернутую, если true, данная строка является палиндромом.
        */

public class task_2 {
    public static void main(String[] args) {

        String myString = "халалах" ; // "ABCBA" "шабаш" "халалах" "Муза, ранясь шилом опыта, ты помолишься на разум" "94849"
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)) {
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
    }
}

