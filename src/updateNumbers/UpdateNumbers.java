package updateNumbers;

import java.util.ArrayList;

public class UpdateNumbers {
    public static void main(String[] args) {
        System.out.println("2. Căutare și actualizare în listă\n" +
                "Folosind un ArrayList de numere întregi:\n" +
                "•\tGăsește toate numerele pare folosind o buclă for-each.\n" +
                "•\tAdaugă 10 la fiecare dintre aceste numere și înlocuiește-le în listă.\n");
        //Crearea listei de numere intregi
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(15);
        numbers.add(20);

        //Afisarea listei initiale
        System.out.print("  Lista initiala:: " + numbers);
    }
}
