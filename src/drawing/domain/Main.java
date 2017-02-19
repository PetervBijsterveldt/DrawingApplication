package drawing.domain;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    private Main() throws HeadlessException {
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new DrawArea());
        setVisible(true);
    }
}
