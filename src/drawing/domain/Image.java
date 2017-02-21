package drawing.domain;

import java.io.File;

public class Image extends DrawingItem {

    private File file;

    public Image(Point anchor, double width, double height, File file) {
        super(anchor, width, height);
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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
        return String.format("Anchor:(%s,%s),FileName:%s,Width:%s,Height:%s", anchor.getX(), anchor.getY(), file.getPath(), width, height);
    }
}
