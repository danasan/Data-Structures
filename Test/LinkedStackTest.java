package DataStructure.Test;

import DataStructure.LinkedStack;
import org.junit.Test;

import static org.junit.Assert.*;

//Required operations for stack: Push, pop, top(peek), isEmpty, isFull (array), size, toString

/**
 * Created by Danay on 6/14/17.
 */
public class LinkedStackTest {
    LinkedStack stackTest = new LinkedStack();

        @Test
        public void size() {
            System.out.println("Size of this stack: " + stackTest.size());
        }

        @Test
        public void isEmpty() {
            assertTrue(stackTest.isEmpty());
            assertEquals(stackTest.size(), 0);
        }

        @Test
        public void push() {
            int elemPushed = 5;
            for (int i = 0; i < elemPushed; i++) {
                stackTest.push("Pushing 5 elements");
            }
            System.out.println(stackTest);
            assertFalse(stackTest.isEmpty());
            assertEquals(stackTest.size(), elemPushed);
        }

        @Test
        public void top() {
            String message = "I am the top element";
            stackTest.push(message);
            assertEquals(stackTest.top(), message);
        }

        @Test
        public void pop() {
            for (int i = 0; i < stackTest.size(); i--) {
                stackTest.pop();
            }
            assertTrue(stackTest.isEmpty());
            assertEquals(stackTest.size(), 0);
        }
   }
