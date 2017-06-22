package DataStructure;

import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/9/17.
 */

public interface QueueInterface<DataType> {

    void enqueue(DataType element);

    DataType dequeue() throws UnderflowException;

    boolean isEmpty();

    int size();

    String toString();
}
