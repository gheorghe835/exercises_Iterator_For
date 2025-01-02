package wordFilter;

import java.util.Iterator;
import java.util.List;

public class WordFilter {
    public static void deleteShortWords(List<String> words){

        //crearea unui iterator pentru a parcurge lista de cuvinte
        Iterator<String> iterator = words.iterator();

        //Parcurgerea listei cu iterator
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.length() < 4){
                iterator.remove();
            }
        }
    }
}
