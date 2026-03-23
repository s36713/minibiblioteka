public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaksiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaksiazek = 0;

    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaksiazek < ksiazki.length) {
            ksiazki[liczbaksiazek] = ksiazka;
            liczbaksiazek++;
        } else {
            System.out.println("Nie ma miejsca w bibliotece");

        }

    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaksiazek; i++) {
            System.out.println(ksiazki[i]);

        }

    }

    public void znajdzksiazkepotytule(String tytul) {
        boolean znaleziona = false;
        for (int i = 0; i < liczbaksiazek; i++) {
            if (ksiazki[i].tytul.equalsIgnoreCase(tytul)) {
                System.out.println("Znaleziono ksiazke: " + ksiazki[i]);
                znaleziona = true;
                break;
            }
        }
        if (!znaleziona) {
            System.out.println("Nie znaleziono ksiazke: " + tytul);
        }

    }

    public int policzDostepneKsiazki() {
        return liczbaksiazek;
    }
    public void wypozyczKsiazke(String tytul,Czytelnik czytelnik) {
        for (int i = 0; i < liczbaksiazek; i++) {
            if (ksiazki[i].tytul.equals(tytul)) {
                if (ksiazki[i].wypozycz()) {
                    czytelnik.zwiekszLiczbeWypozyczen();
                    System.out.println("Wypozyczono: " + tytul);
                    return;
                }

            }
        }
        System.out.println("Nie udalo sie wypozyczyc ksiazki pod tytuelm: " + tytul);
    }
    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        for (int i = 0; i < liczbaksiazek; i++) {
            if (ksiazki[i].tytul.equals(tytul)) {
                if (ksiazki[i].zwroc()) {
                    czytelnik.zmniejszLiczbeWypozyczen();
                    System.out.println("Zwrocono: " + tytul);
                    return;

                }
                System.out.println("Nie udalo sie zwrocic ksiazki pod tytulem: " + tytul);
            }
        }
    }
}
