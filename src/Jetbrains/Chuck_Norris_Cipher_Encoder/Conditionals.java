package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class Conditionals {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(i + j);
//            }
//        }

        int i = 0;
        while (i < 3) {
            if (i % 2 == 0 && i != 0) {
                System.out.printf("Even number: %d\n", i);
                break;
            }
            System.out.println("Counter: " + i);
            i++;
        }
    }
}
