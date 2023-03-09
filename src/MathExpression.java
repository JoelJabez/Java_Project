import java.util.Scanner;

public class MathExpression {
    public static void main(String[] args)
    {
//        double pi  = 3.142;
//        double x = 10.9;

        // Finding the maximum value

//        System.out.println("The maximum value is " + Math.max(pi, x));
//
//        // finding the minimum value
//
//        System.out.println("The minimum value is " + Math.min(pi, x));
//
//        System.out.println();
//
//        // Change an int to positive
//        int y = 10;
//        System.out.println("The value of y is " + y);
//        System.out.println("The absolute value of y is " + Math.abs(y));
//
//        System.out.println();
//
//        // Square root of an int
//        int number = 25;
//        System.out.println("The value of the number is " + number);
//        System.out.println("The square root of the number is " + Math.sqrt(number));
//
//        System.out.println();
//
//        // Rounding the number
//
//        double normal = 5.4, high = 5.1, low = 5.9;
//
//        System.out.println("The normal round is " + Math.round(normal));
//        System.out.println("The ceiling round is " + Math.ceil(high));
//        System.out.println("The floor round is " + Math.floor(low));


        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Find the value of a hypotenuse");
        System.out.println("a: ");
        a = scanner.nextDouble();

        System.out.println("b: ");
        b = scanner.nextDouble();

        // First idea
//        c = Math.sqrt((a * a) + (b * b));

        // Second idea
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Third idea
        c = Math.hypot(a, b);

        System.out.println("The hypotenuse of the triangle is " + c);

        scanner.close();
    }
}
