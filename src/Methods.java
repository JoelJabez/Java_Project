import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        hello();
    }

    public static void hello(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
