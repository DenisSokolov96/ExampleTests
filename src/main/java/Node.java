import java.util.ArrayList;
import java.util.List;

public class Node {

    public String name = null;
    public List<Node> listNode = new ArrayList<Node>();

    public Node(String name) {
        this.name = name;
        this.listNode.add(new Node(name));
    }

    public String getName() {
        return name;
    }

    public Node addChild(String child1) {
        Node node = new Node(child1);
        return node;
    }

    public void delOfName(String child1) {

        for (int i = 0; i < listNode.size(); i++)
            if (listNode.get(i).name.equals(child1)) {
                listNode.remove(i);
                break;
            }
    }


    public String getNameChild(String child1) {

        for (int i = 0; i < listNode.size(); i++)
            if (listNode.get(i).name.equals(child1))
                return listNode.get(i).name;

        return null;
    }

    public void delAllChild() {
        listNode.clear();
    }

    public int size() {
        return listNode.size();
    }

    public void changeName(String node123) {
        name = node123;
    }

    public boolean serach(String child1) {
        for (int i = 0; i < listNode.size(); i++)
        if (listNode.get(i).name.equals(child1))
            return true;

        return false;
    }
}
