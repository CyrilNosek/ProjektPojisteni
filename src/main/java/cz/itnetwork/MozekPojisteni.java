package cz.itnetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class MozekPojisteni {
    private ArrayList<Pojisteny> seznamPojistenych;

   // konstruktor
    public MozekPojisteni() {
        this.seznamPojistenych = new ArrayList<>();
    }

    // metoda pro vytvoření nového pojištěného
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        Pojisteny novyPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);

        //validace
        if (validujJmeno(jmeno, prijmeni)) {
            seznamPojistenych.add(novyPojisteny);
            System.out.println("Nový pojištěný byl vytvořen: " + novyPojisteny);
        } else {
            System.out.println("Chyba: Neplatné jméno nebo příjmení. Pojištěný nebyl vytvořen.");
        }
    }

    // metoda pro vyčištění kolekce
    public void vycistiSeznamPoj() {seznamPojistenych.clear();}

    // metoda pro počáteční nasypání pojištěnců do kolekce
    public void nasypPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        Pojisteny novyVzorekPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        seznamPojistenych.add(novyVzorekPojisteny);
    }

    // metoda pro zobrazení seznamu pojištěných
    public void zobrazSeznamPojistenych() {
        System.out.println("Seznam všech pojištěných:");
        for (Pojisteny pojistenyTemp : seznamPojistenych) {
            System.out.println(pojistenyTemp);
        }
    }

    // metoda pro vyhledání pojištěného
    public void vyhledejPojisteneho(String hledaneJmeno, String hledanePrijmeni) {

        boolean castecnaShoda = false;
        boolean uplnaShoda = false;
        Scanner sc = new Scanner(System.in);

        for (Pojisteny pojistenyTemp : seznamPojistenych) {
            if (pojistenyTemp.getJmeno().equals(hledaneJmeno) && pojistenyTemp.getPrijmeni().equals(hledanePrijmeni)) {
                System.out.println("Nalezený pojištěný: " + pojistenyTemp);
                uplnaShoda = true;
            }
            if (pojistenyTemp.getJmeno().equals(hledaneJmeno) || pojistenyTemp.getPrijmeni().equals(hledanePrijmeni)) {
                castecnaShoda = true;
            }
        }
        if (!uplnaShoda) {
            System.out.println("Pojištěný s jménem " + hledaneJmeno + " a příjmením " + hledanePrijmeni + " nebyl nalezen.");
            if (castecnaShoda) {
                System.out.println("Přeješ si zobrazit částečné shody? ano/ne");
                if (sc.next().equals("ano")) {
                    for (Pojisteny pojistenyTemp : seznamPojistenych) {
                        if (pojistenyTemp.getJmeno().equals(hledaneJmeno) || pojistenyTemp.getPrijmeni().equals(hledanePrijmeni)) {
                            System.out.println("Nalezený pojištěný: " + pojistenyTemp);
                        }
                    }
                }
            }
        }
    }

    // validace jména
    public boolean validujJmeno(String jmeno, String prijmeni) {
        return !(jmeno.isEmpty() || prijmeni.isEmpty());
    }

}

