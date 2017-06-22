package DataStructure;

/**
 * Created by Danay on 6/9/17.
 */

public interface IndexedListInterface<DataType> {

    void add(int index, DataType element);

    boolean remove(int index);

    boolean contains(DataType element);

    boolean isEmpty();

    int size();

    DataType get(int index);

    String toString();

    void reset();

    DataType getNext();

}
