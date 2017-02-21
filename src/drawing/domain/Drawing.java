package drawing.domain;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    private String name;
    public List<DrawingItem> items;

    public Drawing(String name, List<DrawingItem> items) {
        this.name = name;
        this.items = items;
    }

    public Drawing(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
