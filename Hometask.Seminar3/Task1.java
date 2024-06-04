//Сортировка слиянием
//
//Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
//
//Пример
//a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

//import java.util.Arrays;
//
//class MergeSort {
//    public static int[] mergeSort(int[] a) {
//        // Напишите свое решение ниже
//        int[] result = merge_sort(a);
//        return result;
//    }
//    private static int[] merge_sort(int[] m)
//    {
//        // if list size is 1, consider it sorted and return it
//        if (m.length <= 1)
//        {
//            return m;
//        } // else list size is > 1, so split the list into two sublists
//        else
//        {
//            int[] left = new int[m.length / 2];
//            int[] right = new int[m.length - m.length / 2];
//            int middle = m.length / 2;
//            // for each x in m before middle add x to left
//            for (int i = 0; i < middle; i++)
//            {
//                left[i] = m[i];
//            }
//            // for each x in m after or equal middle add x to right
//            for (int j = middle; j < m.length; j++)
//            {
//                right[j - middle] = m[j];
//            }
//
//            // recursively call merge_sort() to further split each sublist
//            // until sublist size is 1
//            left = merge_sort(left);
//            right = merge_sort(right);
//
//            // merge the sublists returned from prior calls to merge_sort()
//            // and return the resulting merged sublist
//            int[] mergedArray = merge(left, right);
//
//            return mergedArray;
//
//        }
//    }
//    // merge left and right sub lists
//    private static int[] merge(int[] left, int[] right)
//    {
//
//        int[] result = new int[left.length + right.length];
//
//        // init pointers
//        int posLeft = 0;
//        int posRight = 0;
//        int posRes = 0;
//
//        // merge from both lists
//        while (posLeft < left.length && posRight < right.length)
//        {
//            if (left[posLeft] <= right[posRight])
//            {
//                result[posRes] = left[posLeft];
//                posLeft++;
//            } else
//            {
//                result[posRes] = right[posRight];
//                posRight++;
//            }
//            posRes++;
//        }
//        // append rest from left list
//        while (posLeft < left.length)
//        {
//            result[posRes] = left[posLeft];
//            posLeft++;
//            posRes++;
//        }
//        // append rest from right list
//        while (posRight < right.length)
//        {
//            result[posRes] = right[posRight];
//            posRight++;
//            posRes++;
//        }
//
//        return result;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//class Printer{
//    public static void main(String[] args) {
//        int[] a;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{5, 1, 6, 2, 3, 4};
//        } else {
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        MergeSort answer = new MergeSort();
//        String itresume_res = Arrays.toString(answer.mergeSort(a));
//        System.out.println(itresume_res);
//    }
//}

// Решение платформы

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n < 2) {
            return a;
        }
        int mid = n / 2; // длину массива делим напополам
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        //находим левую и правую половину
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) { // начинаем с середины
            r[i - mid] = a[i]; // - mid чтобы не выйти за пределы массива
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right]; // это выведется в конце
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) { //сравнили какой элемент меньше
                a[k++] = l[i++]; // это индекс нашего результата и увеличиваем все на 1
            }
            else {
                a[k++] = r[j++];
            }
        }
        // теперь то что при первой сортировке отпало снова сортируем и в 144 срочку объеденяем
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }
}

public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
