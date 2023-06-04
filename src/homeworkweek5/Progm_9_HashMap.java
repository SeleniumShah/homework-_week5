package homeworkweek5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Progm_9_HashMap {


    public static void main(String[] args) {
        hashMap();
    }

    public static void hashMap() {
        Map<String, Integer> people = new HashMap<>();
        people.put("Selenium", 01);
        people.put("Java", 02);
        people.put("Scrum", 03);
        people.put("Jira", 04);
        people.put("PostMan", 05);


        Iterator<Integer> iterator = people.values().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}