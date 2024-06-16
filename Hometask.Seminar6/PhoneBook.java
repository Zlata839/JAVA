// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Kate", "123456");
        phoneBook.addContact("Jack", "326347");
        phoneBook.addContact("Kate", "879677");
        phoneBook.addContact("Иван", "133546");
        phoneBook.addContact("Алина", "143523");
        phoneBook.addContact("Екатерина", "346563");
        phoneBook.addContact("Алина", "547358");
        phoneBook.addContact("Алина", "9568475");

        phoneBook.printPhoneBook();
    }
}

public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

//Кусочек из прошлого ДЗ, с ним у меня получилось решение, но потом я попробовала у AI
// попросить помочь сделать код поменьше и нашла computeIfAbsent

//    public void addContact(String name, String phoneNumber) {
//        contacts.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
//    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            List<String> numbers = contacts.get(name);
            numbers.add(phoneNumber);
            contacts.put(name, numbers);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contacts.put(name, numbers);
        }
    }

    public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


/*
Метод computeIfAbsent в Java используется для вычисления значения для указанного ключа в карте (Map),
если этот ключ отсутствует, и добавления вычисленного значения в карту.

В вашем коде:
public void addContact(String name, Integer phoneNumber) {
    contacts.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
}
Этот метод выполняет следующие действия:
1. Проверяет, существует ли уже ключ name в карте contacts.
2. Если ключ name отсутствует, то вызывается лямбда-выражение k -> new HashSet<>(),
которое создает новый объект типа HashSet для хранения номеров телефонов.
3. Затем метод add(phoneNumber) добавляет номер телефона в созданный HashSet.
Если ключ name уже существует в карте, то метод computeIfAbsent не выполняет никаких действий,
и номер телефона не добавляется повторно.
 */


/*
public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

Метод .sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));
Этот компаратор сравнивает размеры списков значений (номеров телефонов) для каждой записи.
Если первый список больше второго, то возвращается положительное число, что указывает
на необходимость поменять местами элементы в списке. Если второй список больше первого,
то возвращается отрицательное число, что означает, что элементы остаются на своих местах.
Если списки равны по размеру, то возвращается ноль.

Пошагово:
1. List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());:

contacts.entrySet() возвращает множество записей (ключ-значение) из карты contacts.

new ArrayList<>(...) создает новый список, инициализируя его содержимым из множества записей.
Таким образом, sortedEntries теперь содержит все записи из contacts.

2.sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));:

sortedEntries.sort(...) сортирует список sortedEntries в порядке убывания,
основываясь на размере списка значений (номеров телефонов) для каждой записи.

Лямбда-выражение (e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())
используется для сравнения размеров списков значений (номеров телефонов) для каждой записи.

3. for (Map.Entry<String, List<String>> entry : sortedEntries) { ... }:
Цикл проходит по отсортированному списку sortedEntries.

На каждой итерации он выводит ключ (имя контакта) и соответствующий список значений
(номера телефонов) на экран с помощью System.out.println.

Таким образом, метод printPhoneBook сначала создает список записей из телефонной книги,
затем сортирует этот список по количеству номеров телефонов для каждого контакта, и наконец,
выводит отсортированные записи на экран.
 */

