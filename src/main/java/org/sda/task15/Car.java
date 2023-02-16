package org.sda.task15;

/**
 * ZADANIE 15.
 * Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp.
 * Każdy z pojazdów ma własne parametry np. cena, moc, itp.
 * Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
 * Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
 * Dodatkowo w ramach klasy enum powinna być zadeklarowana i
 * zaimplementowana metoda boolean isFasterThan().
 * Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym, że
 * wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie.
 * W tym celu skorzystaj z metody compareTo().
 */
public enum Car {

    FERRARI(300, 500000.0, true),
    PORSCHE(350, 400000.0, true);
    //TODO wymyślić wartości dla samochodów poniżej:
//    MERCEDES,
//    BMW,
//    OPEL,
//    FIAT,
//    TOYOTA

    private Integer moc;
    private Double cena;
    private boolean premium;

    Car(Integer moc, Double cena, boolean premium) {
        this.moc = moc;
        this.cena = cena;
        this.premium = premium;
    }

    public Integer getMoc() {
        return moc;
    }

    public Double getCena() {
        return cena;
    }

    public boolean isPremium() {
        return this.premium;
    }

    public boolean isDefault() {
        return !this.premium;
    }

    public boolean isFasterThan(Car car) {
        int result = this.moc.compareTo(car.getMoc());
        return result > 0;
    }
}
