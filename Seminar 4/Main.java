import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    static LinkedList <String> list = new LinkedList<>(); //для первой задачи
    static LinkedList<String> list = new LinkedList<>();
    public static void main(String[] args) {
            GBStack<Integer> stack = new GBStack<>();
            stack.push(1);
            stack.push(3);
            stack.push(5);
            stack.push(9);
            System.out.println(stack.pop());
            System.out.println(stack);

            GBStack<String> stackStr = new GBStack<>();
            stackStr.push("1");

        }
    }

