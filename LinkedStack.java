package DataStructure;


import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/15/17.
 */
public class LinkedStack<DataType> implements StackInterface<DataType> {

    protected LLNode<DataType> top;
    protected int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(DataType element) {
        LLNode<DataType> newNode = new LLNode<>(element);
        newNode.setLink(top);
        top = newNode;
        size++;
    }

    public void pop() {
        if (!isEmpty()) {
            top = top.getLink();
            size--;
        } else {
            throw new UnderflowException("Pop attempted on empty stack");
        }
    }
    //throws error if stack is empty, otherwise returns top element from stack
    public DataType top() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            throw new UnderflowException("Top attempted on empty stack");
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = " ";
        LLNode current = top;
        while (current != null) {
            result = result + (current.getData().toString() + "\n");
            current = current.getLink();
        }
        return result;
    }
}


