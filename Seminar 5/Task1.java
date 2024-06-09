import java.util.*;
//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
// map.remove(123456);
// System.out.println(map.get(123456));
// map.put(123456, map.get(321456));
// System.out.println(map.get(123456));
// map.clear();
// System.out.println(map.entrySet());
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            if (entry.getValue().equals("Иванов"))
                System.out.println(entry);
        }
// System.out.println(map.values());
// Map<Integer, String> map1 = Map.of(123456, "Иванов",321456, "Васильев");
// System.out.println(map1);
// map1.put(654321, "Петрова");
    }
}