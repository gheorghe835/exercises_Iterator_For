package nameExistence;

import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.print("  4. Parcurgerea unei hărți\n" +
                "Folosește un HashMap care stochează numele și vârstele unor persoane.\n" +
                "•\tParcurge perechile cheie-valoare folosind un Iterator.\n" +
                "•\tElimină din hartă persoanele cu vârsta mai mică de 18 ani.\n");

        PeopleManager peopleManager = new PeopleManager();
        Scanner scanner = new Scanner(System.in);

        peopleManager.addPerson(" Ana ", 16);
        peopleManager.addPerson(" Mihai ", 21);
        peopleManager.addPerson(" Ioana ", 17);
        peopleManager.addPerson(" Andrei ", 25);
        peopleManager.addPerson(" Maria ", 19);

        System.out.println("  Persoanele existente:: ");
        peopleManager.showPeople();

        String name = "";
        int age = 0;

        while (true) {
            System.out.println("  \nAlegeți o opțiune::");
            System.out.println(" 1.  Introduceți numele:: ");
            System.out.println(" 2.  Introduceți vârsta:: ");
            System.out.println(" 0.  Ieșire din meniu");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Introduceți numele persoanei: ");
                    name = scanner.nextLine();
                    System.out.println("Numele introdus este: " + name);
                    break;

                case 2:
                    if (name.isEmpty()) {
                        System.out.println("  Introduceți un nume.");
                    } else {
                        System.out.println("  Introduceți vârsta:: ");
                        age = scanner.nextInt();
                        scanner.nextLine();
                        peopleManager.addPerson(name, age);
                        System.out.println("  Persoana:: " + name + ", cu vârsta:: " + age + " a fost adăugată.");
                        name = "";
                    }
                    break;

                case 0:
                    System.out.println("\n Persoanele înainte de eliminare:: ");
                    peopleManager.showPeople();

                    ArrayList<String> deletePeople = peopleManager.deletePerson();

                    System.out.println("\n  Persoanele eliminate:: ");
                    for (String delete : deletePeople) {
                        System.out.println(delete);
                    }

                    System.out.println("\n  Persoanele după eliminare:: ");
                    peopleManager.showPeople();

                    System.out.println("  Programul s-a încheiat.");
                    return;

                default:
                    System.out.println("  Opțiune invalidă. Alegeți:: 1(nume), 2(vârstă), 0(ieșire)");
            }
        }


    }
}
