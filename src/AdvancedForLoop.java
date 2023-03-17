import java.util.ArrayList;
import java.util.Arrays;

public class AdvancedForLoop {
    public static void main (String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(
                        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 16
                ));

        for (Integer number: numbers){
            System.out.println(number);
        }

        for (Integer number: numbers){
            System.out.println(number);
        }
    }
}
