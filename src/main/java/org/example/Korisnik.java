package org.example;

public class Korisnik extends Osoba{
    public Racun racun;
    public Korisnik(String a, String b){
        super(a,b);
    }
    public void DodajRacun(Racun rac){
        racun=new Racun(rac);
    }
};
