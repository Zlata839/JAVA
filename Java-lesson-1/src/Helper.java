package help;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Helper {
    // 1,2, 4, 76, 89, 5, -100
    public static String main(String[] args) {
        String[] arr = str.split(" ");
        // sprint разбивает строчку и указаываем как, например пробелом " "
        // [Добро, подаловать, на, курс, по, Java]
        StringBuilder sb = new StringBuilder ();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
        // sb.append(str);
        sb.reverse ();

        // for (int i = arr.length; i >= 0 i--) {
        //     sb.append(arr[i]).append (" ");
        // }
        return sb.toString();
    }

    private static int getSumElemsArray(int[] arr) {
        int sum = 0;
        // for (int j: arr) {
        //     sum += j;
        // }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int getSumElemsFromArray(int[] [] arr) {
        int sum = 0;

        //    for (int i = 0; i < arr.length; i++) {
        //         for (int j = 0; j < arr[i].length, j++) {
        //             sum += arr[i][j];

        //    }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }

            return sum;
        }
        public static LocalDateTime getCurrentDateTime() {
            return LocalDateTime.now();
        }

        public static void getUserDataFromConsole() {
            System.out.println("Введите даные: ");
            Scanner sc = new Scanner(System.in); // экземпляр класса Scanner
            // который вызывает спец.класс для ввода данных в системную консоль
            String userData = sc.nextLine();
            System.out.printf("%s: %s%n", "Вы ввели", userData);
        }
    }

