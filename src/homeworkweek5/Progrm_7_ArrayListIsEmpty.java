package homeworkweek5;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Progrm_7_ArrayListIsEmpty {

            public static void main(String[] args) {
            // Create a new ArrayList
            ArrayList list = new ArrayList();

            // Add ArrayList
                list.add("Prime");
                list.add("10");
                list.add("True");
                list.add("25");
                list.add("Class");

                if(list.isEmpty()){
                    System.out.println("List is Empty = No");
                }else {
                    System.out.println("List is not Empty = Yes ");
                }


        }
    }


