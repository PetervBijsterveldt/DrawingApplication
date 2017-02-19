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
