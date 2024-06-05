//Реализовать стэк с помощью массива.
//
//Нужно реализовать методы:
//
//size(), empty(), push() - *в вершину стека кладетзначение*,
//peek() - *возвращает значение верхнего элемента в стеке*,
//pop() - *возвращает это значение и еще и удаляет, стек очищается*.

public class GBStack <T> {

    private int capacity = 2;
    private int size = 0;
    private int top = -1;
    private T[] values = (T[]) new Object[capacity];

    private void addCapacity () {
        capacity *= 2;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(values,0, temp, 0, values.length);
        values = temp;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(T element){
        if (capacity == size)
            addCapacity();
        values[++top] = element;
        size++;
    }

    public T peek() {
        if (!empty())
            return values[top];
        else
            throw new RuntimeException("Стек пуст");
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("Стек пуст");
        }
        else {
            peek();
            size--;
        }
        return values[top--];


    }

    public String toString() {
        if (empty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(values[i]).append(", ");
        }
        return String.format("[%s]", builder);
    }

}