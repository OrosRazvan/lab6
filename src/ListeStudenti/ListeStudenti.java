package ListeStudenti;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListeStudenti {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("Oros Razvan");
        student.add("Iuhasz Riana");
        student.add("Bianca Dragos");

        student.remove(2);

        List<String> Student = (student.stream().filter(stu -> stu.startsWith("I"))).collect(Collectors.toList());
        System.out.println("Nume studenti care incep cu I: " + Student);
    }
}
