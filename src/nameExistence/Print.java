package nameExistence;

public class Print {
    public static void main(String[] args) {
        System.out.print("  4. Parcurgerea unei hărți\n" +
                "Folosește un HashMap care stochează numele și vârstele unor persoane.\n" +
                "•\tParcurge perechile cheie-valoare folosind un Iterator.\n" +
                "•\tElimină din hartă persoanele cu vârsta mai mică de 18 ani.\n");

        PeopleManager peopleManager = new PeopleManager();

        //Adaugarea persoanelor
        peopleManager.addPerson(" Ana ",16);
        peopleManager.addPerson(" Mihai ",21);
        peopleManager.addPerson(" Ioana ",17);
        peopleManager.addPerson(" Andrei ",25);
        peopleManager.addPerson(" Maria ",19);

        //Afisarea persoanelor
        System.out.println("  Persoanele:: " );
        peopleManager.showPeople();

        //Eliminarea persoanelor
        peopleManager.deletePerson();

        //Afisarea persoanelor dupa excludere
        System.out.print("\n  Persoanele dupa excludere:: \n");
        peopleManager.showPeople();
    }
}
