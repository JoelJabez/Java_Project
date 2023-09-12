package TDD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        printPrimeNumbers(100);
    }

    public static int total(List<Integer> numbers) {
        return numbers.stream().mapToInt(v -> v).sum();
    }

    private static void printPrimeNumbers(int range) {
        for (int i = 2; i < range; i++) {
            boolean prime = true;
            for (int j = 2; j < Math.sqrt(range) && i != 2; j++) {
	            if (i % j == 0) {
		            prime = false;
		            break;
	            }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }
}
