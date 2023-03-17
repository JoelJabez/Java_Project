import java.util.ArrayList;

public class SingleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
//        for (Integer number: numbers) {
//            System.out.println(number);
//        }

//        numbers.remove(0);
//        System.out.println(numbers.get(0));

        numbers.clear();

        System.out.println(numbers);


        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        System.out.println(number);


    }
}
