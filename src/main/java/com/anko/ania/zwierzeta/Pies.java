package com.anko.ania.zwierzeta;

public class Pies {

    private int wiek;
    private String imie;

    public Pies(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public void szczek() {
        System.out.println("SZCZEK!");
    }
}
