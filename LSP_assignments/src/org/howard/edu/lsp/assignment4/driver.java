package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;

public class driver {

    public static void main(String[] args) {
        // Create an IntegerSet using the default constructor
        IntegerSet mySet = new IntegerSet();
        System.out.println("Original Set: " + mySet);

        // Add elements to the set
        mySet.add(5);
        mySet.add(10);
        mySet.add(4210);
        mySet.add(9999);
        mySet.add(3);
        mySet.add(8);
        System.out.println("After adding elements: " + mySet);

        // Test length and isEmpty methods
        System.out.println("Length of the set: " + mySet.length());
        System.out.println("Is the set empty? " + mySet.isEmpty());

        // Test smallest and largest methods
        try {
            System.out.println("Smallest element: " + mySet.smallest());
            System.out.println("Largest element: " + mySet.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test contains method
        System.out.println("Does the set contain 3? " + mySet.contains(3));
        System.out.println("Does the set contain 7? " + mySet.contains(7));

        // Test removing an item from the set
        mySet.remove(3);
        System.out.println("After removing 3: " + mySet);

        // Test clear method
        mySet.clear();
        System.out.println("After clearing the set: " + mySet);

        // Create a new set using the ArrayList constructor
        ArrayList<Integer> initialList = new ArrayList<>();
        initialList.add(15);
        initialList.add(20);
        initialList.add(10);
        IntegerSet newSet = new IntegerSet(initialList);
        System.out.println("New set created with ArrayList constructor: " + newSet);
    }
}
