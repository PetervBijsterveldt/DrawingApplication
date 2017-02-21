package drawing;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JPanel panel;
    private JButton button;

    public static void main(String[] args) {
        new Main();
    }

    private Main() throws HeadlessException {
        panel = new DrawArea();
        setLocationRelativeTo(null);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        setVisible(true);
    }
}
