import help.Helper;

public class Main {

//     public static void main(String[] args) {
//         System.out.println(Helper.getCurrentDateTime());

    //         Helper.getUserDataFromConsole();
//     }
// }
    public static void main(String[] args) {
        Helper.getSumElemsArray(arr);
        int [] [] array = new int[] [] {
                {2, 3},
                {1, 2, 3, 4}
        };

        String toReverse = "Добро подаловать на курс по Java";

        System.out.println(Helper.reverse(toReverse));

        // int [] arr = new int[] {1,2, 4, 76, 89, 5, -100};
        // System.out.println(Helper.getSumElemsFromArray(array));
    }
}