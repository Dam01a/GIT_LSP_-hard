package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    // Store the set elements in an ArrayList
    /**
     * Internal representation of the set as an ArrayList.
     */
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    /**
     * Constructs an empty IntegerSet.
     */
    public IntegerSet() {

    }

    // Constructor if you want to pass in already initialized set
    /**
     * Constructs an IntegerSet with an already initialized set.
     * 
     * @param set The initial set of integers.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set
    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    /**
     * Returns the number of elements in the set.
     * 
     * @return The length of the set.
     */
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order. This overrides the equal
     * method from the Object class.
     */
    @Override
    /**
     * Compares this IntegerSet with another object for equality. Two sets are equal
     * if they contain all of the same values in any order.
     * 
     * @param o The object to compare.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        IntegerSet that = (IntegerSet) o;

        return set.equals(that.set);
    }

    // Returns true if the set contains the value, otherwise false
    /**
     * Checks if the set contains a specified value.
     * 
     * @param value The value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws an IntegerSetException if the set is empty
    /**
     * Returns the largest element in the set.
     * 
     * @return The largest element in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int value : set) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Returns the smallest item in the set; Throws an IntegerSetException if the set is empty
    /**
     * Returns the smallest element in the set.
     * 
     * @return The smallest element in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int value : set) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Adds an item to the set or does nothing if already there
    /**
     * Adds an element to the set if it is not already present.
     * 
     * @param item The item to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    /**
     * Removes an element from the set if it is present.
     * 
     * @param item The item to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union
    /**
     * Performs the union of this set and another set.
     * 
     * @param intSetb The set to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int value : intSetb.set) {
            add(value);
        }
    }

    // Set intersection, all elements in s1 and s2
    /**
     * Performs the intersection of this set and another set.
     * 
     * @param intSetb The set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Set difference, i.e., s1 –s2
    /**
     * Performs the set difference (s1 - s2).
     * 
     * @param intSetb The set to subtract from this set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1
    /**
     * Computes the complement of this set with respect to another set.
     * 
     * @param intSetb The set for which to compute the complement.
     */
    public void complement(IntegerSet intSetb) {
        IntegerSet tempSet = new IntegerSet(new ArrayList<>(intSetb.set));
        tempSet.diff(this);
        set = tempSet.set;
    }

    // Returns true if the set is empty, false otherwise
    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. This overrides the equal method from
    // the Object class.
    @Override
    /**
     * Returns a string representation of the set.
     * 
     * @return A string representation of the set.
     */
    public String toString() {
        return set.toString();
    }
}
