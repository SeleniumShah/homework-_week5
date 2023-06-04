package homeworkweek5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Progrm_5_Iterater {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList list = new ArrayList<>();

        // Add value to the ArrayList
        list.add("Prime");
        list.add("10");
        list.add("True");
        list.add("25");
        list.add("Class");


        // Get an Iterator object for the ArrayList
        Iterator iterator = list.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("List in the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

