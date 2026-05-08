package structures;

public class GenericTree<T extends MenuItem> {

    public T root;

    public GenericTree() {
        root = null;
    }

    public void add(T item, T parent) {

        if(root == null) {
            root = item;
            return;
        }

        parent.addChild(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return recursiveTreePrint(root, 0, sb);
    }

    public String recursiveTreePrint(MenuItem item, int depth, StringBuilder sb) {

        String depthTabs = "\t".repeat(depth);
        sb.append(depthTabs).append(item).append("\n");

        item.children.forEach(c -> recursiveTreePrint(c, depth+1, sb));

        return sb.toString();
    }
}
