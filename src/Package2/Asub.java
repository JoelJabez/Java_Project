package Package2;
import Package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        System.out.println(A.protectedMessage);
    }
}
