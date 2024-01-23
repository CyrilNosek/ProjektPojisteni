package cz.itnetwork;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    // konstruktor
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Příjmení: " + prijmeni + ", Věk: " + vek + ", Telefonní číslo: " + telefonniCislo;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }


}


