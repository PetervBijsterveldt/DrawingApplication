package drawing.domain;

public class PaintedText extends DrawingItem{

    private String content;
    private String fontName;

    public PaintedText(Color color, Point anchor, double width, double height, String content, String fontName) {
        super(color, anchor, width, height);
        this.content = content;
        this.fontName = fontName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
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

    @Override
    public String toString() {
        return String.format("Anchor:(%s,%s),Color:%s,Width:%s,Height%s,Font:%s", anchor.getX(), anchor.getY(), color.name(), width, height, fontName);
    }
}
