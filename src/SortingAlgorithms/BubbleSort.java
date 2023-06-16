package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    /*
    ***Pseudocode***
    function sort(numbers):
        int length = len(numbers)

        for i in range(len(numbers)):
            for j in range(length):
                if (j + 1 != length) and (numbers[j] > numbers[j + 1]:
                    int temp = n[j]
                    n[j] = n[j + 1]
                    n[j + 1] = temp

            length-=1
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 2, 8, 7, 9, 0, 1, 5, 6));

        System.out.println(numbers);
        sort(numbers);

        System.out.println(numbers);
    }
    public static void sort(ArrayList<Integer> n) {
        int length = n.size();

        for (int i = 0; i < n.size(); i++) {
            for (int j = 0; j < length; j++) {
                if (j + 1 != length && n.get(j) > n.get(j + 1)) {
                    int temp = n.get(j);
                    n.set(j, n.get(j + 1));
                    n.set(j + 1, temp);
                }
            }
            length--;
        }
    }

    public static void sort(int[] n) {
        int length = n.length;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < length; j++) {
                if (j + 1 != length && n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
            length--;
        }
    }
}
