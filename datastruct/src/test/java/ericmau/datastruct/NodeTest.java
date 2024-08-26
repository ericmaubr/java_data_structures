package ericmau.datastruct;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testInteger() {
    int testNumber = 1000;
    Node<Integer> node = new Node<>(testNumber);
    assertEquals(Integer.valueOf(testNumber), node.getValue());
  }

  @Test
  public void testGetNextNodeInteger() {
    int testNumber1 = 1;
    int testNumber2 = 2;

    Node<Integer> node1 = new Node<>(testNumber1);
    Node<Integer> node2 = new Node<>(testNumber2);

    node1.setNextNode(node2);

    assertEquals(node2, node1.getNextNode());
    
  }

  @Test
  public void testGetNextNodeString() {
    String testValue1 = "string 1";
    String testValue2 = "string 2";
    String testValue3 = "string 3";

    Node<String> node1 = new Node<>(testValue1);
    Node<String> node2 = new Node<>(testValue2);
    Node<String> node3 = new Node<>(testValue3);

    node1.setNextNode(node2);
    node2.setNextNode(node3);

    assertEquals(node2, node1.getNextNode());
    assertEquals(node3, node2.getNextNode());
  }
  
}
