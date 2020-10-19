import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNodeClass {

    @Test
    private void creatNode(){
        Node node = new Node("mainNode");
        assertEquals("mainNode",node.getName());
    }

    @Test
    private void addChildNode(){
        Node node = new Node("mainNode");
        Node child = node.addChild("child1");
        assertEquals("child1", child.name);
    }

    @Test
    private void delOfNameNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        node.delOfName("child1");
        assertNull(node.getNameChild("child1"));
    }

    @Test
    private void delAllNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        node.delAllChild();
        assertEquals(0, node.size());
    }

    @Test
    private void searchNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        assertTrue(node.serach("child1"));
    }

    @Test
    private void changeNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        node.changeName("Node123");
        assertEquals("Node123",node.getName());
    }
}
