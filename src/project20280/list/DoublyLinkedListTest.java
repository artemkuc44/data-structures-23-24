package project20280.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testSize() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        assertEquals(0, ll.size());
        ll.addFirst(0);
        assertEquals(1, ll.size());
    }

    @Test
    void testIsEmpty() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
		assertTrue(ll.isEmpty());
        ll.addFirst(0);
		assertFalse(ll.isEmpty());
        ll.removeFirst();
		assertTrue(ll.isEmpty());
    }

    @Test
    void testFirst() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.addFirst(-1);
        assertEquals(-1, ll.first());

        ll.removeFirst();
		assertNull(ll.first());


    }

    @Test
    void testLast() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.addFirst(-1);

        assertEquals(-1, ll.last());

        ll.addFirst(-2);
        assertEquals(-1, ll.last());

        ll.addLast(-3);
        assertEquals(-3, ll.last());
    }


    @Test
    void testRemoveLast() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.addFirst(-1);
        ll.addFirst(-2);
        assertEquals(-1, ll.removeLast());
    }

    @Test
    void testGet() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        for (int i = 0; i < 5; ++i) ll.addLast(i);

        assertEquals(1, ll.get(1));
    }

    @Test
    void testRemove() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        for (int i = 0; i < 5; ++i) ll.addLast(i);

        ll.remove(1);
        assertEquals("[0, 2, 3, 4]", ll.toString());
    }

    @Test
    void testAdd() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        for (int i = 0; i < 5; ++i) ll.addLast(i);

        ll.add(2, -1);
        assertEquals("[0, 1, -1, 2, 3, 4]", ll.toString());
    }

    @Test
    void testToString() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        for (int i = 0; i < 5; ++i) ll.addLast(i);

        assertEquals("[0, 1, 2, 3, 4]", ll.toString());
    }

    @Test
    void testIterator() {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        for (int i = 0; i < 5; ++i) ll.addLast(i);

        ArrayList<Integer> buf = new ArrayList<>();
        for (Integer i : ll) {
            buf.add(i);
        }
        assertEquals("[0, 1, 2, 3, 4]", buf.toString());
    }

    @Test
    void testMerge() {
        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        list1.merge(list2);

        assertEquals("[1, 2, 3, 4, 5, 6]", list1.toString());
        assertTrue(list2.isEmpty());
        assertEquals(6, list1.size());
    }


}
