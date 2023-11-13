package SetCarti;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCarti {
    public static void main(String[] args){
        HashSet<String> carti = new HashSet<String>();
        carti.add("Micul Print");
        carti.add("De la idee la bani");
        carti.add("Zece negri mititei");
        carti.add("Micul Print");
        System.out.println(carti);

        Set<String> Carti = (carti.stream().filter(carte -> carte.endsWith("i"))).collect(Collectors.toSet());
        System.out.println("Nume carti care se termina cu i: " + Carti);


    }
}
