package DataStructure.Test;

import DataStructure.LinkedQueue;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Danay on 6/14/17.
 */
//Required operations for queue: Enqueue, Dequeue, isEmpty, isFull(array), size, toString
public class LinkedQueueTest {
    LinkedQueue queueTest = new LinkedQueue();

    @Test
    public void enqueue() {
        int addElements = 10;
        String message = "Enqueuing 10 elements to this queue";
        for (int i = 0; i < addElements; i++) {
            queueTest.enqueue(message);
        }
        assertFalse(queueTest.isEmpty());
        assertEquals(queueTest.size(), addElements);
        System.out.println(queueTest);
        System.out.println(queueTest.size());
    }

    @Test
    public void dequeue() {
        for (int i = 0; i < queueTest.size(); i--) {
            queueTest.dequeue();
        }
        //queueTest.dequeue();
    }

    @Test
    public void isEmpty() {
        assertEquals(queueTest.size(), 0);
        assertTrue(queueTest.isEmpty());
    }

    @Test
    public void size() {
        System.out.println("The size of the queue is: " + queueTest.size());

    }

}
