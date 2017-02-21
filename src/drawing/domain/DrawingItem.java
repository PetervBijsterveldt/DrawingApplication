package drawing.domain;

public abstract class DrawingItem implements Comparable<DrawingItem> {

    protected Color color;
    protected Point anchor;
    protected double width;
    protected double height;
    protected double distFromOrigin;

    public DrawingItem() {
    }

    public DrawingItem(Color color, Point anchor, double width, double height) {
        this.color = color;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        distFromOrigin = calculateDistance(anchor);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Redundant overriding!
    public abstract Point getAnchor();

    public abstract double getWidth();

    public abstract double getHeight();

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(DrawingItem other) {
        if (distFromOrigin == other.distFromOrigin) return 0;

        return (distFromOrigin < other.distFromOrigin) ? -1 : 1;
    }

    protected double calculateDistance(Point b) {
        double x = b.getX();
        double y = b.getY();
        return Math.sqrt((x * x) + (y * y));
    }
}
