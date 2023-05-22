import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    /*
    function search(numbers, numberToSearch):
        for (i in range(len(numbers)):
            if (numbers[i] == numberToSearch):
                return true

        return false
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 3, 1, 6, 5));

        search(numbers, 5);
    }

    private static boolean present(ArrayList<Integer> n, int numberToSearch) {
        for (Integer integer : n) {
            if (numberToSearch == integer) {
                return true;
            }
        }
        return false;
    }

    private static int indexOf(ArrayList<Integer> n, int numberToSearch) {
       if (present(n , numberToSearch)) {
           return n.indexOf(numberToSearch);
       }
       return -1;
    }

    public static void search(ArrayList<Integer> n, int numberToSearch) {
        if (indexOf(n, numberToSearch) != -1) {
            System.out.printf("%d is present in the array list at index %d\n", numberToSearch, indexOf(n, numberToSearch));
        }
        else {
            System.out.printf("%d is not present in the array list\n", numberToSearch);
        }
    }

    private static boolean present(int[] n, int numberToSearch) {
        for (int integer : n) {
            if (numberToSearch == integer) {
                return true;
            }
        }
        return false;
    }

    private static int indexOf(int[] n, int numberToSearch) {
        if (present(n , numberToSearch)) {
            return n[numberToSearch];
        }
        return -1;
    }

    public static void search(int[] n, int numberToSearch) {
        if (indexOf(n, numberToSearch) != -1) {
            System.out.printf("%d is present in the array at index %d\n", numberToSearch, indexOf(n, numberToSearch));
        }
        else {
            System.out.printf("%d is not present in the array\n", numberToSearch);
        }
    }
}
