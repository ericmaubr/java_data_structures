package ericmau.datastruct;

/**
 * Implementation of the stack data structure using a generic type.
 * 
 * This class provides methods to push, pop, and peek elements in a stack, as well as to check if the stack is empty.
 * A stack follows the Last In, First Out (LIFO) principle.
 * 
 * @param <T> the type of elements held in this stack
 * 
 * Example usage:
 * To create and use a stack of type Integer:
 * <pre>
 *     Stack<Integer> stack = new Stack<>();
 *     stack.push(10);        // Adds 10 to the stack
 *     stack.push(20);        // Adds 20 to the stack
 *     System.out.println(stack.peek()); // Prints the top element: 20
 *     stack.pop();           // Removes the top element: 20
 *     System.out.println(stack.isEmpty()); // Prints false if the stack still contains elements
 * </pre>
 * 
 * @see Node
 * 
 */
public class Stack<T> {

  protected Node<T> topNode;
  protected int size;

  /**
   * Creates a new stack
   */
  public Stack() {
    this.topNode = null;
    this.size = 0;
  }

  /**
   * Adds a new element to the stack.
   */
  public void push(T newElement) {
    Node<T> newNode = new Node<>(newElement); 
    this.pushNode(newNode);
  }


  /**
   * Adds a new node to the stack.
   */
  private void pushNode(Node<T> newNode) {
    newNode.setNextNode(this.topNode);
    this.topNode = newNode;
    this.size++;

  }


  /**
   * Removes the top node from the stack and returns its value.
   * 
   * This method removes the current top node from the stack (if the stack is not empty) 
   * and updates the top node to be the next node in the stack. If the stack is empty, 
   * it returns `null`.
   *
   * @return The value of the node that was removed from the top of the stack. If the stack is empty, 
   *         it returns `null`.
   */
  public T pop() {
    Node<T> popNode = this.popNode();
    T returnValue;

    if (popNode != null) {
      returnValue = popNode.getValue();
    }
    else {
      returnValue = null;
    }

    return returnValue;
  }


  /**
   * Removes the top node from the stack and returns it.
   * 
   * This method removes the current top node from the stack (if the stack is not empty) 
   * and updates the top node to be the next node in the stack. If the stack is empty, 
   * it returns the current top node, which is `null`.
   *
   * @return The node that was removed from the top of the stack. If the stack is empty, 
   *         it returns the current top node, which is `null`.
   */
  private Node<T> popNode() {
    Node<T> popNode = topNode;

    if (!this.isEmpty()){
      topNode = topNode.getNextNode();
      this.size--;
    }

    return popNode;
  }

  /**
    * Returns the first node of the stack keeping the stack unchanged.
    * 
    * @return first node of the stack
    */
  public Node<T> peek() {
    return this.topNode;
  }

  /**
    * Verifies if the stack is empty.
    * @return true if is empty, false if is not empty.
    */
  public boolean isEmpty(){
    return (this.topNode == null);
  }

  /**
   * 
   * Returns the number of elements of the stack
   * 
   * @return number of elements of the stack
   */
  public int size() {
    return this.size;
  }

  /**
   * Prints the contents of the stack.
   */
  @Override
  public String toString() {
    String textReturn = "Stack [size=" + size + "]\n";
    textReturn += "Stack contents\n";

    Node<T> tmpNode = this.topNode; 
    while (tmpNode != null) {
      textReturn += tmpNode + "\n";
      tmpNode = tmpNode.getNextNode(); 
    }

    textReturn += "---------------------\n";

    return textReturn;
  }

  

}
