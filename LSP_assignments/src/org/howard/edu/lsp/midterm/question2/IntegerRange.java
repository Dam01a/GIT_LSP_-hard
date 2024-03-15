package org.howard.edu.lsp.midterm.question2;

/**
 * Represents an integer range with a lower bound and an upper bound.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower bound and upper bound.
     *
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the range contains the specified value.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        return contains(((IntegerRange) other).lowerBound) ||
               contains(((IntegerRange) other).upperBound);
    }

    /**
     * Calculates the number of integers in the range.
     *
     * @return the size of the range
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if this range is equal to another object.
     *
     * @param apogee the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange range = (IntegerRange) obj;
        return lowerBound == range.lowerBound && upperBound == range.upperBound;
    }
}
