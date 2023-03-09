import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
//        String[] names = new String[3];
//
//        names[0] = "Alice";
//        names[1] = "Bob";
//        names[2] = "Charlie";
//
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//

        String[] names = {"Alice", "Bob", "Charlie"};
        names[1] = "David";

//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);

//        long startBasic, startEnhanced, endBasic, endEnhanced;
//
//        startBasic = System.nanoTime();
//        for (int i = 0; i < names.length; i++)
//        {
//            System.out.println(names[i]);
//        }
//        endBasic = System.nanoTime();
//
//        System.out.println("\nNormal for loop time: " + TimeUnit.NANOSECONDS.toMicros(endBasic - startBasic));
//        System.out.println();
//
//        startEnhanced = System.nanoTime();
//        for(String name: names)
//        {
//            System.out.println(name);
//        }
//        endEnhanced = System.nanoTime();
//
//
//
//        System.out.println("\nEnhanced for loop time: " + TimeUnit.NANOSECONDS.toMicros(endEnhanced - startEnhanced));


//        for (String argument: args){
//            System.out.println(argument);
//        }

//        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 14, 16, 19, 21};
//        int find = 12;
//
//        for (int number: numbers){
//            if (find == number){
//                System.out.println(number);
//                break;
//            }
//        }
//
//        System.out.println(Arrays.binarySearch(numbers, find));

        int[] numbers = {3, 1, 5, 4, 7, 9, 6};
        System.out.println("Before Sorting: ");
        for(int number: numbers)
        {
            System.out.println(number);
        }
        Arrays.sort(numbers);
        System.out.println("\nAfter Sorting: ");
        for(int number: numbers)
        {
            System.out.println(number);
        }
    }
}
