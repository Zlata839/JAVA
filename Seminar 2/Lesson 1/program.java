import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name ");
        String name = iScanner.nextLine();
        System.out.println("Привет, %s\n", name);
        iScanner.close();
    }
 
}

String str = "dfsdf";
# например для памяти str это уже сслыка к объекту в куче
Допустим мнужно вывести индекс буквы s
System.out.println(str.indexOf('s')); # мы обратили сь к str  и применили метод индекс

