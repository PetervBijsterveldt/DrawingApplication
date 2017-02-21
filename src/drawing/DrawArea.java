package drawing;

import javax.swing.*;
import java.awt.*;

class DrawArea extends JPanel {

    public DrawArea() {
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
    }
}
