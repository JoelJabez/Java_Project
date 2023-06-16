package Jetbrains.Chuck_Norris_Cipher_Encoder;

public class BigIntegerConverter {
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number);
    }

    public static void main(String[] args) {
        System.out.println(getBigInteger("49225"));
    }
}
