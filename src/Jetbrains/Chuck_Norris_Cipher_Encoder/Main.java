package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(Integer.toBinaryString(text.charAt(i)));
        }

    }
}
