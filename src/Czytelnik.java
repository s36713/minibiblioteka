public class Czytelnik {
    private String Imie;
    private String Nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String Imie, String Nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane() {
        System.out.println("Imie: " + this.Imie);
        System.out.println("Nazwisko: " + this.Nazwisko);
        System.out.println("Numer Karty: " + this.numerKarty);
        System.out.println("Liczba wypozyczen: " + this.liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen() {
        this.liczbaWypozyczen++;
    }
    public void zmniejszLiczbeWypozyczen() {
        if (this.liczbaWypozyczen >0 ){
            this.liczbaWypozyczen--;
        }
    }
}
