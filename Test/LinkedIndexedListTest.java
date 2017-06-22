package DataStructure.Test;

import DataStructure.LinkedIndexedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Danay on 6/14/17.
 */
public class LinkedIndexedListTest {
    LinkedIndexedList indexedListTest = new LinkedIndexedList();

    @Test
    public void size() {
        indexedListTest.size();
    }

    @Test
    public void add() {
        indexedListTest.add(0, "Dan");
        indexedListTest.add(1, "Dina");
        indexedListTest.add(2, "Alan");
        indexedListTest.add(3, "David");
        indexedListTest.add(4, "Sasha");
        indexedListTest.add(5, "Brian");
        indexedListTest.add(6, "Frian");
        indexedListTest.add(7, "Crian");
        indexedListTest.add(8, "Zion");
        indexedListTest.add(9, "Xion");
        indexedListTest.add(10, "Artu");
        System.out.println("The indexed list is: " + indexedListTest + "Size is : " + indexedListTest.size());
    }

    @Test
    public void remove() {
        indexedListTest.add(0, "Dan");
        indexedListTest.add(1, "Dina");
        indexedListTest.add(2, "Alan");
        indexedListTest.add(3, "David");
        indexedListTest.add(4, "Sasha");
        indexedListTest.add(5, "Brian");
        indexedListTest.add(6, "Frian");
        indexedListTest.add(7, "Crian");
        indexedListTest.add(8, "Zion");
        indexedListTest.add(9, "Xion");
        indexedListTest.add(10, "Artu");
        System.out.println("Removing index eight? " + indexedListTest.remove(8) + ". Now the size is: " + indexedListTest.size());
    }

    @Test
    public void contains() {
        indexedListTest.add(0, "Dan");
        indexedListTest.add(1, "Dina");
        indexedListTest.add(2, "Alan");
        indexedListTest.add(3, "David");
        indexedListTest.add(4, "Sasha");
        indexedListTest.add(5, "Brian");
        indexedListTest.add(6, "Frian");
        indexedListTest.add(7, "Crian");
        indexedListTest.add(8, "Zion");
        indexedListTest.add(9, "Xion");
        indexedListTest.add(10, "Artu");

        assertTrue(indexedListTest.contains("Alan"));
    }

    @Test
    public void isEmpty() {

        assertTrue(indexedListTest.isEmpty());
        assertEquals(indexedListTest.size(), 0);
    }

    @Test
    public void get() {
        indexedListTest.add(0, "Dan");
        indexedListTest.add(1, "Dina");
        indexedListTest.add(2, "Alan");
        indexedListTest.add(3, "David");
        indexedListTest.add(4, "Sasha");
        indexedListTest.add(5, "Brian");
        indexedListTest.add(6, "Frian");
        indexedListTest.add(7, "Crian");
        indexedListTest.add(8, "Zion");
        indexedListTest.add(9, "Xion");
        indexedListTest.add(10, "Artu");
        System.out.println("Getting element at index six: " + indexedListTest.get(6));
    }

    @Test
    public void reset() {

    }

    @Test
    public void getNext() {
        indexedListTest.add(0, "Dan");
        indexedListTest.add(1, "Dina");
        indexedListTest.add(2, "Alan");
        indexedListTest.add(3, "David");
        indexedListTest.add(4, "Sasha");
        indexedListTest.add(5, "Brian");
        indexedListTest.add(6, "Frian");
        indexedListTest.add(7, "Crian");
        indexedListTest.add(8, "Zion");
        indexedListTest.add(9, "Xion");
        indexedListTest.add(10, "Artu");
        System.out.println("getNext is: " + indexedListTest.getNext());
    }

}
