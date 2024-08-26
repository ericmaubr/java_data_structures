
package ericmau.datastruct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eric
 */
public class QueueTest {

    public QueueTest() {
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Queue<String> stringQueue = new Queue<>();
        
        for(int i=0; i <10; i++){
            stringQueue.enqueue("element " + i);
        }

        System.out.println(stringQueue);

        assertEquals(10, stringQueue.size());
       
        while(!stringQueue.isEmpty()){
            assertNotNull(stringQueue.dequeue());
        }

        assertEquals(0, stringQueue.size());
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        Queue<Integer> intQueue = new Queue<>();
        
        for(int i=0; i <10; i++){
            intQueue.enqueue(i);
        }

        System.out.println(intQueue);

        assertEquals(10, intQueue.size());

        for(int i=0; (!intQueue.isEmpty()); i++){
            assertEquals(Integer.valueOf(i),intQueue.dequeue());
        }

        assertEquals(0, intQueue.size());

        System.out.println("Empty queue");
        System.out.println(intQueue);
    }

    /**
     * Test of peek method, of class Queue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");

        Queue<Integer> intQueue = new Queue<>();
        assertNull(intQueue.peek());

        int queueSize = 10;
        for(int i=0; i <queueSize; i++){
            intQueue.enqueue(i);
        }

        //System.out.println(intQueue);

        assertEquals(queueSize, intQueue.size());
        assertEquals(Integer.valueOf(0), intQueue.peek());


        Queue<String> stringQueue = new Queue<>();
        assertNull(stringQueue.peek());
        stringQueue.enqueue("str 01");
        stringQueue.enqueue("str 02");
        assertEquals("str 01", stringQueue.peek());

        Queue<Object> objectQueue = new Queue<>();
        assertNull(objectQueue.peek());

    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Queue<String> instance = new Queue<>();
        assertEquals(true, instance.isEmpty());

        instance.enqueue("bla"); 
        assertEquals(false, instance.isEmpty());
    }

    /**
     * Test a series of enqueue and dequeue of class Queue.
     */
    @Test
    public void testVariousOperations() {
        System.out.println("Various Operations");
        Queue<String> instance = new Queue<>();
        assertEquals(true, instance.isEmpty());

        instance.enqueue("first element");
        instance.enqueue("second element");
        instance.enqueue("third element");
        instance.enqueue("forth element");

        System.out.println(instance.toString());

        assertEquals(false, instance.isEmpty());
        assertEquals("first element", instance.peek());
        assertEquals(4, instance.size());
       
        String value = instance.dequeue();
        assertEquals(false, instance.isEmpty());
        assertEquals("first element", value);
        assertEquals(3, instance.size());
        assertEquals("second element", instance.peek());
        System.out.println(instance.toString());

        value = instance.dequeue();
        assertEquals(false, instance.isEmpty());
        assertEquals("second element", value);
        assertEquals(2, instance.size());
        assertEquals("third element", instance.peek());
        System.out.println(instance.toString());

        instance.enqueue("fifth element");
        assertEquals(false, instance.isEmpty());
        assertEquals(3, instance.size());
        assertEquals("third element", instance.peek());
        System.out.println(instance.toString());

    }




}