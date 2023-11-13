package MapCheieVal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapCheieVal {
    public static void main(String[] args){
        Map<String, Integer> Note = new HashMap<String, Integer>();

        Note.put("Razvan", 10);
        Note.put("Fiona", 10);
        Note.put("David", 8);
        System.out.println(Note);

        System.out.println("Nota lui Razvan este: " + Note.get("Razvan"));

        Map<String, Integer> note = Note.entrySet().stream().filter(nota -> nota.getValue().equals(10)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Cei care au nota 10 sunt: " + note);
    }
}
