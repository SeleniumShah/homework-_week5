package homeworkweek5;


/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;


public class Progm_4_Colours {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println("Colors in the collection:");

        for (String colour : list) {

            System.out.println(colour);

            }


    }
}





