package cz.itnetwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MozekPojisteni mozek = new MozekPojisteni();
        Scanner sc = new Scanner(System.in);
        String volba;

        // naplnění kolekce
        mozek.vycistiSeznamPoj();
        mozek.nasypPojisteneho("Amélie", "Monmartrová", 21, "724669905");
        mozek.nasypPojisteneho("Václav", "Kouzelný", 32, "605123456");
        mozek.nasypPojisteneho("Barbora", "Veselá", 28, "777987654");
        mozek.nasypPojisteneho("Tomáš", "Marný", 40, "736111222");
        mozek.nasypPojisteneho("Eva", "Nováková", 35, "608333444");
        mozek.nasypPojisteneho("Filip", "Krátký", 25, "775555888");
        mozek.nasypPojisteneho("Zuzana", "Sluneční", 29, "721999000");
        mozek.nasypPojisteneho("Jiří", "Šťastný", 45, "603111222");
        mozek.nasypPojisteneho("Klára", "Mrkvová", 22, "775444999");
        mozek.nasypPojisteneho("Jakub", "Živý", 27, "732222111");

        // úvod
        System.out.printf("%n%nVÍTEJ V APLIKACI POJIŠŤOVNA ŠTĚSTÍ%n%n");

        // vlastní tělo programu
        do {
            System.out.println("Vyber možnost:");
            System.out.println("1. Vytvořit nového pojištěného");
            System.out.println("2. Zobrazit seznam pojištěných");
            System.out.println("3. Vyhledat pojištěného");
            System.out.println("4. Ukončit program");

            volba = sc.next();

            switch (volba) {
                case "1":
                    // vytvořit nového
                    System.out.print("Zadej jméno: ");
                    String jmeno = sc.next();
                    System.out.print("Zadej příjmení: ");
                    String prijmeni = sc.next();
                    System.out.print("Zadej věk: ");
                    int vek = sc.nextInt();
                    System.out.print("Zadej telefonní číslo: ");
                    String telefonniCislo = sc.next();
                    mozek.vytvorPojisteneho(jmeno, prijmeni, vek, telefonniCislo);
                    System.out.printf("%n");
                    break;

                case "2":
                    // zobrazit seznam
                    mozek.zobrazSeznamPojistenych();
                    System.out.printf("%n");
                    break;

                case "3":
                    // vyhledat
                    System.out.print("Zadej jméno pro vyhledání: ");
                    String hledaneJmeno = sc.next();
                    System.out.print("Zadej příjmení pro vyhledání: ");
                    String hledanePrijmeni = sc.next();
                    mozek.vyhledejPojisteneho(hledaneJmeno, hledanePrijmeni);
                    System.out.printf("%n");
                    break;

                case "4":
                    // ukončit program
                    System.out.println("Na shledanou!");
                    break;

                default:
                    System.out.println("Neplatná volba. Zkus to znovu:");
            }
        } while (!volba.equals("4"));

        sc.close();


    // konec psvm
    }
// konec Main
}
