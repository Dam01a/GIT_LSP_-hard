package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class IntegerSetTest {
    private IntegerSet emptySet;
    private IntegerSet populatedSet;

    @Before
    public void setUp() {
        emptySet = new IntegerSet();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        populatedSet = new IntegerSet(values);
    }

    @Test
    public void testClear() {
        populatedSet.clear();
        assertTrue(populatedSet.isEmpty());
    }

    @Test
    public void testLength() {
        assertEquals(0, emptySet.length());
        assertEquals(3, populatedSet.length());
    }

    @Test
    public void testEquals() {
        IntegerSet anotherEmptySet = new IntegerSet();
        assertTrue(emptySet.equals(anotherEmptySet));
        assertFalse(emptySet.equals(populatedSet));
    }

    @Test
    public void testContains() {
        assertTrue(populatedSet.contains(1));
        assertFalse(emptySet.contains(1));
    }

    @Test(expected = IntegerSetException.class)
    public void testLargestWithEmptySet() {
        emptySet.largest();
    }

    @Test
    public void testLargest() {
        assertEquals(3, populatedSet.largest());
    }

    @Test(expected = IntegerSetException.class)
    public void testSmallestWithEmptySet() {
        emptySet.smallest();
    }

    @Test
    public void testSmallest() {
        assertEquals(1, populatedSet.smallest());
    }

    @Test
    public void testAdd() {
        emptySet.add(1);
        assertTrue(emptySet.contains(1));
    }

    @Test
    public void testRemove() {
        populatedSet.remove(2);
        assertFalse(populatedSet.contains(2));
    }

    @Test
    public void testUnion() {
        IntegerSet anotherSet = new IntegerSet();
        anotherSet.add(3);
        anotherSet.add(4);
        populatedSet.union(anotherSet);
        assertTrue(populatedSet.contains(4));
    }

    @Test
    public void testIntersect() {
        IntegerSet anotherSet = new IntegerSet();
        anotherSet.add(2);
        anotherSet.add(3);
        populatedSet.intersect(anotherSet);
        assertFalse(populatedSet.contains(1));
    }

    @Test
    public void testDiff() {
        IntegerSet anotherSet = new IntegerSet();
        anotherSet.add(2);
        anotherSet.add(4);
        populatedSet.diff(anotherSet);
        assertFalse(populatedSet.contains(2));
    }

    @Test
    public void testComplement() {
        IntegerSet anotherSet = new IntegerSet();
        anotherSet.add(2);
        anotherSet.add(3);
        populatedSet.complement(anotherSet);
        assertTrue(populatedSet.contains(3));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptySet.isEmpty());
        assertFalse(populatedSet.isEmpty());
    }

    @Test
    public void testToString() {
        assertEquals("[]", emptySet.toString());
        assertEquals("[1, 2, 3]", populatedSet.toString());
    }
}
