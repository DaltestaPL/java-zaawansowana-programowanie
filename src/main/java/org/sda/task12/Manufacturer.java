package org.sda.task12;

import java.util.Objects;

public class Manufacturer {
    private String nazwa,  kraj;
    private int rok;

    public Manufacturer(String nazwa, int rok, String kraj) {
        this.nazwa = nazwa;
        this.rok = rok;
        this.kraj = kraj;
    }

    public Manufacturer(String nazwa, String kraj, int rok) {
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.rok = rok;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer that)) return false;
        return rok == that.rok && Objects.equals(nazwa, that.nazwa) && Objects.equals(kraj, that.kraj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, kraj, rok);
    }
}
