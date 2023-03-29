import java.util.ArrayList;

public class BinarySearch {

    /*
    ***Pseudocode***

    function search(numbers, int start, int middle, int end, int numberToSearch):
        if (start + 1 != end)
            if (numbers[middle] == numberToSearch):
                return middle
            else if (numbers[middle], numberToSearch):
                return search(numbers, start, (start + middle) / 2, middle, numberToSearch)
            else if (numbers[middle] < numberToSearch):
                return search(numbers, middle, (middle + end) / 2, end, numberToSearch)
        else:
            return -1
     */
    public static void search(ArrayList<Integer> n, int numberToSearch) {
        if (isSorted(n)) {
            System.out.println(search_recursion(n, 0, n.size() / 2, n.size(), numberToSearch));
        } else {
            System.out.println("Unable to search the array list because it's unsorted");
        }
    }

    private static boolean isSorted(ArrayList<Integer> n) {
        for (int i = 0; i < n.size() - 1; i++) {
            if (n.get(i) > n.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private static String search_recursion(ArrayList<Integer> n, int start, int middle, int end, int numberToSearch) {
        if (start + 1 != end) {
            if (n.get(middle) == numberToSearch) {
                return "Found " + numberToSearch + " in array list at index " + middle;
            } else if (n.get(middle) > numberToSearch) {
                return search_recursion(n, start, (start + middle) / 2, middle, numberToSearch);
            } else if (n.get(middle) < numberToSearch) {
                return search_recursion(n, middle, (middle + end) / 2, end, numberToSearch);
            }
        }
        return "Unable to find " + numberToSearch + " in array list";

    }


    public static void search(int[] n, int numberToSearch) {
        if (isSorted(n)) {
            System.out.println(search_recursion(n, 0, n.length / 2, n.length, numberToSearch));
        } else {
            System.out.println("Unable to search the array because it's unsorted");
        }
    }

    private static boolean isSorted(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i]) {
                return false;
            }
        }

        return true;
    }

    private static String search_recursion(int[] n, int start, int middle, int end, int numberToSearch) {
        if (start + 1 != end) {
            if (n[middle] == numberToSearch) {
                return "Found " + numberToSearch + " in array at index " + middle;
            } else if (n[middle] > numberToSearch) {
                return search_recursion(n, start, (start + middle) / 2, middle, numberToSearch);
            } else if (n[middle] < numberToSearch) {
                return search_recursion(n, middle, (middle + end) / 2, end, numberToSearch);
            }
        }
        return "Unable to find " + numberToSearch + " in array";

    }

}
