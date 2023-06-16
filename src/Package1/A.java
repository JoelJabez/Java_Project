package Package1;

public class A {
    final static String normalMessage = "This is a normal message";
    final public static String publicMessage = "This is a public message";
    final private static String privateMessage = "This is a private message";
    final protected static String protectedMessage = "This is a protected message";
    // public, private, protected, package-protected
    public static void main(String[] args) {
        System.out.println(privateMessage);
    }
}
