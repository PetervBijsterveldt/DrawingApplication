package drawing.domain;

public class Polygon extends DrawingItem{

    private Point[] vertices;
    private double weight;

    public Polygon(Color color, Point anchor, double width, double height, Point[] vertices, double weight) {
        super(color, anchor, width, height);
        this.vertices = vertices;
        this.weight = weight;
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
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }
}
