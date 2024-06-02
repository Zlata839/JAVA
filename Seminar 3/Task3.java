//Задание №3
//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List items = new ArrayList<String>();
        items.add("ttt");
        items.add(2);
        items.add("qqqqqqq");
        items.add(3);

        for (int i = 0; i < items.size(); i++) {
            Object item = items.get(i);
            if (item instanceof Integer)
                items.remove(i);
        }
        System.out.println(items);
    }
}
