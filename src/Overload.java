import java.util.Scanner;

public class Overload {
    public static void print (String strArg){
        System.out.println("print(\"" + strArg + "\")");
    }

    // write your method here
    public static void print (String strArg,int valArg){
        System.out.println("print(\"" + valArg + "\"," + valArg + ")");
    }

    /* Do not change code below */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}
