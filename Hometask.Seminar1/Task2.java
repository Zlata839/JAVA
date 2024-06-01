//Вывести простые числа
//
//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
//
//Напишите свой код в методе printPrimeNums класса Answer.
//
//Пример
//
//2
//3
//5
//7
//11
//...

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i <= 1000; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                int diff = i % j;
                if (diff == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                System.out.println(i);
                isPrime = false;
            }
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}