package homeworkweek5;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * <p>
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Progm_11_CompareArrayList {

    public static void compare() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the ArrayLists
        boolean areEqual = c1.equals(c2);

        // Print the result
        System.out.println("ArrayList c1: " + c1);
        System.out.println("ArrayList c2: " + c2);
        if (areEqual) {
            System.out.println("c1 and c2 are equal.");
        } else {
            System.out.println("c1 and c2 are not equal.");
        }
    }

    public static void main(String[] args) {
        compare();
    }


    }



