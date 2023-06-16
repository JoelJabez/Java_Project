package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class BinarySearch {
    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 9, 11, 12, 14, 16};

        System.out.println(callBinarySearch(numbers, 21));
    }
}
