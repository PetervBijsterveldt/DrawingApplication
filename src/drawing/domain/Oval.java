package drawing.domain;

public class Oval extends DrawingItem {

    private double weight;

    public Oval(Color color, Point anchor, double width, double height, double weight) {
        super(color, anchor, width, height);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
