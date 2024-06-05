import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1 {
    static LinkedList <String> list = new LinkedList<>();
    public static void main(String[] args) {
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text:num
// Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
// Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
        while (true)
            printList();
    }
    public static void printList (){
        Scanner scan = new Scanner(System.in); // Scanner это переменная для воода с консоли
        String text = scan.next();
        String[] arr = text.split(":");
        String word = arr[0];
        int num = Integer.parseInt(arr[1]);
        if (num > list.size()) {
            for (int i = 0; i <= num ; i++) {
                list.add(null);
            }
        }
        if (word.equals("print")) {
            System.out.println(list.get(num));
            list.remove(num);
        } else {
            list.add(num, word);
        }
    }

}