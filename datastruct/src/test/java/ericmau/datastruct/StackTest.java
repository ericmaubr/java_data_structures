package ericmau.datastruct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StackTest {
 
  @Test
  public void testPush() {
    Stack<Integer> stack = new Stack<>();

    int stackSize = 5;

    for (int i=0; i<stackSize;i++) {
      stack.push(i);
    }

    Node<Integer> tmpNode = stack.peek();
    int i=0;
    while (tmpNode != null) {
      tmpNode = tmpNode.getNextNode();
      i++;
    }

    assertEquals(stackSize, i);
  }

  @Test
  public void testSize() {
    Stack<Integer> stack = new Stack<>();

    int stackSize = 9;

    for (int i=0; i<stackSize;i++) {
      stack.push(i);
    }
    
    assertEquals(stackSize, stack.size());
  }


  @Test
  public void testIsEmpty() {
    Stack<String> stack = new Stack<>();
    assertEquals(true, stack.isEmpty());

    stack.push("string 01");
    assertEquals(false, stack.isEmpty());

    // help GC to release memory
    stack = null;

    // verifies empty stack
    stack = new Stack<>();
    String value = stack.pop();
    assertNull(value);

  }

  @Test
  public void testPop() {

    Stack<Integer> stack = new Stack<>();

    int stackSize = 13;

    for (int i=0; i<stackSize;i++) {
      stack.push(i);
    }
    
    assertEquals(stackSize, stack.size());

    System.out.println(stack.toString());

    Integer tmpValue;
    for (int i=12; i>=0; i--) {
      tmpValue = stack.pop();
      assertEquals(Integer.valueOf(i), tmpValue);
    }

    assertEquals(true, stack.isEmpty());

    System.out.println(stack.toString());

  }

}
