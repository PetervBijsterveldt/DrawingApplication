package drawing.domain;

public class Oval extends DrawingItem {

    private double weight;

    public Oval(Color color, Point anchor, double width, double height, double weight) {
        super(color, anchor, width, height);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
