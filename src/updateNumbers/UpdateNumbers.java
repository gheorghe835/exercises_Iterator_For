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
        System.out.print("     Lista initiala:: " + numbers + "\n");

        //Gasirea si actualizarea numerelor pare
        for (int i = 0; i<numbers.size(); i++){
            int number = numbers.get(i);
            if (number %2 == 0){
                numbers.set(i,number + 10);
            }
        }

        //Afisarea listei actualizate
        System.out.print("  lista actualizata:: " + numbers);
    }
}
