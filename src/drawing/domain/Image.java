package drawing.domain;

import java.io.File;

public class Image extends DrawingItem {

    private File file;

    public Image(Color color, Point anchor, double width, double height, File file) {
        super(color, anchor, width, height);
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
