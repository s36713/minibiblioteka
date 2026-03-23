public class Ksiazka {
    public String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;


    }

    public void wypiszInfo() {
        System.out.println("Tytul:" + this.tytul);
        System.out.println("Autor:" + this.autor);
        System.out.println("Liczba stron:" + this.liczbaStron);
        System.out.println("Dostepna:" + this.dostepna);

    }

    boolean wypozycz() {
        if (dostepna) {
            System.out.println("Ksiazka jest dostepna.");
            return dostepna = false;

        } else {
            System.out.println("Ksiazka jest niedostepna");
            return false;

        }

    }

    public boolean zwroc() {
        if (!dostepna) {
            this.dostepna = true;
            return true;
        }
        return false;
    }
}