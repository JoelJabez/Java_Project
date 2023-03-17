public class MethodsOverload {
    public static void main(String[] args) {
        int x, y, z;

        x = 1;
        y = 2;
        z = 3;

        System.out.println(add(x, y));
        System.out.println(add(x, y, z));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int add(double x, int y){
        return 1;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}
