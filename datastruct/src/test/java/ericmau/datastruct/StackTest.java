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

    assertEquals(Integer.valueOf(stackSize), Integer.valueOf(stack.size()));
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

  @Test
  public void testPeek(){
    Stack<Integer> stack = new Stack<>();
    assertNull(stack.peek());

    int stackSize = 15;
    for (int i=0; i<stackSize;i++) {
      stack.push(i);
    } 
    assertEquals(stackSize, stack.size());
    assertEquals(Integer.valueOf(stackSize-1), stack.peek());

  }

    /**
     * Test a series of enqueue and dequeue of class Queue.
     */
    @Test
    public void testVariousOperations() {
        System.out.println("Various Operations");
        Stack<String> instance = new Stack<>();
        assertEquals(true, instance.isEmpty());

        instance.push("first element");
        instance.push("second element");
        instance.push("third element");
        instance.push("forth element");

        System.out.println(instance.toString());

        assertEquals(false, instance.isEmpty());
        assertEquals("forth element", instance.peek());
        assertEquals(4, instance.size());
       
        String value = instance.pop();
        assertEquals(false, instance.isEmpty());
        assertEquals("forth element", value);
        assertEquals(3, instance.size());
        assertEquals("third element", instance.peek());
        System.out.println(instance.toString());

        value = instance.pop();
        assertEquals(false, instance.isEmpty());
        assertEquals("third element", value);
        assertEquals(2, instance.size());
        assertEquals("second element", instance.peek());
        System.out.println(instance.toString());

        instance.push("fifth element");
        assertEquals(false, instance.isEmpty());
        assertEquals(3, instance.size());
        assertEquals("fifth element", instance.peek());
        System.out.println(instance.toString());

    }


}
