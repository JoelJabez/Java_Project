import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Loops {
    public static void main(String[] args)
    {
//        long startWhile, endWhile, startDoWhile, endDoWhile, startFor, endFor;
//
//        startWhile = System.nanoTime();
//        int iWhile = 0;
//        while(iWhile < 10)
//        {
//            System.out.println(iWhile);
//            iWhile++;
//        }
//        endWhile = System.nanoTime();
//
//        System.out.println();
//
//        startDoWhile = System.nanoTime();
//        int iDoWhile = 0;
//        do
//        {
//            System.out.println(iDoWhile);
//            iDoWhile++;
//        }while(iDoWhile < 10);
//        endDoWhile = System.nanoTime();
//
//        System.out.println();
//        startFor = System.nanoTime();
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println(i);
//        }
//        endFor = System.nanoTime();
//
//        System.out.println("While loop: " + TimeUnit.NANOSECONDS.toMicros(endWhile - startWhile));
//        System.out.println("Do while loop: " + TimeUnit.NANOSECONDS.toMicros(endDoWhile - startDoWhile));
//        System.out.println("For loop: " + TimeUnit.NANOSECONDS.toMicros(endFor - startFor));


        long startWhile, endWhile, startDoWhile, endDoWhile;

        Scanner scanner = new Scanner(System.in);
        byte doWhileBricks;

        System.out.println("While loop");
        byte bricks = 0;
        // While loop
        startWhile = System.nanoTime();
        while (bricks < 1 || bricks > 8){
            System.out.print("Number of bricks: ");
            bricks = scanner.nextByte();
        }
        endWhile = System.nanoTime();

        for(int i = 0; i < bricks; i++)
        {
            System.out.println();
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("#");
            }
        }

        // Do while loop
        System.out.println("Do while loop");
        startDoWhile = System.nanoTime();
        do {
            System.out.print("Number of bricks: ");
            doWhileBricks = scanner.nextByte();
        }
        while (doWhileBricks < 1 || doWhileBricks > 8);
        endDoWhile = System.nanoTime();

        for(int i = 0; i < doWhileBricks; i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
        }

        System.out.println("\nDo while took " + TimeUnit.NANOSECONDS.toMillis(endDoWhile - startDoWhile));
        System.out.println("While loop took " + TimeUnit.NANOSECONDS.toMillis(endWhile - startWhile));

        scanner.close();
    }
}
