package org.example;

public abstract class Osoba {
    private String ime, prezime;
    Osoba(String a,String b){
        ime=a;
        prezime=b;
    }
    @Override
    public String toString() {
        return ime+" "+prezime;
    }
};
