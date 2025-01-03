package nameExistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PeopleManager {
    private HashMap<String, Integer> people;

    public PeopleManager() {
        people = new HashMap<>();
    }

    public void addPerson(String name, int age) {
        people.put(name, age);
    }

    public void showPeople() {
        System.out.println("  Persoanele din hartă:: " + people);
    }

    public ArrayList<String> deletePerson() {
        Iterator<Map.Entry<String, Integer>> iterator = people.entrySet().iterator();
        ArrayList<String> removedPeople = new ArrayList<>();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 18) {
                removedPeople.add(entry.getKey() + " (vârstă: " + entry.getValue() + ")");
                iterator.remove();
            }
        }

        return removedPeople;
    }
}
