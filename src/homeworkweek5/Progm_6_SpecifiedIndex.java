package homeworkweek5;

import java.util.ArrayList;
import java.util.Scanner;

public class Progm_6_SpecifiedIndex {


            public static void main(String[] args) {
            // Create a new ArrayList
            ArrayList list = new ArrayList();

            // Add some colors to the ArrayList
            list.add("Java");
            list.add("Pyton");
            list.add("50");
            list.add("True");
            list.add("H");

                System.out.println("Enter the value you would like to print : ");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                System.out.println(list.get(i));



        }
    }



