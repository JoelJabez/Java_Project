package Jetbrains.Chuck_Norris_Cipher_Encoder;

//public class Main {
//    public static void main(String[] args) {
//        String text = "Hello world";
//        // --> Types of primitive data types
//        // byte, char, int, long, float, double, boolean, short
//
//        // --> Decimal value
////        float pi = 3.142f;
////        double pi = 3.142123456789133;
//
//        // --> Long data type
//        long distance = 68739104593014L;
//
//        // --> Unsigned long
//        long number = Integer.toUnsignedLong((int) 4294967297L);
//        System.out.println(number);
//
//        // --> Type casting
//        int asciiC = 'C';
////        int number = 123;
////        System.out.println((int) distance);
////        System.out.println(asciiC);
//
//        // --> Change text to binary
////        for (int i = 0; i < text.length(); i++) {
////            System.out.println(Integer.toBinaryString(text.charAt(i)));
////        }
//
//        // --> Switch case
////        char letter = 'E';
////        String message = switch (letter) {
////            case 'A' | 'E' | 'I' | 'O' | 'U':
////            case 'A', 'E':
////                 yield "It's a vowel";
////            default:
////                 yield "It's not a vowel";
////        };
////
////        System.out.println(message);
//    }
//}

//import java.util.*;
//
//public class Main {
//
//    private static String array = null;
//
//    public static void methodCatchingSomeExceptions() {
//        // invoke methodThrowingExceptions here and catch some types of exceptions
//        try {
//            methodThrowingExceptions();
//        } catch (ArrayIndexOutOfBoundsException aioobe) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        } catch (NumberFormatException nfe) {
//            System.out.println("NumberFormatException");
//        }
//    }
//
//    /* Do not change code below */
//    public static void methodThrowingExceptions() {
//        if (array == null) {
//            return;
//        }
//        int[] integers = Arrays.stream(array.split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        Object someValue = integers[integers[0]];
//        if (integers[0] + integers[1] == integers[2]) {
//            integers = null;
//        }
//        int sum = 0;
//        for (int i : integers) {
//            sum += i;
//        }
//        int meanValue = integers.length / sum;
//        if (integers[2] == integers[3]) {
//            String string = (String) someValue;
//            System.out.print("Random value is " + string);
//        }
//        System.out.print("Mean is " + meanValue);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        array = scanner.nextLine();
//        try {
//            methodCatchingSomeExceptions();
//        } catch (Exception e) {
//            System.out.println("Caught: " + e.getClass().getName());
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.println("Please input operation (encode/decode/exit):");
            input = scanner.nextLine();

            switch (input) {
                case "encode" -> {
                    System.out.println("Input string:");
                    String encodeInput = scanner.nextLine();

                    System.out.println("Encoded string:");
                    encodeText(encodeInput);
                }

                case "decode" -> {
                    System.out.println("Input encoded string:");
                    String decodeInput = scanner.nextLine();

                    decodeText(decodeInput);
                }

                case "exit" -> System.out.println("Bye!");

                default -> System.out.printf("There is no '%s' operation\n", input);
            }
            System.out.println();
        }
    }

    public static void encodeText(String text) {
        String binaryText = "";
        String unaryText = "";

        for (int i = 0; i < text.length(); i++) {
            int ascii = Integer.parseInt(Integer.toBinaryString(text.charAt(i)));
            binaryText = String.format("%s%07d", binaryText, ascii);
        }

        for (int i = 0; i < binaryText.length(); i++) {
            if (i != 0 && binaryText.charAt(i) == binaryText.charAt(i - 1)) {
                unaryText = String.format("%s0", unaryText);
            } else {
                switch (binaryText.charAt(i)) {
                    case '0' -> unaryText = String.format("%s 00 0", unaryText);
                    case '1' -> unaryText = String.format("%s 0 0", unaryText);

                }
            }
        }

        System.out.println(unaryText.substring(1));
    }

    public static void decodeText(String text) {
        String[] unaryText = text.split(" ");
        int i, j, times;

        String errorMessage = "Encoded string is not valid";
        for (String t: unaryText) {
            for (i = 0; i < t.length(); i++) {
                if (t.charAt(i) != '0') {
                    System.out.println(errorMessage);
                    return;
                }
            }
        }

        if(unaryText.length % 2 != 0) {
            System.out.println(errorMessage);
            return;
        }

        int length = unaryText[0].length();
        if (!(length > 0 && length <= 2)) {
            System.out.println(errorMessage);
            return;
        }

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

        if (binaryText.length() % 7 == 0) {
            String[] asciiText = new String[binaryText.length() / 7];
            for (i = 0; i < asciiText.length; i++) {
                asciiText[i] = binaryText.substring(i * 7, (i * 7) + 7);
            }

            System.out.println("Decoded string:");
            for (String s: asciiText) {
                System.out.print((char) Integer.parseInt(s, 2));
            }
            System.out.println();
            return;
        }

        System.out.println(errorMessage);
    }
}

// 0 0 00 00 0 0 00 0000 0 0 00 00000 0 0 00 0 0 0 00 0 0 000 00 0 0 0 00 0000 0 0
// 0 0 00 00 0 0 00 0000 0 0 00 00000 0 0 00 0 0 0 00 0 0 000 00 0 0 0 00 0000 0 0
// 0 0 00 00 0 0 00 0000 0 0 00 00000 0 0 00 0 0 0 00 0 0 000 00 0 0 0 00 0000 0 0