//Сортировка массива с использованием кучи
//
//Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
//
//Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
//
//Сначала выводить исходный массив на экран.
//
//Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
//
//Выводить отсортированный массив на экран.
//
//Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
//
//Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
//
//На входе:
//'5 8 12 3 6 9'
//
//На выходе:
//Initial array:
//[5, 8, 12, 3, 6, 9]
//Sorted array:
//[3, 5, 6, 8, 9, 12]

//вариант платформы
//import java.util.Arrays;
//
//class HeapSort {
//    public static void buildTree(int[] tree, int sortLength) {
//        // Для всех вершин дерева начиная с середины сортируемой части массива
//        // (движемся влево до нулевого индекса)
//        for (int i = sortLength / 2 - 1; i >= 0; i--) {
//            int maxIndex;
//            // Если у вершины два листа, выбираем больший
//            if (i * 2 + 2 <= sortLength - 1) {
//                if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
//                else maxIndex = i * 2 + 1;
//                // Иначе один лист
//            } else maxIndex = i * 2 + 1;
//            // Сравниваем лист с максимальным значением с вершиной, при большем значении
//            // дочернего элемента меняем его местами с вершиной
//            if (tree[i] < tree[maxIndex]) {
//                int temp = tree[i];
//                tree[i] = tree[maxIndex];
//                tree[maxIndex] = temp;
//            }
//        }
//    }
//
//    public static void heapSort(int[] sortArray, int sortLength) {
//        // Выход из рекурсии: длина сортируемой части равна 0
//        if (sortLength == 0) return;
//        // Выстраивание элементов части массива в виде сортирующего дерева
//        buildTree(sortArray, sortLength);
//        // Замена местами первого и последнего элемента в сортируемой части
//        int temp = sortArray[0];
//        sortArray[0] = sortArray[sortLength - 1];
//        sortArray[sortLength - 1] = temp;
//        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
//        heapSort(sortArray, sortLength - 1);
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        int[] initArray;
//
//        if (args.length == 0) {
//            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
//        } else {
//            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        System.out.println("Initial array:");
//        System.out.println(Arrays.toString(initArray));
//        HeapSort.heapSort(initArray, initArray.length);
//        System.out.println("Sorted array:");
//        System.out.println(Arrays.toString(initArray));
//    }
//}

//вариант 2
import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
        // Построение кучи (Heap)
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);

        // Извлечение элементов из кучи по одному и формирование отсортированного массива
        for (int i = sortLength - 1; i > 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            heapify(sortArray, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[i] < arr[l]) {
            largest = l;
        }

        if (r < n && arr[largest] < arr[r]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

//вариант 3
//import java.util.Arrays;
//
//class HeapSort {
//    public static void buildTree(int[] tree, int sortLength, int rootIndex) {
//        // Введите свое решение ниже
//        int maxElementIndex = rootIndex; // инициализируем наибольший элемент как корень
//        int leftIndex = 2 * rootIndex + 1; // левый индекс
//        int rightIndex = 2 * rootIndex + 2; // правый индекс
//        // находим индекс максимального элемента в поддереве
//        if (leftIndex < sortLength && tree[leftIndex] > tree[maxElementIndex])
//            maxElementIndex = leftIndex;
//        if (rightIndex < sortLength && tree[rightIndex] > tree[maxElementIndex])
//            maxElementIndex = rightIndex;
//        // Переносим в корень максимальный элемент
//        if (maxElementIndex != rootIndex) {
//            int swap = tree[rootIndex];
//            tree[rootIndex] = tree[maxElementIndex];
//            tree[maxElementIndex] = swap;
//            buildTree(tree, sortLength, maxElementIndex);
//        }
//
//    }
//
//    public static void heapSort(int[] sortArray, int sortLength) {
//        // Введите свое решение ниже
//        // Строим дерево
//        for (int i = sortLength/2-1;i>=0;i--)
//            buildTree(sortArray, sortLength, i);
//
//        //Извлекаем элементы из дерева с конца кучи
//        for (int i=sortLength-1;i>=0;i--){
//            // Перемещаем корень в конец кучи
//            int swap = sortArray[0];
//            sortArray[0] = sortArray[i];
//            sortArray[i] = swap;
//            buildTree(sortArray,i,0);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] initArray;
//
//        if (args.length == 0) {
//            initArray = new int[] { 17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1, -5, -4};
//        } else {
//            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        System.out.println("Initial array:");
//        System.out.println(Arrays.toString(initArray));
//        HeapSort.heapSort(initArray, initArray.length);
//        System.out.println("Sorted array:");
//        System.out.println(Arrays.toString(initArray));
//    }
//}