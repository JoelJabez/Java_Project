import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
   /*
   ***Pseudocode***

    function sort(numbers):
        for i in range(len(numbers)):
            for j in range[i, 0]:
                if (numbers[j] > numbers[j - 1]):
                    break
                int temp = n[j]
                int[j] = n[j - 1]
                int[j - 1] = temp

        print(numbers)
    */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 3, 7, 6, 8, 9, 1, 4, 0));

        System.out.println(numbers);
        sort(numbers);
        System.out.println(numbers);
    }

    public static void sort(ArrayList<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (n.get(j) > n.get(j - 1)) {
                    break;
                }
                int temp = n.get(j);
                n.set(j, n.get(j - 1));
                n.set(j - 1, temp);
            }
        }
    }

    public static void sort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j > 0; j--) {
                if (n[j] > n[j - 1]) {
                    break;
                }
                int temp = n[j];
                n[j]  = n[j - 1];
                n[j - 1] = temp;
            }
        }
    }
}
