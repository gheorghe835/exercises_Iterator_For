package nameExistence;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PeopleManager {
    //Harta pentru nume si virsta
    private HashMap<String,Integer> people;

    //Constructor

    public PeopleManager() {
        people = new HashMap<>();
    }

    //Metoda de adaugare a unei persoane
    public void addPerson(String name,int age){
        people.put(name,age);
    }

    //Metoda de afisarea persoanelor
    public void showPeople(){
        System.out.println("  Persoanele din harta:: " + people);
    }

    //Metoda de eliminare a persoanelor
    public void deletePerson(){
        Iterator<Map.Entry<String,Integer>> iterator = people.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            if (entry.getValue() < 18){
                iterator.remove();
            }
        }
    }
}
