import java.util.Scanner;

public class ChuckNorris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, times;

        System.out.println("Input encoded string");
        String unary = scanner.nextLine();

        String[] unaryText = unary.split(" ");
        String binaryText = "";
        for (i = 0; i < unaryText.length; i+=2) {
            times = unaryText[i + 1].length();

            switch (unaryText[i]) {
                case "00" -> {
                    for (j = 0; j < times; j++) {
                        binaryText += "0";
                    }
                }

                case "0" -> {
                    for (j = 0; j < times; j++) {
                        binaryText += "1";
                    }
                }
            }
        }

        String[] asciiText = new String[binaryText.length() / 7];
        for (i = 0; i < asciiText.length; i++) {
            asciiText[i] = binaryText.substring(i * 7, (i * 7) + 7);
        }

        System.out.println("\nThe result:");
        for (String s : asciiText) {
            System.out.print((char) Integer.parseInt(s, 2));
        }
        System.out.println();
    }
}