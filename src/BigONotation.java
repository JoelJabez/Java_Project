public class BigONotation {
    public static void main(String[] args) {
        int count = 0;
        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                count++;
            }
        }

        System.out.println(count);
    }
}
