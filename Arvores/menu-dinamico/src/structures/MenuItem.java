package structures;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    public String text;
    public String route;
    public List<MenuItem> children = new ArrayList<>();

    public MenuItem(String text, String route) {
        this.text = text;
        this.route = route;
    }

    public void addChild(MenuItem item) {
        children.add(item);
    }

    @Override
    public String toString() {
        return text + "(" + route + ")";
    }
}
