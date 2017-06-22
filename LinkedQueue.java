package DataStructure;

import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/15/17.
 */
public class LinkedQueue<DataType> implements QueueInterface<DataType> {
    protected LLNode<DataType> front;
    protected LLNode<DataType> rear;
    protected int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(DataType element) {
        LLNode newNode = new LLNode(element);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.setLink(rear);
            rear = newNode;
        }
        size++;
    }

    public DataType dequeue() {
        if (isEmpty()) {
            throw new UnderflowException("Dequeue attempted on empty queue");
        } else {
            DataType element = front.getData();
            front = front.getLink();
            size--;
            if (front == null)
                rear = null;
            return element;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = " ";
        LLNode current = front;
        while (current != null) {
            result = result + (current.getData().toString() + "\n");
            current = current.getLink();
        }
        return result;
    }
}
