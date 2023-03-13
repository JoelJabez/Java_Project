import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int numbers[][] = {{1, 2}, {3, 4}};

//        for (int[] row: numbers) {
//            System.out.println();
//            for (int column: row) {
//                System.out.print(column + " ");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            number = scanner.nextInt();
        }while(number > 9 || number < 2);

        int[][] first_matrix = new int[number][number];
        int[][] second_matrix = new int[number][number];

        System.out.println("First matrix");
        for (int i = 0; i < first_matrix.length; i++) {
            for (int j = 0; j < first_matrix[i].length; j++) {
                first_matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Second matrix");
        for (int i = 0; i < second_matrix.length; i++) {
            for (int j = 0; j < second_matrix[i].length; j++) {
                second_matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of matrix: ");
        for (int i = 0; i < first_matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < first_matrix[i].length; j++) {
                System.out.print(first_matrix[i][j] + second_matrix[i][j] + " ");
            }
        }

    }
}
