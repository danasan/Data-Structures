package DataStructure;

import DataStructure.Exceptions.OverflowException;
import DataStructure.Exceptions.UnderflowException;

/**
 * Created by Danay on 6/9/17.
 */

public interface StackInterface<DataType> {

    void pop() throws UnderflowException;

    DataType top() throws UnderflowException;

    boolean isEmpty();

    void push(DataType element) throws OverflowException;

    int size();

    String toString();

}
