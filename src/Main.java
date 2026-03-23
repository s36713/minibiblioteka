public class Main {
    public static void main(String[] args) {
        Ksiazka Dzuma = new Ksiazka("Dzuma", "Albert Camus", 312, true);
        Ksiazka Hobbit = new Ksiazka("Hobbit", "J.R.R. Tolkien", 456, true);
        Ksiazka HarryPotter = new Ksiazka("Harry Potter.", " J.K.Rowling", 320, true);

        System.out.println("Informacje");
        Dzuma.wypiszInfo();
        Hobbit.wypiszInfo();
        HarryPotter.wypiszInfo();

        Czytelnik c1 = new Czytelnik("Bartek", "Kowalski", 101, 0);
        Czytelnik c2 = new Czytelnik("Rafal", "Kwiatkowski", 202, 5);


        c1.wypiszDane();
        c2.wypiszDane();

        Biblioteka mojaBiblioteka = new Biblioteka(10);
        mojaBiblioteka.dodajKsiazke(Dzuma);
       mojaBiblioteka.dodajKsiazke(Hobbit);
        mojaBiblioteka.dodajKsiazke(HarryPotter);

        mojaBiblioteka.wypozyczKsiazke("Hobbit", c1);

        mojaBiblioteka.wypiszDostepneKsiazki();
        c1.wypiszDane();

        mojaBiblioteka.zwrocKsiazke("Dzuma", c2);
        c2.wypiszDane();



    }


}