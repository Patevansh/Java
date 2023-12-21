package assingment;
import javax.swing.*;

public class FrameworkExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        frame.setVisible(true);
    }
}
