import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marks: ");
        int marks = scanner.nextInt();

        // && || !
        if (marks <= 100 && marks >= 80)
        {
            System.out.println("Grade A");
        } else if (marks < 80 && marks >= 60) {
            System.out.println("Grade B");
        } else if(marks < 60 && marks >= 40)
        {
            System.out.println("Grade C");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("Grade D");
        }
    }
}
