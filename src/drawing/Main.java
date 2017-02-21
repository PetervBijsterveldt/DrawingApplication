package drawing;

import drawing.domain.*;
import drawing.domain.Color;
import drawing.domain.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    private DrawArea panel;
    private List<Drawing> drawings;

    public static void main(String[] args) {
        PaintedText text = new PaintedText(Color.BLUE, new Point(50,137), 200,200, "Text", "Arial");
        System.out.println(text);
        new Main();
    }

    private Main() throws HeadlessException {
        drawings = new ArrayList<>();
        Drawing drawing = new Drawing("Perfection");
        panel = new DrawArea(drawing);

        setLocationRelativeTo(null);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        setVisible(true);
    }
}
