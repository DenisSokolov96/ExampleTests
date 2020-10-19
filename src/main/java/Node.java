import java.util.ArrayList;
import java.util.List;

public class Node {

    public String name = null;
    public List<Node> listNode = new ArrayList<Node>();;

    public Node(String name) {
        this.name = name;
        this.listNode = new ArrayList<Node>();
    }

    public String getName() {
        return name;
    }

    public Node addChild(String child) {
        this.listNode.add(new Node(child));
        return this.listNode.get(listNode.size()-1);
    }

    public void dellOfName(String child) {

        for (int i = 0; i < listNode.size(); i++)
            if (listNode.get(i).name.equals(child)) {
                listNode.remove(i);
                break;
            }
    }


    public String getNameChild(String child) {

        for (int i = 0; i < listNode.size(); i++)
            if (listNode.get(i).name.equals(child))
                return listNode.get(i).name;

        return null;
    }

    public void delAllChild() {
        listNode.clear();
    }

    public int size() {
        return listNode.size();
    }

    public void changeName(String str) {
        name = str;
    }

    public boolean search(String child) {
        for (int i = 0; i < listNode.size(); i++)
        if (listNode.get(i).name.equals(child))
            return true;

        return false;
    }
}
