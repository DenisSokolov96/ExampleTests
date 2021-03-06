import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNodeClass {

    @Test
    void creatNode(){
        Node node = new Node("mainNode");
        assertEquals("mainNode",node.getName());
    }

    @Test
    void addChildNode(){
        Node node = new Node("mainNode");
        Node child = node.addChild("child1");
        assertEquals("child1", child.name);
    }

    @Test
    void delOfNameNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        node.dellOfName("child1");
        assertNull(node.getNameChild("child1"));
    }

    @Test
    void delAllNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        Node child4 = node.addChild("child4");
        node.delAllChild();
        assertEquals(0, node.size());
    }

    @Test
    void searchNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        assertTrue(node.search("child1"));
    }

    @Test
    void changeNode(){
        Node node = new Node("mainNode");
        Node child1 = node.addChild("child1");
        Node child2 = node.addChild("child2");
        Node child3 = node.addChild("child3");
        node.changeName("Node123");
        assertEquals("Node123",node.getName());
    }
}
