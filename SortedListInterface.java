package DataStructure;

/**
 * Created by Danay on 6/9/17.
 */

public interface SortedListInterface<DataType> {
    //adds elements to this list
    void add(DataType element);

    boolean remove(DataType element);

    boolean contains(DataType element);

    boolean isEmpty();

    int size();

    DataType get(DataType element);

    DataType getNext();

    String toString();

    void reset();

}
