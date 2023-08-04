import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args)
    {
        // Getting the user input from a GUI
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        float height = Float.parseFloat(JOptionPane.showInputDialog("Height: "));
        JOptionPane.showMessageDialog(null, "Your height is " + height);

        // More info about GUI
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello " + name, "Hello title", JOptionPane.WARNING_MESSAGE);
    }
}
