package ericmau.datastruct;

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
