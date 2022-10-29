package org.example;

public class Racun {
    public Racun(Long a, Osoba o){
       brojRacuna=a;
       korisnikRacuna=o;
       stanjeRacuna=0;
       odobrenjePrekoracenja=false;
    }
    public Racun(Racun rac){
        brojRacuna=rac.brojRacuna;
        korisnikRacuna=rac.korisnikRacuna;
        stanjeRacuna=rac.stanjeRacuna;
        odobrenjePrekoracenja=rac.odobrenjePrekoracenja;
    }
    private static boolean provjeriOdobrenjePrekoracenja(Double a){
        return true;
    }
    public void odobriPrekoracenje(double s){
        if(provjeriOdobrenjePrekoracenja(s))
            odobrenjePrekoracenja=true;
        else
            odobrenjePrekoracenja=false;
    }
    public boolean izvrsiUplatu(double a){
        return true;
    }
    public boolean izvrsiIsplatu(double a){
        return true;
    }
    public Long brojRacuna;
    public Osoba korisnikRacuna;
    public boolean odobrenjePrekoracenja;
    public double stanjeRacuna;
}
