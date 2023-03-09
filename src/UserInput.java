import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("True or False?");
        boolean question = scanner.nextBoolean();

        System.out.println(question);

        scanner.close();
        System.out.println("Scanner is closed");
    }
}
