package DataStructure.Test;

import DataStructure.LinkedSortedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Danay on 6/14/17.
 */
//Required operations for sorted list: add, remove, contains, isEmpty, size, get, toString, reset, getNext
public class LinkedSortedListTest {
    LinkedSortedList sortedListTest = new LinkedSortedList();

    @Test
    public void size() {
        sortedListTest.size();
    }

    @Test
    public void add() {
        sortedListTest.add("Alan");
        sortedListTest.add("David");
        sortedListTest.add("Sasha");
        sortedListTest.add("Brian");
        sortedListTest.add("Frian");
        sortedListTest.add("Crian");
        sortedListTest.add("Zion");
        sortedListTest.add("Xion");
        sortedListTest.add("Artu");
        assertFalse(sortedListTest.isEmpty());
        System.out.println(sortedListTest + "size of list is: " + sortedListTest.size());
    }

    @Test
    public void remove() {
        sortedListTest.add("Alan");
        sortedListTest.add("David");
        sortedListTest.add("Sasha");
        System.out.println("Removing element? " + sortedListTest.remove("Alan") + ", now the size is: " + sortedListTest.size());
    }

    @Test
    public void contains() {
        sortedListTest.add("Alan");
        sortedListTest.add("David");
        sortedListTest.add("Sasha");
        sortedListTest.contains("Sasha");
    }

    @Test
    public void isEmpty() {
        assertEquals(sortedListTest.size(), 0);
    }

    @Test
    public void get() {
        sortedListTest.add("Alan");
        sortedListTest.add("David");
        sortedListTest.add("Sasha");
        sortedListTest.get("Alan");
    }

    @Test
    public void reset() {
        sortedListTest.add("Alan");
        sortedListTest.add("David");
        sortedListTest.add("Sasha");
        sortedListTest.reset();
    }

    @Test
    public void getNext() {

        sortedListTest.getNext();
    }

}
