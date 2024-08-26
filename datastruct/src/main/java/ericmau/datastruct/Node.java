package ericmau.datastruct;

/**
 * A generic implementation of a node used in various data structures.
 * This class leverages Java Generics to handle any type of object.
 * 
 * @param <T> the type of object that this node holds
 * 
 * Example usage:
 * To create a new node of type Integer:
 * <pre>
 *     Node<Integer> node01 = new Node<>(5); // Creates a node holding the value 5
 * </pre>
 * 
 * @see Stack
 */

public class Node<T> {

    private T value;
    private Node<T> nextNode;
  
    public Node(T value) {
      this.value = value;
    }
  
    /**
     * 
     * Retrieves the current value of the node.
     * 
     * @return current value of the node.
     *
     */
    public T getValue() {
      return value;
    }

    /**
     * Sets a new value to the node.
     *
     */
    public void setValue(T value) {
      this.value = value;
    }
  
    /**
     * Retrieves the next node.
     * 
     * @return next node.
     */
    public Node<T> getNextNode() {
      return nextNode;
    }
  
    /**
     * 
     * Sets the next node.
     * 
     * @param next node
     */
    public void setNextNode(Node<T> nextNode) {
      this.nextNode = nextNode;
    }

    /**
     * Prints the content of the node.
     */
    @Override
    public String toString() {
      return "Node [value=" + value + "]";
    }
}
