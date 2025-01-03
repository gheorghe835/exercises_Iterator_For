package checkExistence;

import java.util.HashSet;
import java.util.Scanner;

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

         //Afisarea setului initial
         System.out.print("  Setul initial:: " + numbers + "\n");

         //Introducerea unui numar
         Scanner scanner = new Scanner(System.in);

         while (true){
             System.out.print("  Introduceti un numar(00 pentru a iesi):: ");
             int input = scanner.nextInt();
             if (input == 00){
                 break;
             }else {
                 //Afisarea setului initial
                 System.out.print("  Setul initial:: " + numbers + "\n");

                 //Verificarea numarului daca exista
                 if (numbers.contains(input)){
                     System.out.println("  Numarul:: " + input + "deja exista in set.");
                 }
                 else {
                     numbers.add(input);
                     System.out.println("  Numarul:: " + input + " nu exista. Numarul:: " + input + " a fost adaugat in set.");
                 }
                 //Afisarea setului actualizat
                 System.out.print("  Setul actualizat:: " + numbers + "\n");
             }
         }

         /*
         //Afisarea setului initial
         System.out.print("  Setul initial:: " + numbers + "\n");

         //Verificarea numarului daca exista
         if (numbers.contains(input)){
             System.out.println("  Numarul:: " + input + "deja exista in set.");
         }
         else {
             numbers.add(input);
             System.out.println("  Numarul:: " + input + " nu exista. Numarul:: " + input + " a fost adaugat in set.");
         }
         //Afisarea setului actualizat
         System.out.print("  Setul actualizat:: " + numbers + "\n");*/


    }
}
