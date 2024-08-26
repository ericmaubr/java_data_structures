package ericmau.datastruct;

/**
 * Implementation of the queue data structure using a generic type.
 * 
 * This class provides methods to enqueue, dequeue, and peek elements in a queue, as well as to check if the queue is empty.
 * A queue follows the First In, First Out (FIFO) principle.
 * 
 * @param <T> the type of elements held in this queue
 * 
 * Example usage:
 * To create and use a queue of type Integer:
 * <pre>
 *     Queue<Integer> queue = new Queue<>();
 *     queue.enqueue(10);        // Adds 10 to the queue
 *     queue.enqueue(20);        // Adds 20 to the queue
 *     System.out.println(queue.peek()); // Prints the top element: 10
 *     queue.dequeue();           // Removes the top element: 10
 *     System.out.println(queue.isEmpty()); // Prints false if the queue still contains elements
 * </pre>
 * 
 * @see Node
 * 
 */


public class Queue<T> {

  protected Node<T> firstNode;
  protected Node<T> lastNode;
  int size;

  /**
   * Creates a new queue.
   */

  public Queue() {
    this.firstNode = null;
    this.lastNode = null;
    this.size = 0;
  }

  public void enqueue(T newElement) {
    Node<T> newNode = new Node<>(newElement);

    if (this.isEmpty()){
      this.firstNode = newNode;
    }
    else {
      this.lastNode.setNextNode(newNode);
    }
    this.lastNode = newNode;
    lastNode.setNextNode(null);
    this.size++;
  }

  public T dequeue() {

    T returnValue;

    if (this.isEmpty()) {
      returnValue = null;
    }
    else {
      returnValue = this.firstNode.getValue();
      this.firstNode = this.firstNode.getNextNode();
      this.size--;
    }

    return returnValue;
  }

  public T peek() {
    if (this.firstNode != null) {
      return this.firstNode.getValue();
    }
    else {
      return null;
    }
  }

  public boolean isEmpty() {
    return (this.firstNode == null);
  }

  public int size() {
    return this.size;
  }

  /**
   * Prints the contents of the queue.
   */
  @Override
  public String toString() {
    String textReturn = "Queue [size=" + size + "]\n";
    textReturn += "Queue contents\n";

    Node<T> tmpNode = this.firstNode; 
    while (tmpNode != null) {
      textReturn += tmpNode + "\n";
      tmpNode = tmpNode.getNextNode(); 
    }

    textReturn += "---------------------\n";

    return textReturn;
  }

}
