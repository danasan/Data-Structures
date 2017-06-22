package DataStructure;

import DataStructure.Exceptions.InvalidInputException;
import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/15/17.
 */
public class LinkedSortedList<DataType extends Comparable> implements SortedListInterface<DataType> {
    protected LLNode<DataType> head;
    protected LLNode<DataType> iterator;
    protected int size = 0;

    public LinkedSortedList() {
        head = null;
        iterator = null;
    }

    public void add(DataType element) {
        LLNode newNode = new LLNode(element);
        if (isEmpty()) {
            head = newNode;
        } else if (contains(element)) {
            throw new InvalidInputException("This element already exists in the list.");
        } else if (element.compareTo(head.getData()) < 0) {
            newNode.setLink(head);
            head = newNode;
        } else {
            iterator = head;
            while (iterator.getLink() != null) {
                if (element.compareTo(iterator.getLink().getData()) < 0) {
                    newNode.setLink(iterator.getLink());
                    iterator.setLink(newNode);
                    break;
                }
                iterator = iterator.getLink();
            }
            if (iterator.getLink() == null) {
                iterator.setLink(newNode);
            }
        }
        size++;
    }

    public boolean remove(DataType element) {
        iterator = head;
        if (isEmpty()) {
            throw new UnderflowException("Cannot remove elements from empty list.");
        } else if (head == null) {
            return false;
        } else if (head.getData().equals(element)) {
            head = head.getLink();
        } else {
            while (iterator.getLink() != null) {
                if (element.equals(iterator.getLink().getData())) {
                    iterator.setLink(iterator.getLink().getLink());
                }
                //move iterator to next node
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

    public DataType get(DataType element) {
        iterator = head;
        while (iterator != null) {
            if (element.equals(iterator.getData())) {
                return iterator.getData();
            }
            //move iterator to next node
            iterator = iterator.getLink();
        }
        if (!contains(element)) {
           throw new InvalidInputException("Element does not exists in the list.");
        }
        return iterator.getData();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
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

