package checkExistence;

import java.util.HashSet;

public class CheckExistence {
     public static void main(String[] args) {
        System.out.println("  3. Verificare existență într-un Set\n" +
                "Creează un HashSet care stochează o serie de numere întregi.\n" +
                "•\tVerifică, folosind metoda contains, dacă un anumit număr (dat de utilizator) există în set.\n" +
                "•\tDacă numărul nu există, adaugă-l în set și afișează noul set.\n");

         //Crearea unui HashSet ce va stoca numere
         HashSet<Integer> numbers = new HashSet<>();

         //Introducem citeva numere
         numbers.add(2);
         numbers.add(5);
         numbers.add(6);
         numbers.add(7);
         numbers.add(8);
         numbers.add(9);
         

    }
}
