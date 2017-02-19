package drawing.domain;

public abstract class DrawingItem {

    private Color color;
    private Point anchor;
    private double width;
    private double height;

    public DrawingItem(Color color, Point anchor, double width, double height) {
        this.color = color;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

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
}
