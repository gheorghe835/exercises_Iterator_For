package wordFilter;

import java.util.ArrayList;
import java.util.List;

import static wordFilter.WordFilter.deleteShortWords;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Eliminarea elementelor folosind Iterator\n" +
                "Creează un program care primește o listă de cuvinte și:\n" +
                "•\tParcurge lista folosind un Iterator.\n" +
                "•\tElimină toate cuvintele care au mai puțin de 4 caractere.");
        // Exemplu de listă de cuvinte
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        words.add("fructe");
        words.add("pe");
        words.add("masă");

        //Afisarea listei initiale
        System.out.print("  Lista initiala:: \n" + words);

        //Apelarea metodei pentru a elimina cuvintele scurte
        deleteShortWords(words);

        //Afisarea listei dupa eliminare
        System.out.print("\n  Lista dupa eliminare:: \n" + words);
    }
}
