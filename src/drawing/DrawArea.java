package drawing;

import drawing.domain.*;
import drawing.domain.Image;
import drawing.domain.Polygon;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class DrawArea extends JPanel {

    private Drawing picture;

    public Drawing getDrawing() {
        return picture;
    }

    public void setDrawing(Drawing drawing) {
        this.picture = drawing;
    }

    public DrawArea(Drawing picture) {
        this.picture = picture;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;

        for (DrawingItem item : picture.items) {

            switch (item.getClass().getSimpleName()) {

                case "Oval":
                    drawOval(g, (Oval) item);
                    break;

                case "Polygon":
                    drawPolygon(g, (Polygon) item);
                    break;

                case "Image":
                    drawImage(g, (Image) item);
                    break;

                case "PaintedText":
                    drawPaintedText(g, (PaintedText) item);
                    break;
            }
        }
    }

    private void drawOval(Graphics2D g, Oval oval) {
        int x = (int) oval.getAnchor().getX();
        int y = (int) oval.getAnchor().getX();
        int width = (int) oval.getWidth();
        int height = (int) oval.getHeight();
        double weight = oval.getWeight();
        drawing.domain.Color color = oval.getColor();

        g.setStroke(new BasicStroke((float) weight));
        g.setColor(getColor(color));
        g.drawOval(x, y, width, height);
    }

    private void drawPolygon(Graphics2D g, drawing.domain.Polygon polygon) {

    }

    private void drawImage(Graphics2D g, Image image) {

    }

    private void drawPaintedText(Graphics2D g, PaintedText text) {

    }

    private Color getColor(drawing.domain.Color itemColor) {
        switch (itemColor) {

            case BLACK:
                return Color.BLACK;
            case WHITE:
                return Color.WHITE;
            case RED:
                return Color.RED;
            case BLUE:
                return Color.BLUE;
            case GREEN:
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }
}
