package drawing;

import drawing.domain.*;
import drawing.domain.Image;
import drawing.domain.Point;
import drawing.domain.Polygon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;


class DrawArea extends JPanel{

    private Drawing picture;

    public Drawing getDrawing() {
        return picture;
    }

    public void setDrawing(Drawing drawing) {
        this.picture = drawing;
    }

    public DrawArea(Drawing picture)  {
        this.picture = picture;
     }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;

        for (DrawingItem item : picture.items) {
            handleShapes(g, item);
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

    private void drawPolygon(Graphics2D g, Polygon polygon) {

        Point[] vertices = polygon.getVertices();
        int[] xPoints = new int[vertices.length];
        int[] yPoints = new int[vertices.length];

        for (int i = 0; i < vertices.length; i++) {
            xPoints[i] = (int) vertices[i].getX();
            yPoints[i] = (int) vertices[i].getY();
        }

        double weight = polygon.getWeight();
        drawing.domain.Color color = polygon.getColor();

        g.setStroke(new BasicStroke((float) weight));
        g.setColor(getColor(color));
        g.drawPolygon(xPoints, yPoints, vertices.length);
    }

    private void drawImage(Graphics2D g, Image image) {

        BufferedImage bufferedImage = null;

        try {
            bufferedImage = ImageIO.read(image.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int x = (int) image.getAnchor().getX();
        int y = (int) image.getAnchor().getY();
        int width = (int) image.getWidth();
        int height = (int) image.getHeight();

        g.drawImage(bufferedImage, x, y, width, height, null);
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

    private void handleShapes(Graphics2D g, DrawingItem item) {
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
