import java.util.Scanner;

public class MarioLess {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int bricks;
        do {
            bricks = scanner.nextInt();
        }while (1 > bricks || bricks > 9);

        for(int i = 0; i < bricks; i++)
        {
            System.out.println();
            for (int j = 0; j < bricks; j++)
            {
                if(j + i >= (bricks - 1))
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}
