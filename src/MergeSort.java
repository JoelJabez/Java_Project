public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 4, 0};

        sort(numbers);
    }

    public static void sort(int[] num) {
        int length = num.length;
        sortRecursion(num, 0, length - 1);
        printArray(num);
    }

    private static void sortRecursion(int[] num, int start, int end) {
        if (start < end) {
            int middle = (end + start) / 2;

            sortRecursion(num, start, middle);
            sortRecursion(num, middle + 1, end);

            mergeSort(num, start, middle, end);
        }
    }

    private static void mergeSort(int[] num, int start, int middle, int end) {
        int i, j, k, leftRange, rightRange;
        int[] tempLeft, tempRight;

        leftRange = middle - start + 1;
        rightRange = end - middle;

        tempLeft = new int[leftRange];
        tempRight = new int[rightRange];

        for (i = 0; i < leftRange; i++) {
            tempLeft[i] = num[start + i];
        }

        for (i = 0; i < rightRange; i++) {
            tempRight[i] = num[middle + i + 1];
        }


        for (i = 0, j = 0, k = start;
             i < leftRange && j < rightRange;
             k++) {
            if (tempLeft[i] <= tempRight[j]) {
                num[k] = tempLeft[i];
                i++;
            } else {
                num[k] = tempRight[j];
                j++;
            }
        }


        for (; i < leftRange; k++) {
            num[k] = tempLeft[i];
            i++;
        }

        for (; j < rightRange; k++) {
            num[k] = tempRight[j];
            j++;
        }

    }

    private static void printArray(int[] num) {
        for (int number :
                num) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
