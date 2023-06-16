package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class FormatString {
    public static void main(String[] args) {
//        String text = "Hello";
//
//        System.out.println(String.format("%s world", text));
//        System.out.println(text);

        String name = "Joel Jabez";
        String[] names = name.split(" ");
        String[] fruits = new String[3];

        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "mangoes";
//        fruits[3] = "papaya";

        String[] animals = new String[]{"dog", "cat", "rabbit"};
        animals[3] = "giraffe";

        System.out.println(animals.length);

        for (String n:
             names) {
            System.out.println(n);
        }
    }
}
