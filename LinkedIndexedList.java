package DataStructure;

import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/12/17.
 */
public class LinkedIndexedList<DataType> implements IndexedListInterface<DataType> {
    protected LLNode<DataType> head;
    protected LLNode<DataType> iterator;
    protected int size;

    public LinkedIndexedList() {
        head = null;
        iterator = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int index, DataType element) {
        LLNode newNode = new LLNode(element);
        int pos = index - 1;
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index cannot be less than zero or greater than the size of the list.");
        } else if (isEmpty()) {
            head = newNode;
        } else if (index == 0) {
            newNode.setLink(head);
            head = newNode;
        } else {
            iterator = head;
            for (int i = 0; i < size(); i++) {
                if (i == pos) {
                    newNode.setLink(iterator.getLink());
                    iterator.setLink(newNode);
                } else if (index == size()) {
                    newNode.setLink(iterator.getLink());
                }
                iterator = iterator.getLink();
            }
        }
        size++;
    }

    public boolean remove(int index) {
        iterator = head;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        //removes index @ 0
        else if (index == 0) {
            head = iterator.getLink();
        } else {
            iterator = head;
            for (int i = 0; i < index; i++) {
                if (i == index) {
                    iterator.setLink(iterator.getLink().getLink());
                } else if (i == size()) {
                    iterator.setLink(null);
                }
                iterator = iterator.getLink();
            }
        }
        size--;
        return true;
    }

    public boolean contains(DataType element) {
        iterator = head;
        if (isEmpty()) {
            throw new UnderflowException("The list is empty");
        } else
            while (iterator != null) {
                if (element.equals(iterator.getData())) {
                    return true;
                }
                //move iterator to next node
                iterator = iterator.getLink();
            }
        return false;
    }

    public DataType get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Illegal index");
        } else {
            iterator = head;
            for (int i = 0; i < index; i++) {
                if (i == index) {
                    return iterator.getData();
                }
                iterator = iterator.getLink();
            }
        }
        return iterator.getData();
    }

    public void reset() {
        iterator = head;
    }

    public DataType getNext() {
        if ((!isEmpty()) && (iterator != null)) {
            if (iterator.getLink() == null) {
                iterator = head;
            } else {
                iterator = iterator.getLink();
            }
            return iterator.getData();
        } else {
            return null;
        }
    }

    public String toString() {
        iterator = head;
        String result = " ";
        while (iterator != null) {
            result = result + iterator.getData().toString() + "\n";
            iterator = iterator.getLink();
        }
        return result;
    }
}
