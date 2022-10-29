package org.example;

import java.util.List;

public class Banka {
    private long brojRacuna;
    public List<Korisnik> k;
    public List<Uposlenik> u;
    public Banka(){}
    public Korisnik kreirajNovogKorisnika (String a, String b){
        Korisnik kor=new Korisnik(a,b);
        k.add(kor);
        return kor;
    }
    public Uposlenik kreirajNovogUposlenika (String a, String b){
        Uposlenik up=new Uposlenik(a,b);
        u.add(up);
        return up;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik a){
        Racun ur=new Racun(Long.valueOf(9393), a);
        a.DodajRacun(ur);
        return ur;
    }

}
