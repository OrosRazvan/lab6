package MeniuStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeniuStudent {

    public static void Adaugare() {
            Map<String, Integer> Student = new HashMap<String, Integer>();

            Scanner scanner0 = new Scanner(System.in);
            System.out.println("Cati introduceti: ");
            int n = scanner0.nextInt();

            for (int i = 0; i < n; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduceti numele: ");
                String nume = scanner.nextLine();

                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Introduceti Varsta: ");
                Integer varsta = scanner1.nextInt();

                Student.put(nume, Integer.valueOf(varsta));
            }

            System.out.println(Student);

    }

    public static void Afisare(){
        Map<String, Integer> Student = new HashMap<String, Integer>();

        Scanner scanner0 = new Scanner(System.in);
        System.out.println("Introduceti varsta pe care doriti sa o cautati: ");
        int x = scanner0.nextInt();
        }
    }


    public static void main(String[] args) {
        Map<String, Integer> Student = new HashMap<String, Integer>();

        int optiune;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti optiunea: ");
            optiune = scanner.nextInt();
            System.out.println("Meniu: ");
            System.out.println("1.Adaugare student: ");
            System.out.println("2.Afisare detalii student: ");
            System.out.println("3.Iesire: ");
            switch (optiune) {
                case 1:
                    Adaugare();
                    break;
                case 2:
                    Afisare();
                    break;
                case 3:
                    System.out.println("Iesire");
                    break;

                default:
                    System.out.println("Nu exista aceasta optiune");
            }
        } while (optiune != 3);
    }
}
