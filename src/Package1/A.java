package Package1;

public class A {
    static String normalMessage = "This is a normal message";
    public static String publicMessage = "This is a public message";
    static private String privateMessage = "This is a private message";
    static protected String protectedMessage = "This is a protected message";
    // public, private, protected, no modifier
    public static void main(String[] args) {
        System.out.println(privateMessage);
    }
}
