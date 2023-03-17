import java.util.ArrayList;
import java.util.Arrays;

public class DoubleArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> aisle = new ArrayList<>();

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Coke", "Pepsi", "Sprite"));

        ArrayList<String> cannedFoods = new ArrayList<>(Arrays.asList("Tuna", "Baked beans"));

        ArrayList<String> biscuits = new ArrayList<>(Arrays.asList("Lexus", "Peanut butter biscuits"));

        aisle.add(drinks);
        aisle.add(cannedFoods);
        aisle.add(biscuits);

        for (ArrayList <String> items: aisle) {
            System.out.println();
            for (String item:
                 items) {
                System.out.print(item + " ");
            }
        }
    }
}
