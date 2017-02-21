package drawing.domain;

import java.awt.geom.Rectangle2D;

public class Polygon extends DrawingItem {

    private Point[] vertices;
    private double weight;

    public Polygon(Color color, Point[] vertices, double weight) {
        this.vertices = vertices;
        this.weight = weight;
        this.color = color;

        Rectangle2D.Double boundingBox = getBoundingBox();

        double x = boundingBox.getX();
        double y = boundingBox.getY();
        anchor = new Point(x, y);

        width = boundingBox.width;
        height = boundingBox.height;

        distFromOrigin = calculateDistance(anchor);
    }

    public Point[] getVertices() {
        return vertices;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public Point getAnchor() {
        return anchor;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    private Rectangle2D.Double getBoundingBox() {
        double minX = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Point point : vertices) {
            minX = Math.min(minX, point.getX());
            maxX = Math.max(maxX, point.getX());
            minY = Math.min(minY, point.getX());
            maxY = Math.max(maxY, point.getX());
        }

        double width = maxX - minX;
        double height = maxY - minY;

        return new Rectangle2D.Double(minX, minY, width, height);
    }
}
